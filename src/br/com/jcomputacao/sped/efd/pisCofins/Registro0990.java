/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:18:09
 * @author rafael.galvao
 */
public class Registro0990 extends LineArchetype{
    public static String REG = "REG";
    public static String QTD_LIN_0 = "QTD_LIN_0";
    
    public Registro0990(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(QTD_LIN_0, new FieldIntegerFixedLengthArchetype(20));
    }
}
