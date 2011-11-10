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
public class RegistroD200 extends LineArchetype {

    public static String REG = "REG";
    public static String COD_MOD = "COD_MOD";
    public static String COD_SIT = "COD_SIT";
    public static String SER = "SER";
    public static String SUB = "SUB";
    public static String NUM_DOC_INI = "NUM_DOC_IN";
    public static String NUM_DOC_FIN = "NUM_DOC_FIN";
    public static String CFOP = "CFOP";
    public static String DT_REF = "DT_REF";
    public static String VL_DOC = "VL_DOC";
    public static String VL_DESC = "VL_DESC";

    public RegistroD200() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(SUB, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(DT_REF, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VL_DOC, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalFixedLengthArchetype(20, 2));

    }
}
