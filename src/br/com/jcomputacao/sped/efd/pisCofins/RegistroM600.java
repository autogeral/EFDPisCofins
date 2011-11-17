/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 19:54:04
 * @author rafael.galvao
 */
public class RegistroM600 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO";
    }
    
    public static String REG = "REG";
    public static String VL_TOT_CONT_NC_PER = "VL_TOT_CONT_NC_PER";
    public static String VL_TOT_CRED_DESC = "VL_TOT_CRED_DESC";
    public static String VL_TOT_CRED_DESC_ANT = "VL_TOT_CRED_DESC_ANT";
    public static String VL_TOT_CONT_NC_DEV = "VL_TOT_CONT_NC_DEV";
    public static String VL_RET_NC = "VL_RET_NC";
    public static String VL_OUT_DED_NC = "VL_OUT_DED_NC";
    public static String VL_CONT_NC_REC = "VL_CONT_NC_REC";
    public static String VL_TOT_CONT_CUM_PER = "VL_TOT_CONT_CUM_PER";
    public static String VL_RET_CUM = "VL_RET_CUM";
    public static String VL_OUT_DED_CUM = "VL_OUT_DED_CUM";
    public static String VL_CONT_CUM_REC = "VL_CONT_CUM_REC";
    public static String VL_TOT_CONT_REC = "VL_TOT_CONT_REC";
    
    public RegistroM600(){
        
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(VL_TOT_CONT_NC_PER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CRED_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CRED_DESC_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CONT_NC_DEV, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_RET_NC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_OUT_DED_NC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_NC_REC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CONT_CUM_PER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_RET_CUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_OUT_DED_CUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_CUM_REC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CONT_REC, new FieldDecimalMaximumLengthArchetype(20,2));
    
        
        
        
        
        
    }
       
    
}
