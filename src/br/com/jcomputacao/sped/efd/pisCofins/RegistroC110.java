/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 21:33:36
 * @author rafael.galvao
 */
public class RegistroC110 extends LineArchetype{
    public static String REG = "REG";
    public static String COD_INF = "COD_INF";
    public static String TXT_COMPL = "TXT_COMPL";
    
    public RegistroC110(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TXT_COMPL,  new FieldStringMaximumLengthArchetype(255));
        
    }
}
