package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:14:12
 * @author rafael.galvao
 */
public class RegistroM505 extends LineArchetype{
    
    public static String REG = "REG";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS_TOT = "VL_BC_COFINS_TOT";
    public static String VL_BC_COFINS_CUM = "VL_BC_COFINS_CUM";
    public static String VL_BC_COFINS_NC = "VL_BC_COFINS_NC";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String QUANT_BC_COFINS_TOT = "QUANT_BC_COFINS_TOT";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String DESC_CRED = "DESC_CRED";
    
    public RegistroM505(){
        setName("Detalhamento da base de cálculo do crédito apurado no período - Cofins");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        fdm.setNullableRepresentation("");
        fdm.setFullFillingNullable(false);
        FieldDecimalMaximumLengthArchetype fdm3 = new FieldDecimalMaximumLengthArchetype(16,3);
        fdm3.setFormat(fw3);
        fdm3.setNullableRepresentation("");
        fdm3.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M505"));
        //02
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(VL_BC_COFINS_TOT, fdm);
        //05
        addFieldArchetype(VL_BC_COFINS_CUM, fdm);
        //06
        addFieldArchetype(VL_BC_COFINS_NC, fdm);
        //07
        addFieldArchetype(VL_BC_COFINS, fdm);
        //08
        addFieldArchetype(QUANT_BC_COFINS_TOT, fdm3);
        //09
        addFieldArchetype(QUANT_BC_COFINS, fdm3);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(DESC_CRED, f10);
    }
}
