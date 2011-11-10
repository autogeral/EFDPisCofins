/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:06:03
 * @author rafael.galvao
 */
public class RegistroC170 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "COMPLEMENTO DO DOCUMENTO - ITENS DO DOCUMENTO (CÓDIGOS 01, 1B, 04 e 55)";
    }
    public static final String REG = "REG";
    public static final String NUM_ITEM = "NUM_ITEM";
    public static final String COD_ITEM = "COD_ITEM";
    public static final String DESCR_COMPL = "DESCR_COMPL";
    public static final String QTD = "QTD";
    public static final String UNID = "UNID";
    public static final String VL_ITEM = "VL_ITEM";
    public static final String VL_DESC = "VL_DESC";
    public static final String IND_MOV = "IND_MOV";
    public static final String CST_ICMS = "CST_ICMS";
    public static final String CFOP = "CFOP";
    public static final String COD_NAT = "COD_NAT";
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    public static final String VL_ICMS = "VL_ICMS";
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    public static final String ALIQ_ST = "ALIQ_ST";
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    public static final String IND_APUR = "IND_APUR";
    public static final String CST_IPI = "CST_IPI";
    public static final String COD_ENQ = "COD_ENQ";
    public static final String VL_BC_IPI = "VL_BC_IPI";
    public static final String ALIQ_IPI = "ALIQ_IPI";
    public static final String VL_IPI = "VL_IPI";
    public static final String CST_PIS = "CST_PIS";
    public static final String VL_BC_PIS = "VL_BC_PIS";
    public static final String ALIQ_PIS = "ALIQ_PIS";
    public static final String QUANT_BC_PIS = "QUANT_BC_PIS";
    public static final String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    public static final String VL_PIS = "VL_PIS";
    public static final String CST_COFINS = "CST_COFINS";
    public static final String VL_BC_COFINS = "VL_BC_COFINS";
    public static final String ALIQ_COFINS = "ALIQ_COFINS";
    public static final String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    public static final String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    public static final String VL_COFINS = "VL_COFINS";
    public static final String COD_CTA = "COD_CTA";

    public RegistroC170() {


        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESCR_COMPL, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(QTD, new FieldDecimalMaximumLengthArchetype(20, 5));
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(IND_MOV, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(CST_ICMS, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        addFieldArchetype(COD_NAT, new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_ICMS, new FieldDecimalMaximumLengthArchetype(6, 2));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_ICMS_ST, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_ST, new FieldDecimalMaximumLengthArchetype(6, 2));
        addFieldArchetype(VL_ICMS_ST, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(IND_APUR, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(CST_IPI, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_ENQ, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(VL_BC_IPI, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_IPI, new FieldDecimalMaximumLengthArchetype(6, 2));
        addFieldArchetype(VL_IPI, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));

    }

  
}
