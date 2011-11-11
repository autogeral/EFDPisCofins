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
public class RegistroD100 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_OPER = "IND_OPER";
    public static String IND_EMIT = "IND_EMIT";
    public static String COD_PART = "COD_PART";
    public static String COD_MOD = "COD_MOD";
    public static String COD_SIT = "COD_SIT";
    public static String SER = "SER";
    public static String SUB = "SUB";
    public static String NUM_DOC = "NUM_DOC";
    public static String CHV_CTE = "CHV_CTE";
    public static String DT_DOC = "DT_DOC";
    public static String DT_A_P = "DT_A_P";
    public static String TP_CTe = "TP_CTe";
    public static String CHV_CTE_REF = "CHV_CTE_REF";
    public static String VL_DOC = "VL_DOC";
    public static String VL_DESC = "VL_DESC";
    public static String IND_FRT = "IND_FRT";
    public static String VL_SERV = "VL_SERV";
    public static String VL_BC_ICMS = "VL_BC_ICMS";
    public static String VL_ICMS = "VL_ICMS";
    public static String VL_NT = "VL_NT";
    public static String COD_INF = "COD_INF";
    public static String COD_CTA = "COD_CTA";

    public RegistroD100() {
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(IND_OPER, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(CHV_CTE, new FieldIntegerMaximumLengthArchetype(44));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("dd/mm/yyyy"));
        addFieldArchetype(DT_A_P, new FieldDateTimeFixedLengthArchetype("dd/mm/yyyy"));
        addFieldArchetype(TP_CTe, new FieldIntegerMaximumLengthArchetype(1));
        addFieldArchetype(CHV_CTE_REF, new FieldIntegerMaximumLengthArchetype(44));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(IND_FRT, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(VL_SERV, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_NT, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
    }
}
