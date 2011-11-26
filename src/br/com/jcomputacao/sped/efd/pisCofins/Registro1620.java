
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
 * 26/11/2011 11:04:21
 * @author Douglas
 */
public class Registro1620 extends LineArchetype {

        public static String REG = "REG";
        public static String PER_APU_CRED = "PER_APU_CRED";
        public static String ORIG_CRED = "ORIG_CRED";
        public static String COD_CRED = "COD_CRED";
        public static String VL_CRED = "VL_CRED";

     public Registro1620(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1620"));
        addFieldArchetype(PER_APU_CRED, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(COD_CRED , new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(VL_CRED , new FieldDecimalMaximumLengthArchetype(20,2));

    }

}