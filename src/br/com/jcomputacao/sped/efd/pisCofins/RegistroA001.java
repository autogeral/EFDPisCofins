/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:15:26
 * @author Jonas
 */
public class RegistroA001 extends LineArchetype {
    
    public static String REG = "REG";
    public static String IND_MOV = "IND_MOV";
    
    public RegistroA001(){
        
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));
    }
   
    
}
