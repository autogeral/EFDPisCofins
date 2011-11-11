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
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        addFieldArchetype(DT_REF, new FieldDateTimeFixedLengthArchetype("dd/mm/aaaa"));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20, 2));

    }
}
