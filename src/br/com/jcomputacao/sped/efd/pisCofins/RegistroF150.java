
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
 * 29/11/2011 09:07:16
 * @author Douglas
 */
public class RegistroF150 extends LineArchetype{
    
    public static String REG = "REG";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String VL_TOT_EST = "VL_TOT_EST";
    public static String EST_IMP = "EST_IMP";
    public static String VL_BC_EST = "VL_BC_EST";
    public static String VL_BC_MEN_EST = "VL_BC_MEN_EST";
    public static String CST_PIS = "CST_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_CRED_PIS = "VL_CRED_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_CRED_COFINS = "VL_CRED_ COFINS";
    public static String DESC_EST = "DESC_EST";
    public static String COD_CTA = "COD_CTA";
    
    public RegistroF150() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F150"));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));         
        addFieldArchetype(VL_TOT_EST, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(EST_IMP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_EST, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_MEN_EST, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(DESC_EST, new FieldStringMaximumLengthArchetype(100));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
           

    }
}
