package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import br.inf.portalfiscal.nfe.xml.pl006q.nfes.TNFe;
import br.inf.portalfiscal.nfe.xml.pl006q.nfes.TNFe.InfNFe.Det;
import br.inf.portalfiscal.nfe.xml.pl006q.nfes.TNFe.InfNFe.Det.Imposto.COFINS;
import br.inf.portalfiscal.nfe.xml.pl006q.nfes.TNFe.InfNFe.Det.Imposto.PIS;
import br.inf.portalfiscal.nfe.xml.pl006q.nfes.TNFe.InfNFe.Det.Prod;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 17/11/2011 20:26:48
 * @author Murilo
 */
public class ArquivoEfdPisCofins {

    private final EmpresaEfdPisCofins empresa;
    
    //Jennifer Santos
    //Inicio
    private final ContabilistaEfdPisCofins contabilista = null;
    //Fim
    private final Date inicio;
    private final Date fim;
    private List<TNFe> nfes;
    private RegistroA170 registroA170;

    /**
     * 
     * @param empresa - Empresa para a qual esta sendo criado o arquivo.
     * @param inicio - inicio do periodo para o qual esta sendo cirado o arquivo.
     * @param fim - data de termino do periodo;
     */
    public ArquivoEfdPisCofins(EmpresaEfdPisCofins empresa, Date inicio, Date fim) {
        this.empresa = empresa;
        this.inicio = inicio;
        this.fim = fim;
    }

    public boolean add(TNFe nfe) throws EfdPisCofinsException {
        if (nfe.getInfNFe() == null) {
            throw new EfdPisCofinsException("Nfe sem informacoes");
        }
        if (nfe.getInfNFe().getEmit() == null) {
            throw new EfdPisCofinsException("Nfe sem dados de emitente");
        }
        if (nfe.getInfNFe().getDest() == null) {
            throw new EfdPisCofinsException("Nfe sem dados de destinatario");
        }

        if (!empresa.getCNPJ().equals(nfe.getInfNFe().getEmit().getCNPJ())
                && !empresa.getCNPJ().equals(nfe.getInfNFe().getDest().getCNPJ())) {
            throw new EfdPisCofinsException("A Nfe nao tem a empresa atual como emitente/destinatario!");
        }

        if (nfe.getInfNFe().getIde().getDEmi() == null) {
            throw new EfdPisCofinsException("Nfe sem data de emissao");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = null;
        try {
            data = sdf.parse(nfe.getInfNFe().getIde().getDEmi());
        } catch (ParseException ex) {
            throw new EfdPisCofinsException("Erro ao tratar a data de emissao da NFe", ex);
        }
        if (data.before(inicio)) {
            throw new EfdPisCofinsException("Nfe emitida antes do inicio do periodo");
        }
        return getNfes().add(nfe);
    }

    private List<TNFe> getNfes() {
        if (this.nfes == null) {
            this.nfes = new ArrayList<TNFe>();
        }
        return this.nfes;
    }

    public StringBuilder getRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append(criaRegistro0000());
        //Jennifer Santos
        sb.append(criaRegistro0001());
        
        for (TNFe nfe : nfes) {
            List<Det> dets = nfe.getInfNFe().getDet();
            boolean saida = ehSaida(nfe);
            //Aqui vao os registros referentes ao cabecalho da NFe
            if (dets != null) {
                for (Det det : dets) {
                    //Aqui vao os registros referentes aos itens

                    if (det.getImposto().getPIS() != null || det.getImposto().getCOFINS() != null) {
                        sb.append(criaRegistroA171(det, saida));
                    }
                }
            }
        }
        return sb;
    }

    /**
     * Nao precisa de arquimentos pelo simples motivo
     * de todos os dados ja estarem disponiveis
     * @return 
     */
    private StringBuffer criaRegistro0000() {
        //Eh criado aqui o Registro0000 porque sera
        //utilizado apenas uma vez
        Registro0000 r = new Registro0000();
        LineModel lm = r.createModel();
        lm.setFieldValue(Registro0000.DT_INI, inicio);
        lm.setFieldValue(Registro0000.DT_FIN, fim);
        lm.setFieldValue(Registro0000.NOME, empresa.getNome());
        lm.setFieldValue(Registro0000.CNPJ, empresa.getCNPJ());
        lm.setFieldValue(Registro0000.COD_MUN, empresa.getCodigoMunicipio());
        lm.setFieldValue(Registro0000.UF, empresa.getUf());
        return lm.getRepresentation();
    }
    //Testes - Jennifer Santos
    //Início
    
    //REGISTRO 0001: ABERTURA DO BLOCO 0
    private StringBuffer criaRegistro0001() {
        //Restistro ocorre uma única vez
        Registro0001 reg = new Registro0001();
        LineModel line = reg.createModel();
        /* 
         * 0 - Bloco com dados informados;
         * 1 – Bloco sem dados informados.
         */
        line.setFieldValue(Registro0001.IND_MOV, 0);
        return line.getRepresentation();
    }
    //REGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO
    private StringBuffer criaRegistro0110() {
        //Restistro ocorre uma única vez
        Registro0110 reg = new Registro0110();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(Registro0110.COD_INC_TRIB, 2L);
        //03
        line.setFieldValue(Registro0110.IND_APRO_CRED, 2L);
        //04
        line.setFieldValue(Registro0110.COD_TIPO_CONT, 2L);
        //05
        line.setFieldValue(Registro0110.IND_REG_CUM, null);
        
        return line.getRepresentation();
    }
    //Testes Jennifer Santos
    //Término

