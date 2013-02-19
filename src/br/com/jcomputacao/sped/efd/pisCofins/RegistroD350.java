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
public class RegistroD350 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
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
    public static String COD_MOD = "COD_MOD";
    //03 - Modelo do equipamento
    public static String ECF_MOD = "ECF_MOD";
    //04 - Número de série de fabricação do ECF
    public static String ECF_FAB = "ECF_FAB";
    //05 - Data do movimento a que se refere a Redução Z
    public static String DT_DOC = "DT_DOC";
    //06 - Posição do Contador de Reinício de Operação
    public static String CRO = "CRO";
    //07 - Posição do Contador de Redução Z
    public static String CRZ = "CRZ";
    //08 - Número do Contador de Ordem de Operação do último documento emitido no dia. (Número do COO na Redução Z)
    public static String NUM_COO_FIN = "NUM_COO_FIN";
    //09 - Valor do Grande Total final
    public static String GT_FIN = "GT_FIN";
    //10 - Valor da venda bruta
    public static String VL_BRT = "VL_BRT";
    //11 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //12 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //13 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //14 - Quantidade – Base de cálculo PIS/PASEP
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //15 - Alíquota do PIS/PASEP (em reais)
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //16 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //17 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS";
    //18 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //19 - Alíquota da COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //20 - Quantidade – Base de cálculo da COFINS
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //21 - Alíquota da COFINS (em reais)
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //22 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //23 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD350() {
        setName("Resumo diário de cupom fiscal por ECF - (códigos 2E, 13, 14, 15 e 16)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D350"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(ECF_MOD, new FieldStringMaximumLengthArchetype(20));
        //04
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        //05
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //06
        addFieldArchetype(CRO, new FieldIntegerMaximumLengthArchetype(3));
        //07
        addFieldArchetype(CRZ, new FieldIntegerMaximumLengthArchetype(6));
        //08
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerMaximumLengthArchetype(6));
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(GT_FIN, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_BRT, f10);
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
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(16,3);
        f14.setFormat(fw3);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(17,4);
        f15.setFormat(fw4);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT, f15);
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f16);
        //17
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f18);
        //19
        FieldDecimalMaximumLengthArchetype f19 = new FieldDecimalMaximumLengthArchetype(13,4);
        f19.setFormat(fw4);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f19);
        //20
        FieldDecimalMaximumLengthArchetype f20 = new FieldDecimalMaximumLengthArchetype(16,3);
        f20.setFormat(fw3);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f20);
        //21
        FieldDecimalMaximumLengthArchetype f21 = new FieldDecimalMaximumLengthArchetype(17,4);
        f21.setFormat(fw4);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f21);
        //22
        FieldDecimalMaximumLengthArchetype f22 = new FieldDecimalMaximumLengthArchetype(15,2);
        f22.setFormat(fw);
        f22.setNullableRepresentation("");
        f22.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f22);
        //23
        FieldStringMaximumLengthArchetype f23 = new FieldStringMaximumLengthArchetype(60);
        f23.setNullableRepresentation("");
        f23.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f23);

    }
}
