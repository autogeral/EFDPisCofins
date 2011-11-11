/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/11/2011 19:09:10
 * @author rafael.galvao
 */
public class RegistroC190 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "CONSOLIDAÇÃO DE NOTAS FISCAIS ELETRÔNICAS (CÓDIGO55) – OPERAÇÕES DE AQUISIÇÃO COM DIREITO A CRÉDITO, E OPERAÇÕES DE DEVOLUÇÃO DE COMPRAS E VENDAS.";
    }
    
    public static String REG = "REG";
    public static String COD_MOD = "COD_MOD";
    public static String DT_REF_INI = "DT_REF_INI";
    public static String DT_REF_FIN = "DT_REF_FIN";
    public static String COD_ITEM = "COD_ITEM";
    public static String COD_NCM = "COD_NCM";
    public static String EX_IPI = "EX_IPI";
    public static String VL_TOT_ITEM = "VL_TOT_ITEM";
    
    public RegistroC190(){
        
    
        addFieldArchetype(REG,new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(DT_REF_INI, new FieldDateTimeFixedLengthArchetype());
        addFieldArchetype(DT_REF_FIN, new FieldDateTimeFixedLengthArchetype());
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_NCM, new FieldStringMaximumLengthArchetype(8));
        addFieldArchetype(EX_IPI, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(VL_TOT_ITEM, new FieldDecimalMaximumLengthArchetype(20,2));
        
        
        
    }
      
    
    
}
