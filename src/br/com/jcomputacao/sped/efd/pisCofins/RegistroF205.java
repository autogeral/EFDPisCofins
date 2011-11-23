
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 23/11/2011 10:03:31
 * @author Douglas
 */
public class RegistroF205 extends LineArchetype {

    public static String REG = "REG";
    public static String VL_CUS_INC_ACUM_ANT = "VL_CUS_INC_ACUM_ANT";
    public static String VL_CUS_INC_PER_ESC = "VL_CUS_INC_PER_ESC";
    public static String VL_CUS_INC_ACUM = "VL_CUS_INC_ACUM";
    public static String VL_EXC_BC_CUS_INC_ACUM = "VL_EXC_BC_CUS_INC_ACUM";
    public static String VL_BC_CUS_INC = "VL_BC_CUS_INC";
    public static String CST_PIS = "CST_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_CRED_PIS_ACUM = "VL_CRED_PIS_ACUM";
    public static String VL_CRED_PIS_DESC_ANT = "VL_CRED_PIS_DESC_ANT";
    public static String VL_CRED_PIS_DESC = "VL_CRED_PIS_DESC";
    public static String VL_CRED_PIS_DESC_FUT = "VL_CRED_PIS_DESC_FUT";
    public static String CST_COFINS = "CST_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_CRED_COFINS_ACUM = "VL_CRED_COFINS_ACUM";
    public static String VL_CRED_COFINS_DESC_ANT = "VL_CRED_COFINS_DESC_ANT";
    public static String VL_CRED_COFINS_DESC = "VL_CRED_COFINS_DESC";
    public static String VL_CRED_COFINS_DESC_FUT = "VL_CRED_COFINS_DESC_FUT";
    

    public RegistroF205() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F205"));
        addFieldArchetype(VL_CUS_INC_ACUM_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CUS_INC_PER_ESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CUS_INC_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_EXC_BC_CUS_INC_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_CUS_INC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_PIS_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC_FUT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_COFINS_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS_DESC_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS_DESC_FUT, new FieldDecimalMaximumLengthArchetype(20,2));
       
    }
}
