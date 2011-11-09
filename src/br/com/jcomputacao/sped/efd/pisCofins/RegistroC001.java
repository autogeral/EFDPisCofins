/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:49:37
 * @author rafael.galvao
 */
public class RegistroC001 extends LineArchetype{

    public static final String REG = "REG";
    public static final String IND_MOV = "IND_MOV";

    public RegistroC001() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));

    }
}
