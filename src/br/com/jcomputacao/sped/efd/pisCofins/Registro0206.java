/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:38:46
 * @author rafael.galvao
 */
public class Registro0206 extends LineArchetype{
    public static String REG = "REG";
    public static String COD_COMB = "COD_COMB";
    
    public Registro0206(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_COMB, new FieldStringFixedLengthArchetype(255));
    }
}
