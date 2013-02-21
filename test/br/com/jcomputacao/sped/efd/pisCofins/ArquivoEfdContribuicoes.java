package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class ArquivoEfdContribuicoes {
    
    private final EmpresaEfdPisCofins empresa;
    private final ContabilistaEfdPisCofins contabilista=null;
    private final ContratoEfdPisCofins contrato = null;
    
    /**Futuramente, creio que as informações do contabilista tenham 
     * origem do banco de dados. É possível ter vários contabilistas.
     */
    //ArrayList <ContabilistaEfdPisCofins> contabilistas = new ArrayList<ContabilistaEfdPisCofins>();
    private final Date inicio;
    private final Date fim;
    
    public ArquivoEfdContribuicoes(EmpresaEfdPisCofins empresa, Date inicio, Date fim){
        this.empresa = empresa;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public StringBuilder getRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append(criaRegistro0000());
        sb.append(criaRegistro0001()); 
        return sb;
    }
     //REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA PESSOA JURÍDICA
     private StringBuffer criaRegistro0000() {
         
        Registro0000 r = new Registro0000();
        LineModel line = r.createModel();
        //Versão do leiaute
        line.setFieldValue(Registro0000.COD_VER, 003);
        //Tipo de escrituração
        line.setFieldValue(Registro0000.TIPO_ESCRIT, 0);
        //Indicador de situação especial
        line.setFieldValue(Registro0000.IND_SIT_ESP, null);
        //Nº do recibo da escrituração anterior
        if (line.getFieldValueNumber(Registro0000.TIPO_ESCRIT).intValue()==1)
            /**Teste!
             * Verificar onde o número do recebimento da escrituração anterior será armazenado
             */
             line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, "11111111112222222222333333333344444444441");
        else
             line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, null); 
        line.setFieldValue(Registro0000.DT_INI, inicio);
        line.setFieldValue(Registro0000.DT_FIN, fim);
        line.setFieldValue(Registro0000.NOME, empresa.getNome());
        line.setFieldValue(Registro0000.CNPJ, empresa.getCNPJ());
        line.setFieldValue(Registro0000.COD_MUN, empresa.getCodigoMunicipio());
        line.setFieldValue(Registro0000.UF, empresa.getUf());
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
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
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO 0100: DADOS DO CONTABILISTA
    private StringBuffer criaRegistro0100(){
        
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0100.NOME, contabilista.getNome());
        //03
        line.setFieldValue(Registro0100.CPF, contabilista.getCpf());
        //04
        line.setFieldValue(Registro0100.CRC, contabilista.getCrc());
        //05
        line.setFieldValue(Registro0100.CNPJ, contabilista.getCnpj());
        //06
        line.setFieldValue(Registro0100.CEP, contabilista.getCep());
        //07
        line.setFieldValue(Registro0100.END, contabilista.getEndereco());
        //08
        line.setFieldValue(Registro0100.NUM, contabilista.getNumero());
        //09
        line.setFieldValue(Registro0100.COMPL, contabilista.getComplemento());
        //10
        line.setFieldValue(Registro0100.BAIRRO, contabilista.getBairro());
        //11
        line.setFieldValue(Registro0100.FONE, contabilista.getTelefone());
        //12
        line.setFieldValue(Registro0100.FAX, contabilista.getFax());
        //13
        line.setFieldValue(Registro0100.EMAIL, contabilista.getEmail());
        //14
        line.setFieldValue(Registro0100.COD_MUN, contabilista.getCodigoMunicipio());

        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO
    private StringBuffer criaRegistro0110() {
        //Restistro ocorre uma única vez
        Registro0110 reg = new Registro0110();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(Registro0110.COD_INC_TRIB, 2);
        //03
        line.setFieldValue(Registro0110.IND_APRO_CRED, null);
        //04
        line.setFieldValue(Registro0110.COD_TIPO_CONT, 1);
        //05
        line.setFieldValue(Registro0110.IND_REG_CUM, 1);
        
        return line.getRepresentation();
    }
    //REGISTRO 0140: TABELA DE CADASTRO DE ESTABELECIMENTO
    private StringBuffer criaRegistro0140(){
        Registro0140 reg = new Registro0140();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0140.COD_EST, null);
        //03
        line.setFieldValue(Registro0140.NOME, empresa.getNome());
        //04
        line.setFieldValue(Registro0140.CNPJ, empresa.getCNPJ());
        //05
        line.setFieldValue(Registro0140.UF, empresa.getUf());
        //06
        /**
         * VERIFICAR A EXISTÊNCIA DESTA IMPORMAÇÃO NO BANCO
         */
        line.setFieldValue(Registro0140.IE, null);
        //07
        line.setFieldValue(Registro0140.COD_MUN, empresa.getCodigoMunicipio());
        //08
        /**
         * VERIFICAR A EXISTÊNCIA DESTA IMPORMAÇÃO NO BANCO
         */
        line.setFieldValue(Registro0140.IM, null);
        //09
        line.setFieldValue(Registro0140.SUFRAMA, null);

        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO 0990: ENCERRAMENTO DO BLOCO 0
    /**Verificar o contador de blocos
     */
    private StringBuffer criaRegistro0990 (){
        Registro0990 reg = new Registro0990();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0990.QTD_LIN_0, 6);
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO A001: ABERTURA DO BLOCO A
    private StringBuffer criaRegistroA001(){
        RegistroA001 reg = new RegistroA001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroA001.IND_MOV, "1");
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO A990: ENCERRAMENTO DO BLOCO A
    /**Verificar o contador de blocos
     */
    private StringBuffer criaRegistroA990(){
        RegistroA990 reg = new RegistroA990();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroA990.QTD_LIN_A, 2);
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO C001: ABERTURA DO BLOCO C
    private StringBuffer criaRegistroC001 (){
        RegistroC001 reg = new RegistroC001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC001.IND_MOV, "1");
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO C990: ENCERRAMENTO DO BLOCO C
    private StringBuffer criaRegistroC990(){
        RegistroC990 reg = new RegistroC990();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC990.QTD_LIN_C, 2);
    
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO D001: ABERTURA DO BLOCO D
    private StringBuffer criaRegistroD001(){
        RegistroD001 reg = new RegistroD001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD001.IND_MOV, "1");

        StringBuffer sb = line.getRepresentation();

        return sb;
    }
    //REGISTRO D990: ENCERRAMENTO DO BLOCO D
    /**Verificar o contador de blocos
     */
    private StringBuffer criaRegistroD990(){
        RegistroD990 reg = new RegistroD990();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD990.QTD_LIN_D, 2);
    
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO F001: ABERTURA DO BLOCO F
    private StringBuffer criaRegistroF001(){
        RegistroF001 reg = new RegistroF001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    //REGISTRO F010: IDENTIFICAÇÃO DO ESTABELECIMENTO
    private StringBuffer criaRegistroF010(){
        RegistroF010 reg = new RegistroF010();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF010.CNPJ, empresa.getCNPJ());
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    private StringBuffer criaRegistroF200() throws ParseException{
        RegistroF200 reg = new RegistroF200();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("24012013");
        
        double aliquotaPis    = 0.65;
        double aliquotaCofins = 3.00;
        
        //02
        line.setFieldValue(RegistroF200.IND_OPER, 02);
        //03
        line.setFieldValue(RegistroF200.UNID_IMOB, 02);
        //04
        line.setFieldValue(RegistroF200.IDENT_EMP, "Identificação/Nome do Empreendimento");
        //05
        line.setFieldValue(RegistroF200.DESC_UNID_IMOB, "Descrição resumida da unidade imobiliária vendida");
        //06
        line.setFieldValue(RegistroF200.NUM_CONT, "Número do Contrato/Documento que formaliza a Venda da Unidade Imobiliária");
        //07
        line.setFieldValue(RegistroF200.CPF_CNPJ_ADQU, "12345678911111");
        //08
        line.setFieldValue(RegistroF200.DT_OPER, contrato.getData());
        //09
        line.setFieldValue(RegistroF200.VL_TOT_VEND, contrato.getValor());
        //10
        line.setFieldValue(RegistroF200.VL_REC_ACUM, 0);
        //11
        line.setFieldValue(RegistroF200.VL_TOT_REC, contrato.getValorEntrada());
        //12
        line.setFieldValue(RegistroF200.CST_PIS, 01);
        //13
        line.setFieldValue(RegistroF200.VL_BC_PIS, contrato.getValorEntrada());
        //14
        line.setFieldValue(RegistroF200.ALIQ_PIS, aliquotaPis);
        //15
        line.setFieldValue(RegistroF200.VL_PIS, aliquotaPis*contrato.getValorEntrada()/100);
        //16
        line.setFieldValue(RegistroF200.CST_COFINS, 01);
        //17
        line.setFieldValue(RegistroF200.VL_BC_COFINS, contrato.getValorEntrada());
        //18
        line.setFieldValue(RegistroF200.ALIQ_COFINS, aliquotaCofins);
        //19
        line.setFieldValue(RegistroF200.VL_COFINS, aliquotaCofins*contrato.getValorEntrada()/100);
        //20
        line.setFieldValue(RegistroF200.PERC_REC_RECEB, (contrato.getValorEntrada()+0)/contrato.getValor());
        //21
        line.setFieldValue(RegistroF200.IND_NAT_EMP, 3);
        //21
        line.setFieldValue(RegistroF200.INF_COMP, null);

        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
    
    //REGISTRO F990: ENCERRAMENTO DO BLOCO F
    /**Verificar o contador de blocos
      */
    private StringBuffer criaRegistroF990(){
        RegistroF990 reg = new RegistroF990();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF990.QTD_LIN_F, 7);
        
        StringBuffer sb = line.getRepresentation();
        
        return sb;
    }
}
