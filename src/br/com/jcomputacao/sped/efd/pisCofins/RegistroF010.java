/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:26:27
 * @author Jonas
 */
public class RegistroF010 extends LineArchetype {

    public static String REG = "REG";
    public static String CNPJ = "CNPJ";

    public RegistroF010() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
    }
}
