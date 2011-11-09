/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:55:58
 * @author rafael.galvao
 */
public class RegistroC010 extends LineArchetype{
    public static String REG = "REG";
    public static String CNPJ = "CNPJ";
    public static String IND_ESCRI = "IND_ESCRI";
    
    public RegistroC010() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(IND_ESCRI, new FieldStringFixedLengthArchetype(1));
        
        
    }
}
