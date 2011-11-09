/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 18:40:49
 * @author rafael.galvao
 */
public class Registro0450 extends LineArchetype {
    public static String REG = "REG";
    public static String COD_INF = "COD_INF";
    public static String TXT = "TXT";
    
    public Registro0450(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_INF, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(TXT,  new FieldStringFixedLengthArchetype(255));
        
    }
  
    
}
