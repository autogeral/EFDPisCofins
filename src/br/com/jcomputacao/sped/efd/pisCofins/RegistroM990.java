/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:26:57
 * @author rafael.galvao
 */
public class RegistroM990 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "ENCERRAMENTO DO BLOCO M";
    }
    
    public static String REG = "REG";
    public static String QTD_LIN_M = "QTD_LIN_M";
    
    public RegistroM990(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(QTD_LIN_M, new FieldIntegerMaximumLengthArchetype(20));
        
    }
    
    
    
    
    
    
}
