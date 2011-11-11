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
 * 10/11/2011 22:21:50
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC600 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "CONSOLIDAÇÃO DIÁRIA DE NOTAS FISCAIS/CONTAS EMITIDAS DE ENERGIA ELÉTRICA "
                + "(CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA "
                + "(CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS "
                + "(CÓDIGO 28) (EMPRESAS OBRIGADAS OU NÃO OBRIGADAS AO CONVENIO ICMS 115/03) – DOCUMENTOS DE SAÍDA";
    }
    public final static String REG = "REG";
    public final static String COD_MOD = "COD_MOD";
    public final static String COD_MUN = "COD_MUN";
    public final static String SER = "SER";
    public final static String SUB = "SUB";
    public final static String COD_CONS = "COD_CONS";
    public final static String QTD_CONS = "QTD_CONS";
    public final static String QTD_CANC = "QTD_CANC";
    public final static String DT_DOC = "DT_DOC";
    public final static String VL_DOC = "VL_DOC";
    public final static String VL_DESC = "VL_DESC";
    public final static String CONS = "CONS";
    public final static String VL_FORN = "VL_FORN";
    public final static String VL_SERV_NT = "VL_SERV_NT";
    public final static String VL_TERC = "VL_TERC";
    public final static String VL_DA = "VL_DA";
    public final static String VL_BC_ICMS = "VL_BC_ICMS";
    public final static String VL_ICMS = "VL_ICMS";
    public final static String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    public final static String VL_ICMS_ST = "VL_ICMS_ST";
    public final static String VL_PIS = "VL_PIS";
    public final static String VL_COFINS = "VL_COFINS";

    public RegistroC600() {

        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_CONS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(QTD_CONS, new FieldIntegerMaximumLengthArchetype(19));
        addFieldArchetype(QTD_CANC, new FieldIntegerMaximumLengthArchetype(19));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CONS, new FieldIntegerMaximumLengthArchetype(19));
        addFieldArchetype(VL_FORN, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_SERV_NT, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_TERC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_DA, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_ICMS_ST, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_ICMS_ST, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));

    }
}
