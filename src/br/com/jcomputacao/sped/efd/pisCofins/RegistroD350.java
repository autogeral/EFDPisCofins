/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
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
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(ECF_MOD, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("dd/mm/yyyy"));
        addFieldArchetype(CRO, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(CRZ, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(GT_FIN, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BRT, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));

    }
}
