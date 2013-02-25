package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.sped.efd.pisCofins.geracao.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jennifer
 */
public class GerarArquivoEfd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, EfdPisCofinsException {
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strInicio = "01/01/2013";
            Date inicio = sdf.parse(strInicio);
        String strFim = "31/01/2013";
            Date fim = sdf.parse(strFim);
            
        EmpresaEfdPisCofinsImpl empresa = new EmpresaEfdPisCofinsImpl(10276553000125L, "CONVIVERE EMPREENDIMENTOS IMOBILIÁRIOS LTDA", 3523909,"SP");
        ContabilistaEfdPisCofinsImpl contabilista = new ContabilistaEfdPisCofinsImpl();
            contabilista.setNome("VANESSA REGINA GAVIOLI");
            contabilista.setCpf(27859578816L);
            contabilista.setCrc("ASP199019/O");
            contabilista.setCep(13300190);
            contabilista.setEndereco("RUA PADRE BARTOLOMEU TADEI");
            contabilista.setNumero("268");
            contabilista.setBairro("CENTRO");
            contabilista.setTelefone("1140231678");
            contabilista.setFax("1140231678");
            contabilista.setEmail("officecont@uol.com.br");
            contabilista.setCodigoMunicipio(3523909);
            
        ContratoEfdPisCofinsImpl contrato = new ContratoEfdPisCofinsImpl ();
            contrato.setContratoCodigo(1);
            contrato.setData(inicio);
            contrato.setDiaPagamento(14);
            contrato.setParcelas(48);
            contrato.setTipo(ContratoTipo.VENDA);
            contrato.setValor(48400.00);
            contrato.setValorEntrada(10000.00);
            contrato.setValorSaldo(38400.00);
            contrato.setVencimento(fim);
        
        ImovelEfdPisCofinsImpl imovel = new ImovelEfdPisCofinsImpl();
            imovel.setImovelCodigo(2);
            imovel.setAreaTerreno(185.00);
            imovel.setDescricao("D 02");
            imovel.setStatus(ImovelStatus.INDISPONIVEL);
            
        ContratoImovelEfdPisConfinsImpl contratoImovel = new ContratoImovelEfdPisConfinsImpl();  
            contratoImovel.setContratoImovelCodigo(3);
            contratoImovel.setContratoCodigo(1);
            contratoImovel.setImovelCodigo(2);
            contratoImovel.setCadastro(inicio);
                
        ArquivoEfdContribuicoes arq = new ArquivoEfdContribuicoes(empresa, inicio, fim);
        
        arq.addContator(contabilista);
        arq.addContrato(contrato);
        arq.addImovel(imovel);
        arq.addContratoImovel(contratoImovel);
        
        StringBuilder sb = arq.getRepresentation();
        System.out.print(sb);
    }
}
