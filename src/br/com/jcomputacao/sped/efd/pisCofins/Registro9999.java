/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:30:22
 * @author WILL
 */
public class Registro9999 extends LineArchetype {
            public static final String REG = "REG";
        public static final String QTD_LIN = "QTD_LIN";
   


    public Registro9999(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(QTD_LIN, new FieldIntegerFixedLengthArchetype(20));
      
}
    
}
