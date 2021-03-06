package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD200 extends LineArchetype {

    //01 - Fixo    
    public final static String REG = "REG";
    //02
    /**Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    /**
    * Tabela 4.1.1
    * <table>
    * <tr><th colspan="2">4.1.2- Tabela Situacao do Documento</th></tr>
    * <tr><th>Codigo</th><th>Descricao</th></tr>
    * <tr><td>1</td><td>Nota Fiscal</td></tr>
    * <tr><td>1B</td><td>Nota Fiscal Avulsa</td></tr>
    * <tr><td>2</td><td>Nota Fiscal de Venda a Consumidor</td></tr>
    * <tr><td>2D</td><td>Cupom Fiscal</td></tr>
    * <tr><td>2E</td><td>Cupom Fiscal Bilhete de Passagem</td></tr>
    * <tr><td>4</td><td>Nota Fiscal de Produtor</td></tr>
    * <tr><td>6</td><td>Nota Fiscal/Conta de Energia Eletrica</td></tr>
    * <tr><td>7</td><td>Nota Fiscal de Servico de Transporte</td></tr>
    * <tr><td>8</td><td>Conhecimento de Transporte Rodoviario de Cargas</td></tr>
    * <tr><td>8B</td><td>Conhecimento de Transporte de Cargas Avulso</td></tr>
    * <tr><td>9</td><td>Conhecimento de Transporte Aquaviario de Cargas</td></tr>
    * <tr><td>10</td><td>Conhecimento Aereo</td></tr>
    * <tr><td>11</td><td>Conhecimento de Transporte Ferroviario de Cargas</td></tr>
    * <tr><td>13</td><td>Bilhete de Passagem Rodoviario</td></tr>
    * <tr><td>14</td><td>Bilhete de Passagem Aquaviario</td></tr>
    * <tr><td>15</td><td>Bilhete de Passagem e Nota de Bagagem</td></tr>
    * <tr><td>17</td><td>Despacho de Transporte</td></tr>
    * <tr><td>16</td><td>Bilhete de Passagem Ferroviario</td></tr>
    * <tr><td>18</td><td>Resumo de Movimento Diario</td></tr>
    * <tr><td>20</td><td>Ordem de Coleta de Cargas</td></tr>
    * <tr><td>21</td><td>Nota Fiscal de Servico de Comunicacao</td></tr>
    * <tr><td>22</td><td>Nota Fiscal de Servico de Telecomunicacao</td></tr>
    * <tr><td>23</td><td>GNRE</td></tr>
    * <tr><td>24</td><td>Autorizacao de Carregamento e Transporte</td></tr>
    * <tr><td>25</td><td>Manifesto de Carga</td></tr>
    * <tr><td>26</td><td>Conhecimento de Transporte Multimodal de Cargas</td></tr>
    * <tr><td>27</td><td>Nota Fiscal De Transporte Ferroviario De Carga</td></tr>
    * <tr><td>28</td><td>Nota Fiscal/Conta de Fornecimento de Gas Canalizado</td></tr>
    * <tr><td>29</td><td>Nota Fiscal/Conta De Fornecimento D'agua Canalizada</td></tr>
    * <tr><td>55</td><td>Nota Fiscal Eletronica</td></tr>
    * <tr><td>57</td><td>Conhecimento de Transporte Eletronico - CT-e</td></tr>
    * <tr><td>59</td><td>Cupom Fiscal Eletronico - CF-e</td></tr>
    * </table>
    */
    public static final String COD_MOD = "COD_MOD";
    //03 - Código da situação do documento fiscal, conforme a Tabela 4.1.2
    /**
     * Tabela 4.1.2
     * <table>
     * <tr><th colspan="2">4.1.2- Tabela Situacao do Documento</th></tr>
     * <tr><th>Codigo</th><th>Descricao</th></tr>
     * <tr><td>00</td><td>Documento regular</td></tr>
     * <tr><td>01</td><td>Documento regular extemporaneo</td></tr>
     * <tr><td>02</td><td>Documento cancelado</td></tr>
     * <tr><td>03</td><td>Documento cancelado extemporaneo</td></tr>
     * <tr><td>04</td><td>NFe denegada</td></tr>
     * <tr><td>05</td><td>Nfe Numeracao inutilizada</td></tr
     * <tr><td>06</td><td>Documento Fiscal Complementar</td></tr>
     * <tr><td>07</td><td>Documento Fiscal Complementar extemporaneo.</td></tr>
     * <tr><td>08</td><td>Documento Fiscal emitido com base em Regime Especial ou Norma Especifica</td></tr>
     * </table>
     */
    public static final String COD_SIT = "COD_SIT";
    //04 - Série do documento fiscal
    public static final String SER = "SER";
    //05 - Subsérie do documento fiscal
    public final static String SUB = "SUB";
    //06 - Número do documento fiscal inicial emitido no período (mesmo modelo, série e subsérie).
    public static String NUM_DOC_INI = "NUM_DOC_IN";
    //07 - Número do documento fiscal final emitido no período (mesmo modelo, série e subsérie).
    public static String NUM_DOC_FIN = "NUM_DOC_FIN";
    //08 - Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2
    public static String CFOP = "CFOP";
    //09 - Data do dia de referência do resumo diário
    public static String DT_REF = "DT_REF";
    //10 - Valor total dos documentos fiscais
    public static String VL_DOC = "VL_DOC";
    //11 - Valor total dos descontos
    public static String VL_DESC = "VL_DESC";

    public RegistroD200() {
        
        setName("Resumo da escrituração diaria - prestação de serviços de transporte - nota fiscal de serviço de transporte (código 07) e conhecimento de transporte  rodoviário de cargas (código 08), conhecimento de transporte de cargas avulso (código 8B), aquaviário de cargas (código 09), aéreo (código 10), ferroviário de cargas (código 11), multimodal de cargas (código 26), nota fiscal de transporte ferroviário de carga (código 27) e conhecimento de transporte eletrônico - ct-e (código 57)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D200"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(4);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(SER, f04);
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(3);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SUB, f05);
        //06
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(9));
        //07
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(9));
        //08
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //09
        addFieldArchetype(DT_REF, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_DOC, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f11);

    }
}
