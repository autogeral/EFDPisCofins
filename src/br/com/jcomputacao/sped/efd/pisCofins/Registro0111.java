/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 09:25:21
 * @author WILL
 */
public class Registro0111 extends LineArchetype {
     public static final String REG = "REG";
     public static final String REC_BRU_NCUM_TRIB_MI= "REC_BRU_NCUM_TRIB_MI";
     public static final String REC_BRU_NCUM_NT_MI = "REC_BRU_ NCUM_NT_MI";
     public static final String REC_BRU_NCUM_EXP = "REC_BRU_ NCUM_EXP";
     public static final String REC_BRU_CUM = "REC_BRU_CUM";
     public static final String REC_BRU_TOTAL = "REC_BRU_TOTAL";


    public Registro0111(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(REC_BRU_NCUM_TRIB_MI, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(REC_BRU_NCUM_NT_MI, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(REC_BRU_NCUM_EXP, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(REC_BRU_CUM, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(REC_BRU_TOTAL, new FieldDecimalFixedLengthArchetype(20,2));

    }
    
}
