/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 22:05:03
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC505 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "COMPLEMENTO DA OPERAÇÃO (CÓDIGOS 06, 28 e 29) – COFINS";
    }
    public final static String REG = "REG";
    public final static String CST_COFINS = "CST_COFINS";
    public final static String VL_ITEM = "VL_ITEM";
    public final static String NAT_BC_CRED = "NAT_BC_CRED";
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    public final static String VL_COFINS = "VL_COFINS";
    public final static String COD_CTA = "COD_CTA";

    public RegistroC505() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));

    }
}
