/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:39:58
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC500 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "NOTA FISCAL/CONTA DE ENERGIA ELÉTRICA "
                + "(CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA "
                + "(CÓDIGO 29) E NOTA FISCAL CONSUMO FORNECIMENTO DE GÁS "
                + "(CÓDIGO 28) – DOCUMENTOS DE ENTRADA/AQUISIÇÃO COM CRÉDITO";
    }
    public final static String REG = "REG";
    public final static String COD_PART = "COD_PART";
    public final static String COD_MOD = "COD_MOD";
    public final static String COD_SIT = "COD_SIT";
    public final static String SER = "SER";
    public final static String SUB = "SUB";
    public final static String NUM_DOC = "NUM_DOC";
    public final static String DT_DOC = "DT_DOC";
    public final static String DT_ENT = "DT_ENT";
    public final static String VL_DOC = "VL_DOC";
    public final static String VL_ICMS = "VL_ICMS";
    public final static String COD_INF = "COD_INF";
    public final static String VL_PIS = "VL_PIS";
    public final static String VL_COFINS = "VL_COFINS";

    public RegistroC500() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_ENT, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
    }
}
