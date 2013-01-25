package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:27:32
 * @author William Antunes
 */
public class Registro1102 extends LineArchetype {
      public static String REG = "REG";
        public static String VL_CRED_PIS_TRIB_MI = "VL_CRED_PIS_TRIB_MI";
        public static String VL_CRED_PIS_NT_MI = "VL_CRED_PIS_NT_MI";
        public static String VL_CRED_PIS_EXP = "VL_CRED_PIS_EXP";

    
    public Registro1102(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(VL_CRED_PIS_TRIB_MI, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_NT_MI, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_EXP, new FieldDecimalMaximumLengthArchetype(20,2));

    }
    
    
}
