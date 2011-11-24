
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
 * 24/11/2011 11:54:17
 * @author Douglas
 */
public class RegistroF990 extends LineArchetype {

    public static String REG = "REG";
    public static String QTD_LIN_F = "QTD_LIN_F";


    public RegistroF990() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F990"));
        addFieldArchetype(QTD_LIN_F, new FieldIntegerMaximumLengthArchetype(20));
      
    }
}