package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Feb 5, 2013 2:25:19 PM
 * @author Jennifer
 */
public class RegistroC810 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código fiscal de operação e prestação
    public static String CFOP = "CFOP";
    //03 - Valor total dos itens
    public static String VL_ITEM = "VL_ITEM";
    //04 - Código do item (campo 02 do Registro 0200)
    public static String COD_ITEM = "COD_ITEM";
    //05 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //06 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //07 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //08 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //09 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS";
    //10 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //11 - Alíquota da COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //12 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //13 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC810 (){
        setName("Detalhamento do cupom fiscal eletrônico (código 59) - Pis/Pasep e Cofins");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C810"));
        //02
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(60);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f04);
        //05
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(13,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f08);
        //09
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(13,4);
        f11.setFormat(fw4);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f12);
        //13
        FieldStringMaximumLengthArchetype f13 = new FieldStringMaximumLengthArchetype(60);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f13);
    }
}
