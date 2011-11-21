/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 21/11/2011 17:09:50
 * @author rafael.galvao
 */
public class RegistroM211 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "SOCIEDADES COOPERATIVAS – COMPOSIÇÃO DA BASE DE CALCULO – PIS/PASEP";
    }
    public static String REG = "REG";
    public static String IND_TIP_COOP = "IND_TIP_COOP";
    public static String VL_BC_CONT_ANT_EXC_COOP = "VL_BC_CONT_ANT_EXC_COOP";
    public static String VL_EXC_COOP_GER = "VL_EXC_COOP_GER";
    public static String VL_EXC_ESP_COOP = "VL_EXC_ESP_COOP";
    public static String VL_BC_CONT = "VL_BC_CONT";
    
    public RegistroM211(){
    addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
    addFieldArchetype(IND_TIP_COOP, new FieldIntegerFixedLengthArchetype(2));
    addFieldArchetype(VL_BC_CONT_ANT_EXC_COOP, new FieldDecimalMaximumLengthArchetype(20,2));
    addFieldArchetype(VL_EXC_COOP_GER, new FieldDecimalMaximumLengthArchetype(20,2));
    addFieldArchetype(VL_EXC_ESP_COOP, new FieldDecimalMaximumLengthArchetype(20,2));
    addFieldArchetype(VL_BC_CONT, new FieldDecimalMaximumLengthArchetype(20,2));
        
    }
        
}
