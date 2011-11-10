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
public class RegistroD350 extends LineArchetype {

    public static String REG = "REG";
    public static String COD_MOD = "COD_MOD";
    public static String ECF_MOD = "ECF_MOD";
    public static String ECF_FAB = "ECF_FAB";
    public static String DT_DOC = "DT_DOC";
    public static String CRO = "CRO";
    public static String CRZ = "CRZ";
    public static String NUM_COO_FIN = "NUM_COO_FIN";
    public static String GT_FIN = "GT_FIN";
    public static String VL_BRT = "VL_BRT";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    public static String VL_PIS = "VL_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public static String VL_COFINS = "VL_COFINS";
    public static String COD_CTA = "COD_CTA";

    public RegistroD350() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ECF_MOD, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(ECF_FAB, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(DT_DOC, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(CRO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CRZ, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(GT_FIN, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_BRT, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalFixedLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalFixedLengthArchetype(20, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalFixedLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalFixedLengthArchetype(20, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));

    }
}
