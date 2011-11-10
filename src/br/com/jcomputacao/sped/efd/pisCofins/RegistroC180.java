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
 * 10/11/2011 20:36:46
 * @author rafael.galvao
 */
public class RegistroC180 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "CONSOLIDAÇÃO DE NOTAS FISCAIS ELETRÔNICAS EMITIDAS PELA PESSOA JURÍDICA (CÓDIGO 55) – OPERAÇÕES DE VENDAS";
    }
    public static String REG = "REG";
    public static String COD_MOD = "COD_MOD";
    public static String DT_DOC_INI = "DT_DOC_INI";
    public static String DT_DOC_FIN = "DT_DOC_FIN";
    public static String COD_ITEM = "COD_ITEM";
    public static String COD_NCM = "OD_NCM";
    public static String EX_IPI = "EX_IPI";
    public static String VL_TOT_ITEM = "VL_TOT_ITEM";
    
    public RegistroC180(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(DT_DOC_INI, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_DOC_FIN, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_NCM, new FieldStringMaximumLengthArchetype(8));
        addFieldArchetype(EX_IPI, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(VL_TOT_ITEM, new FieldDecimalMaximumLengthArchetype(20,2));
        
    }
}
