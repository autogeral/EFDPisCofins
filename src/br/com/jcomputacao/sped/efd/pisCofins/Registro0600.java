/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:31:28
 * @author rafael.galvao
 */
public class Registro0600 extends LineArchetype{
    public static String REG = "REG";
    public static String DT_ALT = "DT_ALT";
    public static String COD_CCUS = "COD_CCUS";
    public static String CCUS = "CCUS";
    
    public Registro0600(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(DT_ALT, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(COD_CCUS, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(CCUS, new FieldStringFixedLengthArchetype(60));
        
        
    }
}
