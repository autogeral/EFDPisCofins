/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:04:03
 * @author Jonas
 */
public class RegistroF120 extends LineArchetype {

    public static String REG = "REG";
    public static String NAT_BC_CREDN = "NAT_BC_CREDN";
    public static String IDENT_BEM_IMOB = "IDENT_BEM_IMOB";
    public static String IND_ORIG_CRED = "IND_ORIG_CRED";
    public static String IND_UTIL_BEM_IMOB = "IND_UTIL_BEM_IMOB";
    public static String VL_OPER_DEP = "VL_OPER_DEP";
    public static String PARC_OPER_NAO_BC_CRED = "PARC_OPER_NAO_BC_CRED";
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

    public RegistroF120() {

        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));

        addFieldArchetype(NAT_BC_CREDN, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IDENT_BEM_IMOB, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IND_UTIL_BEM_IMOB, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(VL_OPER_DEP, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(PARC_OPER_NAO_BC_CRED, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8, 2));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 2));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CCUS, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_BEM_IMOB, new FieldStringMaximumLengthArchetype(255));



    }
}
