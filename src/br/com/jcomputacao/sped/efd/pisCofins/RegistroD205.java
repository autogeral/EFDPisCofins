package br.com.jcomputacao.sped.efd.pisCofins;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD205 extends LineArchetype {

    public static String REG = "REG";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_ITEM = "VL_ITEM";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String COD_CTA = "COD_CTA";

    public RegistroD205() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_ITEM, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));
    }
}
