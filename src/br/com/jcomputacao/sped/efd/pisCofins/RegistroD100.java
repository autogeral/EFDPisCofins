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
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(SUB, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(CHV_CTE, new FieldIntegerFixedLengthArchetype(44));
        addFieldArchetype(DT_DOC, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(DT_A_P, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(TP_CTe, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CHV_CTE_REF, new FieldIntegerFixedLengthArchetype(44));
        addFieldArchetype(VL_DOC, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(IND_FRT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_SERV, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_ICMS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_NT, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(COD_INF, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));
    }
}
