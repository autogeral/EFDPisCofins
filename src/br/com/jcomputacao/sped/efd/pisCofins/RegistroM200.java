/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 22/11/2011 20:07:53
 * @author rafael.galvao
 */
public class RegistroM200 extends LineArchetype implements EfdPisCofinsRegistro{

    public String getNome() {
       return "CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO";
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
    
    public RegistroM200(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(VL_TOT_CONT_NC_PER, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_TOT_CRED_DESC, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_TOT_CRED_DESC_ANT, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_TOT_CONT_NC_DEV, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_RET_NC, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_OUT_DED_NC, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_CONT_NC_REC, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_TOT_CONT_CUM_PER, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_RET_CUM, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_OUT_DED_CUM, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_CONT_CUM_REC, new FieldDecimalMaximumLengthArchetype(22,2));
        addFieldArchetype(VL_TOT_CONT_REC, new FieldDecimalMaximumLengthArchetype(22,2));
        
    }
    
}
