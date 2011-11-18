package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:30:54
 * @author Jonas
 */
public class RegistroA170 extends LineArchetype {

    public static String REG = "REG";
    public static String NUM_ITEM = "NUM_ITEM";
    public static String COD_ITEM = "COD_ITEM";
    public static String DESCR_COMPL = "DESCR_COMPL";
    public static String VL_ITEM = "VL_ITEM";
    public static String VL_DESC = "VL_DESC";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String IND_ORIG_CRED = "IND_ORIG_CRED";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String COD_CTA = "COD_CTA";
    public static String COD_CCUS = "COD_CCUS";

    public RegistroA170() {

        addFieldArchetype(REG, new FieldDefaultArchetype("A170"));
        addFieldArchetype(NUM_ITEM , new FieldIntegerMaximumLengthArchetype(4)); 
        addFieldArchetype(COD_ITEM , new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESCR_COMPL , new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(VL_ITEM , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_DESC ,  new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(NAT_BC_CRED , new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IND_ORIG_CRED , new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CST_PIS , new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS , new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS , new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_PIS , new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS , new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS , new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS , new FieldDecimalMaximumLengthArchetype(6,2));
        addFieldArchetype(VL_COFINS , new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA , new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CCUS ,new FieldStringMaximumLengthArchetype(60));
    }
}
