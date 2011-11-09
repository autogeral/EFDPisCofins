/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:02:30
 * @author WILL
 */
public class Registro0190 extends LineArchetype {
    
    public static final String REG = "REG";
    public static final String UNID = "UNID";
    public static final String DESCR= "DESCR";
    
    public Registro0190(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(UNID, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(DESCR, new FieldStringFixedLengthArchetype(255));
    }
    
}
