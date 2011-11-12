/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:57:41
 * @author rafael.galvao
 */
public class RegistroC198 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "PROCESSO REFERENCIADO";
    }
    
    public static String REG = "REG";
    public static String NUM_PROC = "NUM_PROC";
    public static String IND_PROC = "IND_PROC";
    
    public RegistroC198(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(IND_PROC, new FieldStringMaximumLengthArchetype(1));
        
        
        
        
    }
    
    
    
}
