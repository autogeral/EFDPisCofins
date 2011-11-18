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
 * 17/11/2011 22:42:14
 * @author rafael.galvao
 */
public class RegistroM230 extends LineArchetype implements EfdPisCofinsRegistro{

    public String getNome() {
       return "INFORMAÇÕES ADICIONAIS DE DIFERIMENTO";
    }
    public static String REG = "REG";
    public static String CNPJ = "CNPJ";
    public static String VL_VEND = "VL_VEND";
    public static String VL_NAO_RECEB = "VL_NAO_RECEB";
    public static String VL_CONT_DIF = "VL_CONT_DIF";
    public static String VL_CRED_DIF = "VL_CRED_DIF";
    public static String COD_CRED = "COD_CRED";
    
    public RegistroM230(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(CNPJ, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(VL_VEND, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_NAO_RECEB, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CONT_DIF, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DIF, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CRED, new FieldStringMaximumLengthArchetype(3));
    }
}
