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
 * 10/11/2011 20:09:06
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC485 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – COFINS (CÓDIGOS 02 e 2D)";
    }
    public final static String REG = "REG";
    public final static String CST_COFINS = "CST_COFINS";
    public final static String VL_ITEM = "VL_ITEM";
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    public final static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public final static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public final static String VL_COFINS = "VL_COFINS";
    public final static String COD_ITEM = "COD_ITEM";
    public final static String COD_CTA = "COD_CTA";

    public RegistroC485() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
    }
}
