package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Cesário
 */
public class RegistroC820 extends LineArchetype{
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
    //06 - Base de cálculo em quantidade - PIS/PASEP
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //07 - Alíquota do PIS/PASEP (em reais)
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //08 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //09 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS";
    //10 - Base de cálculo em quantidade – COFINS
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //11 - Alíquota da COFINS (em reais)
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //12 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //13 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC820 (){
        setName("Detalhamento do cupom fiscal eletrônico (código 59) - Pis/Pasep e Cofins apurado por unidade de medida de produto");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C820"));
        //02
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
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
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(16, 3);
        f06.setFormat(fw3);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(17, 4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15, 2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f08);
        //09
        FieldIntegerFixedLengthArchetype f09 = new FieldIntegerFixedLengthArchetype(2);
        addFieldArchetype(CST_COFINS, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(16, 3);
        f10.setFormat(fw3);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(17,4);
        f11.setFormat(fw4);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15, 2);
        f12.setFormat(fw);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f12);
        //13
        FieldStringMaximumLengthArchetype f13 = new FieldStringMaximumLengthArchetype(60);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f13);
    }
}