    /**
     * Redebe como parametro o detalhamento de 
     * um item da NFe, pelo que consta na documentacao
     * este registro deve ter credito/debito de PIS/COFINS
     * senao nao crie o registro
     * @param det
     * @return 
     */
    private StringBuffer criaRegistroA171(Det det, boolean saida) {
        //Verifica se o archetype ja foi criado se nao for entao cria
        if (registroA170 == null) {
            registroA170 = new RegistroA170();
        }

        Prod prod = det.getProd();
        LineModel lm = registroA170.createModel();
        lm.setFieldValue(RegistroA170.NUM_ITEM, new Integer(det.getNItem()));
        lm.setFieldValue(RegistroA170.COD_ITEM, prod.getCProd());
        lm.setFieldValue(RegistroA170.DESCR_COMPL, prod.getXProd());
        lm.setFieldValue(RegistroA170.VL_ITEM, new Double(prod.getVProd()));
        //Pode nao haver desconto logo a tag no XML
        //estara nula consequentemente o atributo do obj tambem.
        if (prod.getVDesc() != null) {
            lm.setFieldValue(RegistroA170.VL_DESC, new Double(prod.getVDesc()));
        }

        //se eh nota de saida entao nao tem credito de imposto
        if (!saida) {
            //assumindo um valor por padrao
            lm.setFieldValue(RegistroA170.NAT_BC_CRED, BaseCalculoCredito.AQUISICAO_BENS_REVENDA);
            //0 para mercado interno
            //1 para importacao
            lm.setFieldValue(RegistroA170.IND_ORIG_CRED, "0");
        }
        PIS pis = det.getImposto().getPIS();
        if (pis != null) {
            if (pis.getPISNT() != null) {
                //verificar, pois acredito que neste caso nao
                //seja para criar o registro
                lm.setFieldValue(RegistroA170.CST_PIS, pis.getPISNT().getCST());
            } else if (pis.getPISAliq() != null) {
                lm.setFieldValue(RegistroA170.CST_PIS, pis.getPISAliq().getCST());
                lm.setFieldValue(RegistroA170.VL_BC_PIS, new Double(pis.getPISAliq().getVBC()));
                lm.setFieldValue(RegistroA170.ALIQ_PIS, new Double(pis.getPISAliq().getPPIS()));
                lm.setFieldValue(RegistroA170.VL_PIS, new Double(pis.getPISAliq().getVPIS()));
            } else if (pis.getPISOutr() != null) {
                lm.setFieldValue(RegistroA170.CST_PIS, pis.getPISOutr().getCST());
                lm.setFieldValue(RegistroA170.VL_BC_PIS, new Double(pis.getPISOutr().getVBC()));
                lm.setFieldValue(RegistroA170.ALIQ_PIS, new Double(pis.getPISOutr().getPPIS()));
                lm.setFieldValue(RegistroA170.VL_PIS, new Double(pis.getPISOutr().getVPIS()));
            } else if (pis.getPISQtde() != null) {
                lm.setFieldValue(RegistroA170.CST_PIS, pis.getPISQtde().getCST());
                lm.setFieldValue(RegistroA170.ALIQ_PIS, new Double(pis.getPISQtde().getVAliqProd()));
                lm.setFieldValue(RegistroA170.VL_PIS, new Double(pis.getPISQtde().getVPIS()));
            }
        }
        
        COFINS cofins = det.getImposto().getCOFINS();
        if (cofins != null) {
            if (cofins.getCOFINSNT() != null) {
                //verificar, pois acredito que neste caso nao
                //seja para criar o registro
                lm.setFieldValue(RegistroA170.CST_COFINS, cofins.getCOFINSNT().getCST());
            } else if (cofins.getCOFINSAliq() != null) {
                lm.setFieldValue(RegistroA170.CST_COFINS, cofins.getCOFINSAliq().getCST());
                lm.setFieldValue(RegistroA170.VL_BC_COFINS, new Double(cofins.getCOFINSAliq().getVBC()));
                lm.setFieldValue(RegistroA170.ALIQ_COFINS, new Double(cofins.getCOFINSAliq().getPCOFINS()));
                lm.setFieldValue(RegistroA170.VL_COFINS, new Double(cofins.getCOFINSAliq().getVCOFINS()));
            } else if (cofins.getCOFINSOutr() != null) {
                lm.setFieldValue(RegistroA170.CST_COFINS, cofins.getCOFINSOutr().getCST());
                lm.setFieldValue(RegistroA170.VL_BC_COFINS, new Double(cofins.getCOFINSOutr().getVBC()));
                lm.setFieldValue(RegistroA170.ALIQ_COFINS, new Double(cofins.getCOFINSOutr().getPCOFINS()));
                lm.setFieldValue(RegistroA170.VL_COFINS, new Double(cofins.getCOFINSOutr().getVCOFINS()));
            } else if (cofins.getCOFINSQtde() != null) {
                lm.setFieldValue(RegistroA170.CST_COFINS, cofins.getCOFINSQtde().getCST());
                lm.setFieldValue(RegistroA170.ALIQ_COFINS, new Double(cofins.getCOFINSQtde().getVAliqProd()));
                lm.setFieldValue(RegistroA170.VL_COFINS, new Double(cofins.getCOFINSQtde().getVCOFINS()));
            }
        }
        
        //Perguntar no escritorio de contabilidade
        //COD_CTA COdigo da conta analItica contAbil debitada/creditada
        //COD_CCUS Código do centro de custos

        return lm.getRepresentation();
    }

    private boolean ehSaida(TNFe nfe) {
        return empresa.getCNPJ().equals(nfe.getInfNFe().getEmit().getCNPJ());
    }
}
