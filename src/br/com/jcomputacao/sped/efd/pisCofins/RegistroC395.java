/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 18:51:44
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC395 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public final static String REG = "REG";
    public final static String COD_MOD = "COD_MOD";
    public final static String COD_PART = "COD_PART";
    public final static String SER = "SER";
    public final static String SUB_SER = "SUB_SER";
    public final static String NUM_DOC = "NUM_DOC";
    public final static String DT_DOC = "DT_DOC";
    public final static String VL_DOC = "VL_DOC";

    public RegistroC395() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(SUB_SER, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20, 2));
    }
}
