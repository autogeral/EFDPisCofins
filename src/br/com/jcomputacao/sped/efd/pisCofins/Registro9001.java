/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 09:41:44
 * @author WILL
 */
public class Registro9001 extends LineArchetype {
    
   
     public static final String REG = "REG";
     public static final String IND_MOV = "IND_MOV";


    public Registro9001(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));

    }
    
}
