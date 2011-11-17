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
 * 17/11/2011 20:04:51
 * @author rafael.galvao
 */
public class RegistroM510 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
       return "AJUSTES DO CRÉDITO DE COFINS APURADO";
    }
    
    public static String REG = "REG";
    public static String IND_AJ = "IND_AJ";
    public static String VL_AJ = "VL_AJ";
    public static String COD_AJ = "COD_AJ";
    public static String NUM_DOC = "NUM_DOC";
    public static String DESCR_AJ = "DESCR_AJ";
    public static String DT_REF = "DT_REF";
    
    public RegistroM510(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(IND_AJ, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(VL_AJ, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_AJ, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(DESCR_AJ, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(DT_REF, new FieldIntegerMaximumLengthArchetype(8));
        
    }
    
}
