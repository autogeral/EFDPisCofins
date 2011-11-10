/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD300 extends LineArchetype {

    public static String REG = "REG";
    public static String COD_MOD = "COD_MOD";
    public static String SER = "SER";
    public static String SUB = "SUB";
    public static String NUM_DOC_INI = "NUM_DOC_INI";
    public static String NUM_DOC_FIN = "NUM_DOC_FIN";
    public static String CFOP = "CFOP";
    public static String DT_REF = "DT_REF";
    public static String VL_DOC = "VL_DOC";
    public static String VL_DESC = "VL_DESC";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String COD_CTA = "COD_CTA";

    public RegistroD300() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(DT_REF, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VL_DOC, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalFixedLengthArchetype(8,4));
        addFieldArchetype(VL_PIS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));
    }
}
