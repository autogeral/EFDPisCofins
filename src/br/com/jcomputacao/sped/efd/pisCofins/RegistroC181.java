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
 * 10/11/2011 21:38:37
 * @author rafael.galvao
 */
public class RegistroC181 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "DETALHAMENTO DA CONSOLIDAÇÃO – OPERAÇÕES DE VENDAS – PIS/PASEP";
    }
    public static final String REG = "REG";
    public static final String CST_PIS = "CST_PIS";
    public static final String CFOP = "CFOP";
    public static final String VL_ITEM = "VL_ITEM";
    public static final String VL_DESC = "VL_DESC";
    public static final String VL_BC_PIS = "VL_BC_PIS";
    public static final String ALIQ_PIS = "ALIQ_PIS";
    public static final String QUANT_BC_PIS = "QUANT_BC_PIS";
    public static final String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    public static final String VL_PIS = "VL_PIS";
    public static final String COD_CTA = "COD_CTA";
    
    public RegistroC181(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        
        
        
    }
}
