/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 20:27:49
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC490 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "CONSOLIDAÇÃO DE DOCUMENTOS EMITIDOS POR ECF (CÓDIGOS 02, 2D e 59)";
    }
    public final static String REG = "REG";
    public final static String DT_DOC_INI = "DT_DOC_INI";
    public final static String DT_DOC_FIN = "DT_DOC_FIN";
    public final static String COD_MOD = "COD_MOD";

    public RegistroC490() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(DT_DOC_INI, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_DOC_FIN, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
    }
}
