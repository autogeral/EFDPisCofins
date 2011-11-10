/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:30:51
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC499 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "PROCESSO REFERENCIADO";
    }
    public final static String REG = "REG";
    public final static String NUM_PROC = "NUM_PROC";
    public final static String IND_PROC = "IND_PROC";

    public RegistroC499() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
    }
}
