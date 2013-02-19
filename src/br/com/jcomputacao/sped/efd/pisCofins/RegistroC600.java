package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 22:21:50
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC600 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
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
    public final static String COD_MOD = "COD_MOD";
    //03 - Código do município dos pontos de consumo, conforme a tabela IBGE
    public final static String COD_MUN = "COD_MUN";
    //04 - Série do documento fiscal
    public final static String SER = "SER";
    //05 - Subsérie do documento fiscal
    public final static String SUB = "SUB";
    //06
    /**Código de classe de consumo de energia elétrica, conforme a
     * Tabela 4.4.5, ou 
     * Código de Consumo de Fornecimento D´água
     * Tabela 4.4.2 ou 
     * Código da classe de consumo de gás canalizado conforme 
     * Tabela 4.4.3
     */
    public final static String COD_CONS = "COD_CONS";
    //07 - Quantidade de documentos consolidados neste registro
    public final static String QTD_CONS = "QTD_CONS";
    //08 - Quantidade de documentos cancelados
    public final static String QTD_CANC = "QTD_CANC";
    //09 - Data dos documentos consolidados
    public final static String DT_DOC = "DT_DOC";
    //10 - Valor total dos documentos
    public final static String VL_DOC = "VL_DOC";
    //11 - Valor acumulado dos descontos
    public final static String VL_DESC = "VL_DESC";
    //12 - Consumo total acumulado, em kWh (Código 06)
    public final static String CONS = "CONS";
    //13 - Valor acumulado do fornecimento
    public final static String VL_FORN = "VL_FORN";
    //14 - Valor acumulado dos serviços não-tributados pelo ICMS
    public final static String VL_SERV_NT = "VL_SERV_NT";
    //15 - Valores cobrados em nome de terceiros
    public final static String VL_TERC = "VL_TERC";
    //16 - Valor acumulado das despesas acessórias
    public final static String VL_DA = "VL_DA";
    //17 - Valor acumulado da base de cálculo do ICMS
    public final static String VL_BC_ICMS = "VL_BC_ICMS";
    //18 - Valor acumulado do ICMS
    public final static String VL_ICMS = "VL_ICMS";
    //19 - Valor acumulado da base de cálculo do ICMS substituição tributária
    public final static String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    //20 - Valor acumulado do ICMS retido por substituição tributária
    public final static String VL_ICMS_ST = "VL_ICMS_ST";
    //21 - Valor acumulado do PIS/PASEP
    public final static String VL_PIS = "VL_PIS";
    //22 - Valor acumulado da COFINS
    public final static String VL_COFINS = "VL_COFINS";

    public RegistroC600() {
        setName("Consolidação diária de notas fiscais/contas emitidas de energia elétrica (código 06), nota fiscal/conta de fornecimento d'água canalizada (código 29) e a nota fiscal/conta de fornecimento de gás (código 28) (empresas obrigadas ou não obrigadas ao convênio ICMS 115/03) - documentos de saída");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C600"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        FieldIntegerFixedLengthArchetype f03 = new FieldIntegerFixedLengthArchetype(7);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(COD_MUN, f03);
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(4);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(SER, f04);
        //05
        FieldIntegerMaximumLengthArchetype f05 = new FieldIntegerMaximumLengthArchetype(3);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SUB, f05);
        //06
        FieldIntegerFixedLengthArchetype f06 = new FieldIntegerFixedLengthArchetype(2);
        f06.setName("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(COD_CONS, f06);
        //07
        addFieldArchetype(QTD_CONS, new FieldIntegerMaximumLengthArchetype(19));
        //08
        FieldIntegerMaximumLengthArchetype f08 = new FieldIntegerMaximumLengthArchetype(19);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(QTD_CANC, f08);
        //09
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
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
        //12
        FieldIntegerMaximumLengthArchetype f12 = new FieldIntegerMaximumLengthArchetype(19);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(CONS, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_FORN, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_SERV_NT, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(VL_TERC, f15);
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_DA, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(15,2);
        f17.setFormat(fw);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS, f17);
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f18);
        //19
        FieldDecimalMaximumLengthArchetype f19 = new FieldDecimalMaximumLengthArchetype(15,2);
        f19.setFormat(fw);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS_ST, f19);
        //20
        FieldDecimalMaximumLengthArchetype f20 = new FieldDecimalMaximumLengthArchetype(15,2);
        f20.setFormat(fw);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS_ST, f20);
        //21
        FieldDecimalMaximumLengthArchetype f21 = new FieldDecimalMaximumLengthArchetype(15,2);
        f21.setFormat(fw);
        addFieldArchetype(VL_PIS, f21);
        //21
        FieldDecimalMaximumLengthArchetype f22 = new FieldDecimalMaximumLengthArchetype(15,2);
        f22.setFormat(fw);
        addFieldArchetype(VL_COFINS, f22);

    }
}
