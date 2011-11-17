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
 * 10/11/2011 21:41:41
 * @author Jonas
 */
public class RegistroF100 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_OPER = "IND_OPER";
    public static String COD_PART = "COD_PART";
    public static String COD_ITEM = "COD_ITEM";
    public static String DT_ITEM = "DT_ITEM";
    public static String VL_OPER = "VL_OPER";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    public static String IND_Orig_CRED = "IND_Orig_CRED";
    public static String COD_CTA = "CNPJCOD_CTA";
    public static String COD_CCUS = "COD_CCUS";
    public static String DESC_DOC_OPER = "DESC_DOC_OPER";

    public RegistroF100() {

        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DT_ITEM, new FieldDateTimeFixedLengthArchetype());
        addFieldArchetype(VL_OPER, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IND_Orig_CRED, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CCUS, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_DOC_OPER, new FieldStringMaximumLengthArchetype(255));

    }
}
