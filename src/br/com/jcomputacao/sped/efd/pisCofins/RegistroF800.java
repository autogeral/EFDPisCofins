
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
 * 24/11/2011 11:29:24
 * @author Douglas
 */
public class RegistroF800 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_NAT_EVEN = "IND_NAT_EVEN";
    public static String DT_EVEN = "DT_EVEN";
    public static String CNPJ_SUCED = "CNPJ_SUCED";
    public static String PA_CONT_CRED = "PA_CONT_CRED";
    public static String COD_CRED = "COD_CRED";
    public static String VL_CRED_PIS = "VL_CRED_PIS";
    public static String VL_CRED_COFINS = "VL_CRED_COFINS";
    public static String PER_CRED_CIS = "PER_CRED_CIS";

    public RegistroF800() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F800"));
        addFieldArchetype(IND_NAT_EVEN, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DT_EVEN, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(CNPJ_SUCED, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(PA_CONT_CRED, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(VL_CRED_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(PER_CRED_CIS, new FieldDecimalMaximumLengthArchetype(6,2));

    }
}