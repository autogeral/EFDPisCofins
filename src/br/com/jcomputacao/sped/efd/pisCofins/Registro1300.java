
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/11/2011 09:10:44
 * @author Douglas
 */
public class Registro1300 extends LineArchetype {

        public static String REG = "REG";
        public static String IND_NAT_RET = "IND_NAT_RET";
        public static String PR_REC_RET = "PR_REC_RET";
        public static String VL_RET_APU = "VL_RET_APU";
        public static String VL_RET_DED = "VL_RET_DED";
        public static String VL_RET_PER = "VL_RET_PER";
        public static String VL_RET_DCOMP = "VL_RET_DCOMP";
        public static String SLD_RET = "SLD_RET";


    public Registro1300(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1300"));
        addFieldArchetype(IND_NAT_RET, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(PR_REC_RET, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(VL_RET_APU , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_RET_DED, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_RET_PER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_RET_DCOMP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(SLD_RET, new FieldDecimalMaximumLengthArchetype(20,2));

    }

}