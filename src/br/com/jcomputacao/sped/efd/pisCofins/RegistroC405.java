/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:40:36
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC405 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "REDUÇÃO Z (CÓDIGOS 02 e 2D)";
    }
    public final static String REG = "REG";
    public final static String DT_DOC = "DT_DOC";
    public final static String CRO = "CRO";
    public final static String CRZ = "CRZ";
    public final static String NUM_COO_FIN = "NUM_COO_FIN";
    public final static String GT_FIN = "GT_FIN";
    public final static String VL_BRT = "VL_BRT";

    public RegistroC405() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CRO, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(CRZ, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(GT_FIN, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BRT, new FieldDecimalMaximumLengthArchetype(20, 2));
    }
}
