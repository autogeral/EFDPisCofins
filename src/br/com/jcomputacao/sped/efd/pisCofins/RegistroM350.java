/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 22:13:18
 * @author rafael.galvao
 */
public class RegistroM350 extends LineArchetype implements EfdPisCofinsRegistro{

    public String getNome() {
        return "PIS/PASEP – FOLHA DE SALÁRIOS";
    }
    
    public static String REG = "REG";
    public static String VL_TOT_FOL = "VL_TOT_FOL";
    public static String VL_EXC_BC = "VL_EXC_BC";
    public static String VL_TOT_BC = "VL_TOT_BC";
    public static String ALIQ_PIS_FOL = "ALIQ_PIS_FOL";
    public static String VL_TOT_CONT_FOL = "VL_TOT_CONT_FOL";
    
    public RegistroM350(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(VL_TOT_FOL, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_EXC_BC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_BC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_PIS_FOL, new FieldDecimalMaximumLengthArchetype(6,2));
        addFieldArchetype(VL_TOT_CONT_FOL, new FieldDecimalMaximumLengthArchetype(20,2));
    }
    
}
