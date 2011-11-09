/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:29:18
 * @author Jonas
 */
public class RegistroA010 extends LineArchetype{
    
    public static String REG = "REG";
    public static String CNPJ = "CNPJ";
    
    public RegistroA010(){
    
         addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
         addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
    }
}
