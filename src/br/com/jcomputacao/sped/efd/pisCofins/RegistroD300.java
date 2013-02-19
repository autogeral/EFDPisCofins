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
public class RegistroD300 extends LineArchetype {

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
    //03 - Série do documento fiscal
    public static final String SER = "SER";
    //04 - Subsérie do documento fiscal
    public final static String SUB = "SUB";
    //05 - Número do documento fiscal inicial emitido no período (mesmo modelo, série e subsérie).
    public static String NUM_DOC_INI = "NUM_DOC_IN";
    //06 - Número do documento fiscal final emitido no período (mesmo modelo, série e subsérie).
    public static String NUM_DOC_FIN = "NUM_DOC_FIN";
    //07 - Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2
    public static String CFOP = "CFOP";
    //08 - Data do dia de referência do resumo diário
    public static String DT_REF = "DT_REF";
    //09 - Valor total dos documentos fiscais
    public static String VL_DOC = "VL_DOC";
    //10 - Valor total dos descontos
    public static String VL_DESC = "VL_DESC";
    //11 - Código da Situação Tributária referente ao PIS/PASEP – Tabela 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //12 - Valor da base de cálculo do PIS/PASEP.
    public static String VL_BC_PIS = "VL_BC_PIS";
    //13 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //14 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //15 - Código da Situação Tributária referente ao COFINS – Tabela 4.3.4.
    public static String CST_COFINS = "CST_COFINS";
    //16 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //17 - Alíquota do COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //18 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //19 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD300() {
        
        setName("Resumo da escrituração diaria - bilhetes consolidados de passagem rodoviário (código 13), de passagem aquaviário (código 14), de passagem e nota de bagagem (código 15), de passagem ferroviário (código 16) e resumo de movimento diário (código 18)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D300"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        FieldStringMaximumLengthArchetype f03 = new FieldStringMaximumLengthArchetype(4);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(SER, f03);
        //04
        FieldIntegerMaximumLengthArchetype f04 = new FieldIntegerMaximumLengthArchetype(3);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(SUB, f04);
        //05
        FieldIntegerMaximumLengthArchetype f05 = new FieldIntegerMaximumLengthArchetype(6);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC_INI, f05);
        //06
        FieldIntegerMaximumLengthArchetype f06 = new FieldIntegerMaximumLengthArchetype(6);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC_FIN, f06);
        //07
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //08
        addFieldArchetype(DT_REF, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_DOC, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f10);
        //11
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(13,4);
        f13.setFormat(fw4);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f14);
        //15
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(13,4);
        f17.setFormat(fw4);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f17);
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f18);
        //19
        FieldStringMaximumLengthArchetype f19 = new FieldStringMaximumLengthArchetype(60);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f19);
    }
}
