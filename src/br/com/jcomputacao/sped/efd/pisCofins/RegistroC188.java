/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/11/2011 18:58:33
 * @author rafael.galvao
 */
public class RegistroC188 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "PROCESSO REFERENCIADO";
    }
    
    public static String REG = "REG";
    public static String NUM_PROC = "NUM_PROC";
    public static String IND_PROC = "IN_PROC";
    
    public RegistroC188(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(IND_PROC, new FieldStringMaximumLengthArchetype(1));
        
        
    }
    
    
    
}
