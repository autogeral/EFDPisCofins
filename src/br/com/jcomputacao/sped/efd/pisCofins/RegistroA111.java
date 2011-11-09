/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 21:33:25
 * @author Jonas
 */
public class RegistroA111 extends LineArchetype {
    public static String REG = "REG";
     public static String NUM_PROC = "NUM_PROC";
     public static String IND_PROC = "IND_PROC";
     
    public RegistroA111(){
        
         addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
         addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(15));
         addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
     }
}
