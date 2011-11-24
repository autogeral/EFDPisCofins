
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 24/11/2011 08:29:22
 * @author Douglas
 */
public class RegistroF211 extends LineArchetype {

    public static String REG = "REG";
    public static String NUM_PROC = "NUM_PROC";
    public static String IND_PROC = "IND_PROC";


      public RegistroF211() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F211"));
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
  }
}
