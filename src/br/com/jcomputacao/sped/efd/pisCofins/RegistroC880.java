package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Feb 6, 2013 4:54:54 PM
 * @author Jennifer
 */
public class RegistroC880 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código do item (campo 02 do Registro 0200)
    public static String COD_ITEM = "COD_ITEM";
    //03 - 
    public static String CFOP = "CFOP";
    //04 - 
    public static String VL_ITEM = "VL_ITEM";        
    //05 - 
    public static String CST_PIS = "CST_PIS";
    //06 - 
    public static String QUANT_BC_PIS = "QUANT_BC_PIS"; 
    //07 - 
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //08 - 
    public static String VL_PIS = "VL_PIS"; 
    //09 - 
    public static String CST_COFINS = "CST_COFINS"; 
    //10 - 
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS"; 
    //11 - 
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //12 -
    public static String VL_COFINS = "VL_COFINS"; 
    //13 -
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC880 (){
        setName("Resumo diário de documentos emitidos por equipamento sta-cf-e (código 59) - Pis/Pasep e cofins apurado por unidade de medida de produto");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C880"));
        //02
        FieldStringMaximumLengthArchetype f02 = new FieldStringMaximumLengthArchetype(60);
        f02.setNullableRepresentation("");
        f02.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f02);
        //03
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        addFieldArchetype(VL_ITEM, f04);
        //05
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(16,3);
        f06.setFormat(fw3);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(17,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f08);
        //09
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(16,3);
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
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
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
