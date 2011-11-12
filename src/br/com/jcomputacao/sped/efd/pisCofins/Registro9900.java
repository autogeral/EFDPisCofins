/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:06:55
 * @author WILL
 */
public class Registro9900 extends LineArchetype {
    
    public static final String REG = "REG";
    public static final String REG_BLC = "REG_BLC";
    public static final String QTD_REG_BLC = "QTD_REG_BLC";


    public Registro9900(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(REG_BLC, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(QTD_REG_BLC, new FieldIntegerFixedLengthArchetype(20));
}
}
