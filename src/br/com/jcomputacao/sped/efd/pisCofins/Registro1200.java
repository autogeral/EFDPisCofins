/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:35:05
 * @author William Antunes
 */
public class Registro1200 extends LineArchetype {
        public static String REG = "REG";
        public static String PER_APUR_ANT = "PER_APUR_ANT";
        public static String NAT_CONT_REC = "NAT_CONT_REC";
        public static String VL_CONT_APUR = "VL_CONT_APUR";
        public static String VL_CRED_PIS_DESC = "VL_CRED_PIS_DESC";
        public static String VL_CONT_DEV = "VL_CONT_DEV";
        public static String VL_OUT_DED = "VL_OUT_DED";
        public static String VL_CONT_EXT = "VL_CONT_EXT";
        public static String VL_MUL = "VL_MUL";
        public static String VL_JUR = "VL_JUR";
        public static String DT_RECOL = "DT_RECOL";


    
    public Registro1200(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));        
        addFieldArchetype(PER_APUR_ANT, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NAT_CONT_REC, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(VL_CONT_APUR , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_DEV, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_OUT_DED, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_EXT , new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_MUL, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_JUR, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(DT_RECOL, new FieldIntegerFixedLengthArchetype(8));


    }
    
}
