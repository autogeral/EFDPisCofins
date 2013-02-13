package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:34:25
 * @author rafael.galvao
 */
public class RegistroM500 extends LineArchetype{

    public static String REG = "REG";
    public static String COD_CRED = "COD_CRED";
    public static String IND_CRED_ORI = "IND_CRED_ORI";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public static String VL_CRED = "VL_CRED";
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    public static String VL_CRED_DIFER = "VL_CRED_DIFER";
    public static String VL_CRED_DISP = "VL_CRED_DISP";
    public static String IND_DESC_CRED = "IND_DESC_CRED";
    public static String VL_CRED_DESC = "VL_CRED_DESC";
    public static String SLD_CRED = "SLD_CRED";
    
    public RegistroM500(){
        setName("");
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
        addFieldArchetype(REG, new FieldDefaultArchetype("M500"));
        //02
        addFieldArchetype(COD_CRED, new FieldStringFixedLengthArchetype(3));
        //03
        addFieldArchetype(IND_CRED_ORI, new FieldIntegerFixedLengthArchetype(1));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f04);
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
        addFieldArchetype(VL_CRED, fdm);
        //09
        addFieldArchetype(VL_AJUS_ACRES, fdm);
        //10
        addFieldArchetype(VL_AJUS_REDUC, fdm);
        //11
        addFieldArchetype(VL_CRED_DIFER, fdm);
        //12
        addFieldArchetype(VL_CRED_DISP, fdm);
        //13
        addFieldArchetype(IND_DESC_CRED, new FieldStringFixedLengthArchetype(1));
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_CRED_DESC, f14);
        //15
        addFieldArchetype(SLD_CRED, fdm);
    }
    
    
    
    
}
