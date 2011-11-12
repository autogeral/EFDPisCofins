/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:27:48
 * @author WILL
 */
public class Registro0205 extends LineArchetype {
    public static final String REG = "REG";
    public static final String DESCR_ANT_ITEM = "DESCR_ANT_ITEM";
    public static final String DT_INI= "DT_INI";
    public static final String DT_FIM= "DT_FIM";
    public static final String COD_ANT_ITEM= "COD_ANT_ITEM";
    
        public Registro0205(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(DESCR_ANT_ITEM, new FieldStringFixedLengthArchetype(255));
        addFieldArchetype(DT_INI, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_FIM, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(COD_ANT_ITEM, new FieldStringFixedLengthArchetype(60));
    }
}
