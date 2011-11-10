/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 10/11/2011 20:41:22
 * @author Jonas
 */
public class RegistroA990 extends LineArchetype{
    
    
       public static String REG = "REG";
       public static String QTD_LIN_A = "QTD_LIN_A";
       
       public RegistroA990(){
           
           addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
           addFieldArchetype(QTD_LIN_A , new FieldIntegerMaximumLengthArchetype(20)); 
       }
    
}
