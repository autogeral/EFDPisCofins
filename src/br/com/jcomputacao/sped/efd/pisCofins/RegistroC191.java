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
 * $[date] $[time]
 * @author rafael.galvao
 */
public class RegistroC191 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return " DETALHAMENTO DA CONSOLIDAÇÃO – OPERAÇÕES DE AQUISIÇÃO COM DIREITO A CRÉDITO, E OPERAÇÕES DE DEVOLUÇÃO DE COMPRAS E VENDAS – PIS/PASEP";
    }
    
    public static String REG = "REG";
    public static String CNPJ_CPF_PART = "CNPJ_CPF_PART";
    public static String CST_PIS = "CST_PIS";
    public static String CFOP = "CFOP";
    public static String VL_ITEM = "VL_ITEM";
    public static String VL_DESC = "VL_DESC";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    public static String VL_PIS = "VL_PIS";
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC191(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(CNPJ_CPF_PART, new FieldStringMaximumLengthArchetype(14));
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
