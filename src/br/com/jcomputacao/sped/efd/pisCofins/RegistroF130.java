/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:56:45
 * @author Jonas
 */
public class RegistroF130 extends LineArchetype {

    public static String REG = "REG";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String IDENT_BEM_IMOB = "IDENT_BEM_IMOB";
    public static String IND_ORIG_CRED = "IND_ORIG_CRED";
    public static String IND_UTIL_BEM_IMOB = "IND_UTIL_BEM_IMOB";
    public static String MES_OPER_AQUIS = "MES_OPER_AQUIS";
    public static String VL_OPER_AQUIS = "VL_OPER_AQUIS";
    public static String PARC_OPER_NAO_BC_CRED = "PARC_OPER_NAO_BC_CRED";
    public static String VL_BC_CRED = "VL_BC_CRED";
    public static String IND_NR_PARC = "IND_NR_PARC";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String COD_CTA = "COD_CTA";
    public static String COD_CCUS = "COD_CCUS";
    public static String DESC_BEM_IMOB = "DESC_BEM_IMOB";

    public RegistroF130() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F130"));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));         
        addFieldArchetype(IDENT_BEM_IMOB, new FieldIntegerFixedLengthArchetype(2)); 
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1)); 
        addFieldArchetype(IND_UTIL_BEM_IMOB, new FieldIntegerFixedLengthArchetype(1));   
        addFieldArchetype(MES_OPER_AQUIS, new FieldIntegerFixedLengthArchetype(6));      
        addFieldArchetype(VL_OPER_AQUIS, new FieldDecimalMaximumLengthArchetype(20,2)); 
        addFieldArchetype(PARC_OPER_NAO_BC_CRED, new FieldDecimalMaximumLengthArchetype(20,2)); 
        addFieldArchetype(VL_BC_CRED, new FieldDecimalMaximumLengthArchetype(20,2)); 
        addFieldArchetype(IND_NR_PARC, new FieldIntegerFixedLengthArchetype(1));    
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));  
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,2));   
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,2));    
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));   
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));       
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));        
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,2));     
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));    
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60)); 
        addFieldArchetype(COD_CCUS, new FieldStringMaximumLengthArchetype(60)); 
        addFieldArchetype(DESC_BEM_IMOB, new FieldStringMaximumLengthArchetype(255)); 
    

    }
}
