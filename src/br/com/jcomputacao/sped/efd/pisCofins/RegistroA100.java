/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:39:44
 * @author Jonas
 */
public class RegistroA100 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_OPER = "IND_OPER";
    public static String IND_EMIT = "IND_EMIT";
    public static String COD_PART = "COD_PART";
    public static String COD_SIT = "COD_SIT";
    public static String SER = "SER";
    public static String SUB = "SUB";
    public static String NUM_DOC = "NUM_DOC";
    public static String CHV_NFSE = "CHV_NFSE";
    public static String DT_DOC = "DT_DOC";
    public static String DT_EXE_SERV = "DT_EXE_SERV";
    public static String VL_DOC = "VL_DOC";
    public static String IND_PGTO = "IND_PGTO";
    public static String VL_DESC = "VL_DESC";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String VL_PIS_RET = "VL_PIS_RET";
    public static String VL_COFINS_RET = "VL_COFINS_RET";
    public static String VL_ISS = "VL_ISS";

    public RegistroA100() {

        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(SUB, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUM_DOC, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(CHV_NFSE, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype());
        addFieldArchetype(DT_EXE_SERV, new FieldDateTimeFixedLengthArchetype());
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(IND_PGTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_PIS_RET, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS_RET, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_ISS, new FieldDecimalMaximumLengthArchetype(20,2));
    }
}
