/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroC601 extends LineArchetype {

    public static String REG = "REG";
    public static String CST_PIS = "CST_PIS";
    public static String VL_ITEM = "VL_ITEM";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String COD_CTA = "COD_CTA";

    public RegistroC601() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_ITEM, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));
    }
}