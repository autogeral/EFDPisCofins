/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:22:54
 * @author WILL
 */
public class Registro9990 extends LineArchetype {
        public static final String REG = "REG";
        public static final String QTD_LIN_9 = "QTD_LIN_9";
   


    public Registro9990(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(QTD_LIN_9, new FieldIntegerFixedLengthArchetype(20));
      
}
    
}
