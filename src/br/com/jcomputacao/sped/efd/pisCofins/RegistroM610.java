package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 19:39:59
 * @author rafael.galvao
 */
public class RegistroM610 extends LineArchetype{
   
    public static String REG = "REG";
    public static String COD_CONT = "COD_CONT";
    public static String VL_REC_BRT = "VL_REC_BRT";
    public static String VL_BC_CONT = "VL_BC_CONT";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public static String VL_CONT_APUR = "VL_CONT_APUR";
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    public static String VL_CONT_DIFER = "VL_CONT_DIFER";
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    public static String VL_CONT_PER = "VL_CONT_PER";
    
    
    public RegistroM610(){
        setName("Detalhamento da contribuição para a seguridade social - Cofins do período");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M610"));
        //02
        addFieldArchetype(COD_CONT, new FieldStringMaximumLengthArchetype(2));
        //03
        addFieldArchetype(VL_REC_BRT, fdm);
        //04
        addFieldArchetype(VL_BC_CONT, fdm);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(13,4);
        f05.setFormat(fw4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(16,3);
        f06.setFormat(fw3);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(17,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f07);
        //08
        addFieldArchetype(VL_CONT_APUR, fdm);
        //09
        addFieldArchetype(VL_AJUS_ACRES, fdm);
        //10
        addFieldArchetype(VL_AJUS_REDUC, fdm);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_CONT_DIFER, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_CONT_DIFER_ANT, f12);
        //13
        addFieldArchetype(VL_CONT_PER, fdm);
        
    }
    
}
