/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD201 extends LineArchetype {

    public static String REG = "REG";
    public static String CST_PIS = "CST_PIS";
    public static String VL_ITEM = "VL_ITEM";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String COD_CTA = "COD_CTA";

    public RegistroD201() {
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
    }
}
