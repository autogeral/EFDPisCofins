/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:07:52
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC396 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "ITENS DO DOCUMENTO (CÓDIGOS 02, 2D, 2E e 59) – AQUISIÇÕES/ENTRADAS COM CRÉDITO";
    }
    public final static String REG = "REG";
    public final static String COD_ITEM = "COD_ITEM";
    public final static String VL_ITEM = "VL_ITEM";
    public final static String VL_DESC = "VL_DESC";
    public final static String NAT_BC_CRED = "NAT_BC_CRED";
    public final static String CST_PIS = "CST_PIS";
    public final static String VL_BC_PIS = "VL_BC_PIS";
    public final static String ALIQ_PIS = "ALIQ_PIS";
    public final static String VL_PIS = "VL_PIS";
    public final static String CST_COFINS = "CST_COFINS";
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    public final static String VL_COFINS = "VL_COFINS";
    public final static String COD_CTA = "COD_CTA";

    public RegistroC396() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalFixedLengthArchetype(8, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));

    }
}
