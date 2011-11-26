
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
 * 26/11/2011 09:57:24
 * @author Douglas
 */
public class Registro1502 extends LineArchetype {

        public static String REG = "REG";
        public static String VL_CRED_COFINS_TRIB_MI = "VL_CRED_COFINS_TRIB_MI";
        public static String VL_CRED_COFINS_NT_MI = "VL_CRED_COFINS_NT_MI";
        public static String VL_CRED_COFINS_EXP = "VL_CRED_COFINS_EXP";

     public Registro1502(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1502"));
        addFieldArchetype(VL_CRED_COFINS_TRIB_MI, new FieldDecimalMaximumLengthArchetype(2));
        addFieldArchetype(VL_CRED_COFINS_NT_MI, new FieldDecimalMaximumLengthArchetype(2));
        addFieldArchetype(VL_CRED_COFINS_EXP , new FieldDecimalMaximumLengthArchetype(2));

    }

}