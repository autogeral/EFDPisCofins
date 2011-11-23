
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
 * 23/11/2011 11:41:21
 * @author Douglas
 */
public class RegistroF210 extends LineArchetype {

    public static String REG = "REG";
    public static String VL_CUS_ORC = "VL_CUS_ORC";
    public static String VL_EXC = "VL_EXC";
    public static String VL_CUS_ORC_AJU = "VL_CUS_ORC_AJU";
    public static String VL_BC_CRED = "VL_BC_CRED";
    public static String CST_PIS = "CST_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_CRED_PIS_UTIL = "VL_CRED_PIS_UTIL";
    public static String CST_COFINS = "CST_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_CRED_COFINS_UTIL = "VL_CRED_COFINS_UTIL";

    public RegistroF210() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F210"));
        addFieldArchetype(VL_CUS_ORC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_EXC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CUS_ORC_AJU , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_CRED, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_PIS_UTIL, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_COFINS_UTIL, new FieldDecimalMaximumLengthArchetype(20,2));

    }
}
