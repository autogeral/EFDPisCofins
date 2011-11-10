/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD105 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_NAT_FRT = "IND_NAT_FRT";
    public static String VL_ITEM = "VL_ITEM";
    public static String CST_COFINS = "CST_COFINS";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String VL_BC_COFINS = "VL_BC_PIS";
    public static String ALIQ_COFINS = "ALIQ_PIS";
    public static String VL_COFINS = "VL_PIS";
    public static String COD_CTA = "COD_CTA";

    public RegistroD105() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_NAT_FRT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VL_ITEM, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalFixedLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));
    }
    
}
