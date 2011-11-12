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
 * 12/11/2011 11:53:49
 * @author rafael.galvao
 */
public class RegistroM700 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "COFINS DIFERIDA EM PERÍODOS ANTERIORES – VALORES A PAGAR NO PERÍODO";
    }
    public static String REG = "REG";
    public static String COD_CONT = "COD_CONT";
    public static String VL_CONT_APUR_DIFER = "VL_CONT_APUR_DIFER";
    public static String NAT_CRED_DESC = "NAT_CRED_DESC";
    public static String VL_CRED_DESC_DIFER = "VL_CRED_DESC_DIFER";
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    public static String PER_APUR = "PER_APUR";
    public static String DT_RECEB = "DT_RECEB";
    
    
    public RegistroM700(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_CONT, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(VL_CONT_APUR_DIFER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(NAT_CRED_DESC, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(VL_CRED_DESC_DIFER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_DIFER_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(PER_APUR, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_RECEB, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
