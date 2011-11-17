/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 19:39:59
 * @author rafael.galvao
 */
public class RegistroM610 extends LineArchetype implements EfdPisCofinsRegistro{

    public String getNome() {
       return "DETALHAMENTO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO";
    }
   
    public static String REG = "REG";
    public static String COD_CONT = "COD_CONT";
    public static String VL_REC_BRT = "VL_REC_BRT";
    public static String VL_BC_CONT = "VL_BC_CONT";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public static String VL_CONT_APUR = "VL_CONT_APUR";
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    public static String VL_CONT_DIFER = "VL_CONT_DIFER";
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    public static String VL_CONT_PER = "VL_CONT_PER";
    
    
    public RegistroM610(){
        
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_CONT, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(VL_REC_BRT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_CONT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_CONT_APUR, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_AJUS_ACRES, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_AJUS_REDUC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_DIFER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_DIFER_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_PER, new FieldDecimalMaximumLengthArchetype(20,2));
        
    }
    
}
