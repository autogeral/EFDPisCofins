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
public class RegistroM105 extends LineArchetype {

    public static String REG = "REG";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS_TOT = "VL_BC_PIS_TOT";
    public static String VL_BC_PIS_CUM = "VL_BC_CUM";
    public static String VL_BC_PIS_NC = "VL_BC_PIS_NC";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String QUANT_BC_PIS_TOT = "VL_BC_PIS_TOT";
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    public static String DESC_CRED = "DESC_CRED";

    public RegistroM105() {
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NAT_BC_CRED, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS_TOT, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS_CUM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS_NC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(QUANT_BC_PIS_TOT, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(DESC_CRED, new FieldStringMaximumLengthArchetype(60));
    }
}
