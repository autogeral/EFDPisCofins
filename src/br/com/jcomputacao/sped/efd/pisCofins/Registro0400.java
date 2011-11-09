/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 18:30:25
 * @author rafael.galvao
 */
public class Registro0400 extends LineArchetype {
    public static String REG = "REG";
    public static String COD_NAT = "COD_NAT";
    public static String DESCR_NAT = "DESCR_NAT";
    
    public Registro0400(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_NAT, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(DESCR_NAT, new FieldStringFixedLengthArchetype(255));
    }
}
