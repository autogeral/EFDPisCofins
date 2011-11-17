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
 * 17/11/2011 20:34:25
 * @author rafael.galvao
 */
public class RegistroM500 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
       return "CRÉDITO DE COFINS RELATIVO AO PERÍODO";
    }
    public static String REG = "REG";
    public static String COD_CRED = "COD_CRED";
    public static String IND_CRED_ORI = "IND_CRED_ORI";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public static String VL_CRED = "VL_CRED";
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    public static String VL_CRED_DIFER = "VL_CRED_DIFER";
    public static String VL_CRED_DISP = "VL_CRED_DISP";
    public static String IND_DESC_CRED = "IND_DESC_CRED";
    public static String VL_CRED_DESC = "VL_CRED_DESC";
    public static String SLD_CRED = "SLD_CRED";
    
    public RegistroM500(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_CRED, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(IND_CRED_ORI, new FieldIntegerMaximumLengthArchetype(1));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_CRED, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_AJUS_ACRES, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_AJUS_REDUC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DIFER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DISP, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(IND_DESC_CRED, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(VL_CRED_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(SLD_CRED, new FieldDecimalMaximumLengthArchetype(20,2));
    }
    
    
    
    
}
