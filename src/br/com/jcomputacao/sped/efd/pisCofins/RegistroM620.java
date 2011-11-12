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
 * 12/11/2011 12:30:58
 * @author rafael.galvao
 */
public class RegistroM620 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "AJUSTES DA COFINS APURADA";
    }
    public static String REG = "REG";
    public static String IND_AJ = "IND_AJ";
    public static String VL_AJ = "VL_AJ";
    public static String COD_AJ = "COD_AJ";
    public static String NUM_DOC = "NUM_DOC";
    public static String DESCR_AJ = "DESCR_AJ";
    public static String DT_REF = "DT_REF";

    public RegistroM620() {

    addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
    addFieldArchetype(IND_AJ, new FieldStringMaximumLengthArchetype(1));
    addFieldArchetype(VL_AJ, new FieldDecimalMaximumLengthArchetype(20,2));
    addFieldArchetype(COD_AJ, new FieldStringMaximumLengthArchetype(2));
    addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(255));
    addFieldArchetype(DESCR_AJ, new FieldStringMaximumLengthArchetype(255));
    addFieldArchetype(DT_REF, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
    
    
    
    
    
    }
}
