
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
 * 24/11/2011 08:53:40
 * @author Douglas
 */
public class RegistroF600 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_NAT_RET = "IND_NAT_RET";
    public static String DT_RET = "DT_RET";
    public static String VL_BC_RET = "VL_BC_RET";
    public static String VL_RET = "VL_RET";
    public static String COD_REC = "COD_REC";
    public static String IND_NAT_REC = "IND_NAT_REC";
    public static String CNPJ = "CNPJ";
    public static String VL_RET_PIS = "VL_RET_PIS";
    public static String VL_RET_COFINS = "VL_RET_COFINS";
    public static String IND_DEC = "IND_DEC";

    public RegistroF600() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F600"));
        addFieldArchetype(IND_NAT_RET, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DT_RET, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VL_BC_RET, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_RET, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_REC, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(IND_NAT_REC, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(VL_RET_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_RET_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(IND_DEC, new FieldIntegerFixedLengthArchetype(1));

    }
}
