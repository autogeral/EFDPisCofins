package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:06:03
 * @author rafael.galvao
 */
public class RegistroC170 extends LineArchetype{

    //01 - Fixo
    public static final String REG = "REG";
    //02
    public static final String NUM_ITEM = "NUM_ITEM";
    //03
    public static final String COD_ITEM = "COD_ITEM";
    //04
    public static final String DESCR_COMPL = "DESCR_COMPL";
    //05
    public static final String QTD = "QTD";
    //06
    public static final String UNID = "UNID";
    //07
    public static final String VL_ITEM = "VL_ITEM";
    //08
    public static final String VL_DESC = "VL_DESC";
    //09
    /**Movimentação física do ITEM/PRODUTO: 
     * 0 - SIM 
     * 1 - NÃO
     */
    public static final String IND_MOV = "IND_MOV";
    //10
    public static final String CST_ICMS = "CST_ICMS";
    //11
    public static final String CFOP = "CFOP";
    //12
    public static final String COD_NAT = "COD_NAT";
    //13
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    //14
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    //15
    public static final String VL_ICMS = "VL_ICMS";
    //16
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    //17
    public static final String ALIQ_ST = "ALIQ_ST";
    //18
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    //19
    public static final String IND_APUR = "IND_APUR";
    //20
    public static final String CST_IPI = "CST_IPI";
    //21
    public static final String COD_ENQ = "COD_ENQ";
    //22
    public static final String VL_BC_IPI = "VL_BC_IPI";
    //23
    public static final String ALIQ_IPI = "ALIQ_IPI";
    //24
    public static final String VL_IPI = "VL_IPI";
    //25
    public static final String CST_PIS = "CST_PIS";
    //26
    public static final String VL_BC_PIS = "VL_BC_PIS";
    //27
    public static final String ALIQ_PIS = "ALIQ_PIS";
    //28
    public static final String QUANT_BC_PIS = "QUANT_BC_PIS";
    //29
    public static final String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //30
    public static final String VL_PIS = "VL_PIS";
    //31
    public static final String CST_COFINS = "CST_COFINS";
    //32
    public static final String VL_BC_COFINS = "VL_BC_COFINS";
    //33
    public static final String ALIQ_COFINS = "ALIQ_COFINS";
    //34
    public static final String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //35
    public static final String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //36
    public static final String VL_COFINS = "VL_COFINS";
    //37
    public static final String COD_CTA = "COD_CTA";

    public RegistroC170() {
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
                
        setName("Complemento do documento - itens do documento (códigos 01, 1B e 55)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C170"));
        //02
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        //03
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(255);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(DESCR_COMPL, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,5);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(QTD, f05);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(6);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(UNID, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        addFieldArchetype(VL_ITEM, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(1);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(IND_MOV, f09);
        //10
        FieldIntegerFixedLengthArchetype f10 = new FieldIntegerFixedLengthArchetype(3);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(CST_ICMS, f10);
        //11
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //12
        FieldStringMaximumLengthArchetype f12 = new FieldStringMaximumLengthArchetype(10);
        addFieldArchetype(COD_NAT, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(8,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_ICMS, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f15);
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS_ST, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(8,2);
        f17.setFormat(fw);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_ST, f17);
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS_ST, f18);
        //19
        FieldStringFixedLengthArchetype f19 = new FieldStringFixedLengthArchetype(1);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(IND_APUR, f19);
        //20
        FieldStringFixedLengthArchetype f20 = new FieldStringFixedLengthArchetype(2);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(CST_IPI, f20);
        //21
        FieldStringFixedLengthArchetype f21 = new FieldStringFixedLengthArchetype(3);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(COD_ENQ, f21);
        //22
        FieldDecimalMaximumLengthArchetype f22 = new FieldDecimalMaximumLengthArchetype(15,2);
        f22.setFormat(fw);
        f22.setNullableRepresentation("");
        f22.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_IPI, f22);
        //23
        FieldDecimalMaximumLengthArchetype f23 = new FieldDecimalMaximumLengthArchetype(8,2);
        f23.setFormat(fw);
        f23.setNullableRepresentation("");
        f23.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_IPI, f23);
        //24
        FieldDecimalMaximumLengthArchetype f24 = new FieldDecimalMaximumLengthArchetype(15,2);
        f24.setFormat(fw);
        f24.setNullableRepresentation("");
        f24.setFullFillingNullable(false);
        addFieldArchetype(VL_IPI, f24);
        //25
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //26
        FieldDecimalMaximumLengthArchetype f26 = new FieldDecimalMaximumLengthArchetype(15,2);
        f26.setFormat(fw);
        f26.setNullableRepresentation("");
        f26.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f26);
        //27
        FieldDecimalMaximumLengthArchetype f27 = new FieldDecimalMaximumLengthArchetype(12,4);
        f27.setFormat(fw);
        f27.setNullableRepresentation("");
        f27.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f27);
        //28
        FieldDecimalMaximumLengthArchetype f28 = new FieldDecimalMaximumLengthArchetype(15,3);
        f28.setFormat(fw);
        f28.setNullableRepresentation("");
        f28.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f28);
        //29
        FieldDecimalMaximumLengthArchetype f29 = new FieldDecimalMaximumLengthArchetype(17,4);
        f29.setFormat(fw);
        f29.setNullableRepresentation("");
        f29.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT, f29);
        //30
        FieldDecimalMaximumLengthArchetype f30 = new FieldDecimalMaximumLengthArchetype(15,2);
        f30.setFormat(fw);
        f30.setNullableRepresentation("");
        f30.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f30);
        //31
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //32
        FieldDecimalMaximumLengthArchetype f32 = new FieldDecimalMaximumLengthArchetype(15,2);
        f32.setFormat(fw);
        f32.setNullableRepresentation("");
        f32.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f32);
        //33
        FieldDecimalMaximumLengthArchetype f33 = new FieldDecimalMaximumLengthArchetype(12,4);
        f33.setFormat(fw);
        f33.setNullableRepresentation("");
        f33.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f33);
        //34
        FieldDecimalMaximumLengthArchetype f34 =  new FieldDecimalMaximumLengthArchetype(16,3);
        f34.setFormat(fw);
        f34.setNullableRepresentation("");
        f34.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f34);
        //35
        FieldDecimalMaximumLengthArchetype f35 = new FieldDecimalMaximumLengthArchetype(17,4);
        f35.setFormat(fw);
        f35.setNullableRepresentation("");
        f35.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f35);
        //36
        FieldDecimalMaximumLengthArchetype f36 = new FieldDecimalMaximumLengthArchetype(15,2);
        f36.setFormat(fw);
        f36.setNullableRepresentation("");
        f36.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f36);
        //37
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));

    }

  
}
