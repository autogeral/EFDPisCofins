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
 * 09/11/2011 20:06:07
 * @author rafael.galvao
 */
public class RegistroC100 extends LineArchetype {

    public static final String REG = "REG";
    public static final String IND_OPER = "IND_OPER";
    public static final String IND_EMIT = "IND_EMIT";
    public static final String COD_PART = "COD_PART";
    public static final String COD_MOD = "COD_MOD";
    public static final String COD_SIT = "COD_SIT";
    public static final String SER = "SER";
    public static final String NUM_DOC = "NUM_DOC";
    public static final String CHV_NFE = "CHV_NFE";
    public static final String DT_DOC = "DT_DOC";
    public static final String DT_E_S = "DT_E_S";
    public static final String VL_DOC = "VL_DOC";
    public static final String IND_PGTO = "IND_PGTO";
    public static final String VL_DESC = "VL_DESC";
    public static final String VL_ABAT_NT = "VL_ABAT_NT";
    public static final String VL_MERC = "VL_MERC";
    public static final String IND_FRT = "IND_FRT";
    public static final String VL_FRT = "VL_FRT";
    public static final String VL_SEG = "VL_SEG";
    public static final String VL_OUT_DA = "VL_OUT_DA";
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    public static final String VL_ICMS = "VL_ICMS";
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    public static final String VL_IPI = "VL_IPI";
    public static final String VL_PIS = "VL_PIS";
    public static final String VL_COFINS = "VL_COFINS";
    public static final String VL_PIS_ST = "VL_PIS_ST";
    public static final String VL_COFINS_ST = "VL_COFINS_ST";

    public RegistroC100() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(CHV_NFE, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(DT_DOC, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(DT_E_S, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VL_DOC, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(IND_PGTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_DESC, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_ABAT_NT, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_MERC, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(IND_FRT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_FRT, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_SEG, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_OUT_DA, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_ICMS, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_BC_ICMS_ST, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_ICMS_ST, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_IPI, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_PIS, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_PIS_ST, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS_ST, new FieldDecimalFixedLengthArchetype(20,2));


    }
}
