package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Feb 5, 2013 3:45:58 PM
 * @author Jennifer
 */
public class RegistroC800 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public static String COD_MOD = "COD_MOD";
    //03 - Código da situação do documento fiscal, conforme a Tabela 4.1.2
    public static String COD_SIT = "COD_SIT";
    //04 - Número do Cupom Fiscal Eletrônico
    public static String NUM_CFE = "NUM_CFE";
    //05 - Data da emissão do Cupom Fiscal Eletrônico
    public static String DT_DOC = "DT_DOC";
    //06 - Valor total do Cupom Fiscal Eletrônico
    public static String VL_CFE = "VL_CFE";
    //07 - Valor total do PIS
    public static String VL_PIS = "VL_PIS";
    //08 - Valor total da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //09 - CNPJ ou CPF do destinatário
    public static String CNPJ_CPF = "CNPJ_CPF";
    //10 - Número de Série do equipamento SAT
    public static String NR_SAT = "NR_SAT";
    //11 - Chave do Cupom Fiscal Eletrônico
    public static String CHV_CFE = "CHV_CFE";
    //12 - Valor total do desconto/exclusão sobre item
    public static String VL_DESC = "VL_DESC";
    //13 - Valor total das mercadorias e serviços
    public static String VL_MERC = "VL_MERC";
    //14 - Valor de outras desp. Acessórias (acréscimo)
    public static String VL_OUT_DA = "VL_OUT_DA";
    //15 - Valor do ICMS
    public static String VL_ICMS = "VL_ICMS";
    //16 - Valor total do PIS retido por subst. trib.
    public static String VL_PIS_ST = "VL_PIS_ST";
    //17 - Valor total da COFINS retido por subst. trib.
    public static String VL_COFINS_ST = "VL_COFINS_ST";

    public RegistroC800(){
        setName("Cupom fiscal eletrônico (código 59)");
        setDelimiter("|");
               
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C800"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        //03
        addFieldArchetype(COD_SIT, new FieldIntegerMaximumLengthArchetype(2));
        //04
        addFieldArchetype(NUM_CFE, new FieldIntegerMaximumLengthArchetype(9));
        //05
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,3);
        f06.setFormat(fw);
        addFieldArchetype(VL_CFE, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,3);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,3);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f08);
        //09
        FieldIntegerMaximumLengthArchetype f09 = new FieldIntegerMaximumLengthArchetype(14);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CNPJ_CPF, f09);
        //10
        FieldIntegerMaximumLengthArchetype f10 = new FieldIntegerMaximumLengthArchetype(9);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(NR_SAT, f10);
        //11
        FieldStringMaximumLengthArchetype f11 = new FieldStringMaximumLengthArchetype(44);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(CHV_CFE, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_MERC, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_OUT_DA, f14);
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
        addFieldArchetype(VL_PIS_ST, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(15,2);
        f17.setFormat(fw);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS_ST, f17);
    }
}
