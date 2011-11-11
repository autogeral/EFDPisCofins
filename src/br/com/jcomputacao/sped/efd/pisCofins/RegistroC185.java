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
 * 11/11/2011 18:22:14
 * @author rafael.galvao
 */
public class RegistroC185 extends LineArchetype implements EfdPisCofinsRegistro {
   public String getNome() {
        return "DETALHAMENTO DA CONSOLIDAÇÃO – OPERAÇÕES DE VENDAS– COFINS";
    }
   
   public static String REG = "REG";
   public static String CST_COFINS = "CST_COFINS";
   public static String CFOP = "CFOP";
   public static String VL_ITEM = "VL_ITEM";
   public static String VL_DESC = "VL_DESC";
   public static String VL_BC_COFINS = "VL_BC_COFINS";
   public static String ALIQ_COFINS = "ALIQ_COFINS";
   public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
   public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
   public static String VL_COFINS = "VL_COFINS";
   public static String COD_CTA = "COD_CTA";
   
   public RegistroC185(){
       
       addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
       addFieldArchetype(CST_COFINS, new FieldIntegerMaximumLengthArchetype(2));
       addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
       addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20,2));
       addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
       addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
       addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
       addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,3));
       addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20,4));
       addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
       addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
   }
   
}
