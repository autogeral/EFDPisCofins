/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:44:48
 * @author rafael.galvao
 */
public class RegistroM800 extends LineArchetype implements EfdPisCofinsRegistro{

    public String getNome() {
        return "RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – COFINS";
    }
    
    public static String REG = "REG";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_TOT_REC = "VL_TOT_REC";
    public static String COD_CTA = "COD_CTA";
    public static String DESC_COMPL = "DESC_COMPL";
    
    public RegistroM800(){
        
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(CST_COFINS, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(VL_TOT_REC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_COMPL, new FieldStringMaximumLengthArchetype(255));
        
    }
    
    
    
}
