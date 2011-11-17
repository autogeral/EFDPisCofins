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
 * 17/11/2011 20:14:12
 * @author rafael.galvao
 */
public class RegistroM505 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
     return "DETALHAMENTO DA BASE DE CALCULO DO CRÉDITO APURADO NO PERÍODO – COFINS";
    }
    
    public static String REG = "REG";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS_TOT = "VL_BC_COFINS_TOT";
    public static String VL_BC_COFINS_CUM = "VL_BC_COFINS_CUM";
    public static String VL_BC_COFINS_NC = "VL_BC_COFINS_NC";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String QUANT_BC_COFINS_TOT = "QUANT_BC_COFINS_TOT";
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static String DESC_CRED = "DESC_CRED";
    
    public RegistroM505(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NAT_BC_CRED, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(CST_COFINS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS_TOT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_COFINS_CUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_COFINS_NC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(QUANT_BC_COFINS_TOT, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(DESC_CRED, new FieldStringMaximumLengthArchetype(60));
    }
}
