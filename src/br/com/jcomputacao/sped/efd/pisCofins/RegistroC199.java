/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:07:34
 * @author rafael.galvao
 */
public class RegistroC199 extends LineArchetype implements EfdPisCofinsRegistro{

    public String getNome() {
        return "COMPLEMENTO DO DOCUMENTO - OPERAÇÕES DE IMPORTAÇÃO (CÓDIGO 55)";
    }
    public static String REG = "REG";
    public static String COD_DOC_IMP = "COD_DOC_IMP";
    public static String NUM_DOC_IMP = "NUM_DOC_IMP";
    public static String VL_PIS_IMP = "VL_PIS_IMP";
    public static String VL_COFINS_IMP = "VL_COFINS_IMP";
    public static String NUM_ACDRAW = "NUM_ACDRAW";
    
    public RegistroC199(){
     
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_DOC_IMP, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(NUM_DOC_IMP, new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(VL_PIS_IMP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS_IMP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(NUM_ACDRAW, new FieldStringMaximumLengthArchetype(20));
        
        
        
    }
    
    
    
    
}
