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
 * 09/11/2011 20:14:18
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC380 extends LineArchetype implements EfdPisCofinsRegistro  {

    public String getNome() {
        return "NOTA FISCAL DE VENDA A CONSUMIDOR (CÓDIGO 02) - CONSOLIDAÇÃO DE DOCUMENTOS EMITIDOS";
    }
    
    public final static String REG = "REG";
    public final static String COD_MOD = "COD_MOD";
    public final static String DT_DOC_INI = "DT_DOC_INI";
    public final static String DT_DOC_FIN = "DT_DOC_FIN";
    public final static String NUM_DOC_INI = "NUM_DOC_INI";
    public final static String NUM_DOC_FIN = "NUM_DOC_FIN";
    public final static String VL_DOC = "VL_DOC";
    public final static String VL_DOC_CANC = "VL_DOC_CANC";
    
    public RegistroC380() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(DT_DOC_INI, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_DOC_FIN, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_DOC_CANC, new FieldDecimalMaximumLengthArchetype(20,2));
    }    
}
