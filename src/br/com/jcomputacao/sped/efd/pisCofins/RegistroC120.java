/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 22:04:31
 * @author rafael.galvao
 */
public class RegistroC120 extends LineArchetype {
    public static String REG = "REG";
    public static String COD_DOC_IMP = "COD_DOC_IMP";
    public static String NUM_DOC_IMP = "NUM_DOC_IMP";
    public static String VL_PIS_IMP = "VL_PIS_IMP";
    public static String VL_COFINS_IMP = "VL_COFINS_IMP";
    public static String NUM_ACDRAW = "NUM_ACDRAW";
    
    public RegistroC120(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_DOC_IMP, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(NUM_DOC_IMP, new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(VL_PIS_IMP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS_IMP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(NUM_ACDRAW, new FieldStringMaximumLengthArchetype(20));
    }
}
