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
 * 10/11/2011 19:52:26
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC481 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – PIS/PASEP (CÓDIGOS 02 e 2D)";
    }
    public final static String REG = "REG";
    public final static String CST_PIS = "CST_PIS";
    public final static String VL_ITEM = "VL_ITEM";
    public final static String VL_BC_PIS = "VL_BC_PIS";
    public final static String ALIQ_PIS = "ALIQ_PIS";
    public final static String QUANT_BC_PIS = "QUANT_BC_PIS";
    public final static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    public final static String VL_PIS = "VL_PIS";
    public final static String COD_ITEM = "COD_ITEM";
    public final static String COD_CTA = "COD_CTA";

    public RegistroC481() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
    }
}