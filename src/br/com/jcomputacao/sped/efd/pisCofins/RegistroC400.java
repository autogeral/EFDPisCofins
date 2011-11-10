/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:28:12
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC400 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "EQUIPAMENTO ECF (CÓDIGOS 02 e 2D)";
    }
    public final static String REG = "REG";
    public final static String COD_MOD = "COD_MOD";
    public final static String ECF_MOD = "ECF_MOD";
    public final static String ECF_FAB = "ECF_FAB";
    public final static String ECF_CX = "ECF_CX";

    public RegistroC400() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ECF_MOD, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_CX, new FieldIntegerMaximumLengthArchetype(3));
    }
}
