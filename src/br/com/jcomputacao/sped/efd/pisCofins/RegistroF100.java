package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:41:41
 * @author Jonas
 */
public class RegistroF100 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador do Tipo da Operação:
     * 0 – Operação Representativa de Aquisição, Custos, Despesa ou Encargos, ou Receitas, Sujeita à Incidência de Crédito de PIS/Pasep ou Cofins (CST 50 a 66)
     * 1 – Operação Representativa de Receita Auferida Sujeita ao Pagamento da Contribuição para o PIS/Pasep e da Cofins (CST 01, 02, 03 ou 05)
     * 2 - Operação Representativa de Receita Auferida Não Sujeita ao Pagamento da Contribuição para o PIS/Pasep e da Cofins (CST 04, 06, 07, 08, 09, 49 ou 99)
     */
    public static String IND_OPER = "IND_OPER";
    //03 - Código do participante (Campo 02 do Registro 0150)
    public static String COD_PART = "COD_PART";
    //04 - Código do item (campo 02 do Registro 0200)
    public static String COD_ITEM = "COD_ITEM";
    //05 - Data da Operação (ddmmaaaa)
    public static String DT_ITEM = "DT_ITEM";
    //06 - Valor da Operação/Item
    public static String VL_OPER = "VL_OPER";
    //07 - Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //08 - Base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //09 - Alíquota do PIS/PASEP
    public static String ALIQ_PIS = "ALIQ_PIS";
    //10 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //11 - Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
    public static String CST_COFINS = "CST_COFINS";
    //12 - Base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //13 - Alíquota da COFINS
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //14 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //15 - Código da Base de Cálculo dos Créditos, conforme a
    //tabela indicada no item 4.3.7, caso seja informado
    //código representativo de crédito nos Campos 07
    //(CST_PIS) e 11 (CST_COFINS).
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //16
    /**Indicador da origem do crédito:
     * 0 – Operação no Mercado Interno
     * 1 – Operação de Importação
     */
    public static String IND_ORIG_CRED = "IND_ORIG_CRED";
    //17 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "CNPJCOD_CTA";
    //18 - Código do Centro de Custos
    public static String COD_CCUS = "COD_CCUS";
    //19 - Descrição do Documento/Operação
    public static String DESC_DOC_OPER = "DESC_DOC_OPER";

    public RegistroF100() {
        
        setName("Demais documentos e operações geradoras de contribuição e créditos");
        setDelimiter("|");
        
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F100"));
        //02
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        //03
        FieldStringMaximumLengthArchetype f03 = new FieldStringMaximumLengthArchetype(60);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(COD_PART, f03);
        //04
         FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(60);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f04);
        //05
        addFieldArchetype(DT_ITEM, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(VL_OPER, f06);
        //07
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(17,4);
        f08.setFormat(fw4);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(13,4);
        f09.setFormat(fw4);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f10);
        //11
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(17,4);
        f12.setFormat(fw4);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(13,4);
        f13.setFormat(fw4);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f14);
        //15
        FieldStringFixedLengthArchetype f15 = new FieldStringFixedLengthArchetype(2);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(NAT_BC_CRED, f15);
        //16
        FieldStringFixedLengthArchetype f16 = new FieldStringFixedLengthArchetype(1);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(IND_ORIG_CRED, f16);
        //17
        FieldStringMaximumLengthArchetype f17 =  new FieldStringMaximumLengthArchetype(60);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f17);
        //18
        FieldStringMaximumLengthArchetype f18 = new FieldStringMaximumLengthArchetype(60);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(COD_CCUS, f18);
        //19
        FieldStringMaximumLengthArchetype f19 = new FieldStringMaximumLengthArchetype(255);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(DESC_DOC_OPER, f19);

    }
}
