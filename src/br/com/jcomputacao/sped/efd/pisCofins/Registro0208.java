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
 * 09/11/2011 11:47:59
 * @author WILL
 */
public class Registro0208 extends LineArchetype {
        public static final String REG = "REG";
    public static final String COD_TAB = "COD_TAB";
    public static final String COD_GRU= "DT_INI";
    public static final String MARCA_COM= "DT_FIM";
   
    
        public Registro0208(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_TAB, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_GRU, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MARCA_COM, new FieldStringFixedLengthArchetype(60));
        
    }
    
}
