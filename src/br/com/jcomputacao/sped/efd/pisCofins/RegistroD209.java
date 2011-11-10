/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD209 extends LineArchetype {

    public static String REG = "REG";
    public static String NUM_PROC = "NUM_PROC";
    public static String IND_PROC = "IND_PROC";

    public RegistroD209() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(NUM_PROC, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
    }
}
