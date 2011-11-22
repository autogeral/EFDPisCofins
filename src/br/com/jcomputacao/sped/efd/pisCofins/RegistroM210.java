/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 22/11/2011 20:20:26
 * @author rafael.galvao
 */
public class RegistroM210 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "DETALHAMENTO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO";
    }
    public static String REG = "REG";
    public static String COD_CONT = "COD_CONT";
    public static String VL_REC_BRT = "VL_REC_BRT";
    public static String VL_BC_CONT = "VL_BC_CONT";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    public static String VL_CONT_APUR = "VL_CONT_APUR";
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    public static String VL_CONT_DIFER = "VL_CONT_DIFER";
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    public static String VL_CONT_PER = "VL_CONT_PER";
    
    public RegistroM210(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_CONT, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_REC_BRT, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_BC_CONT, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(22,3));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(22,4));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_CONT_APUR, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_AJUS_ACRES, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_AJUS_REDUC, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_CONT_DIFER, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_CONT_DIFER_ANT, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_CONT_PER, new FieldDecimalMaximumLengthArchetype(22,2));
        
    }
    
}
