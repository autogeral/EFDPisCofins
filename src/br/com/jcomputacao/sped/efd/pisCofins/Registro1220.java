/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 21:19:12
 * @author William Antunes
 */
public class Registro1220 extends LineArchetype {
    
        public static String REG = "REG";
        public static String PER_APU_CRED = "PER_APU_CRED";
        public static String ORIG_CRED = "ORIG_CRED";
        public static String COD_CRED = "COD_CRED";
        public static String VL_CRED = "VL_CRED";
        
        
    public Registro1220(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));        
        addFieldArchetype(PER_APU_CRED, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(ORIG_CRED, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(COD_CRED , new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(VL_CRED, new FieldDecimalMaximumLengthArchetype(20,2));
        


    }
    
}
