
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
 * 24/11/2011 10:42:32
 * @author Douglas
 */
public class RegistroF700 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_ORI_DED = "IND_ORI_DED";
    public static String IND_NAT_DED = "IND_NAT_DED";
    public static String VL_DED_PIS = "VL_DED_PIS";
    public static String VL_DED_COFINS = "VL_DED_COFINS";
    public static String VL_BC_OPER = "VL_BC_OPER";
    public static String CNPJ = "CNPJ";
    public static String INF_COMP = "INF_COMP";

    public RegistroF700() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F700"));
        addFieldArchetype(IND_ORI_DED, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IND_NAT_DED, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(VL_DED_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_DED_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_OPER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(INF_COMP, new FieldStringMaximumLengthArchetype(90));

    }
}
