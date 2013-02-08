package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD600  extends LineArchetype {

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public final static String COD_MOD = "COD_MOD";
    //03 - Código do município dos pontos de consumo, conforme a tabela IBGE
    public final static String COD_MUN = "COD_MUN";
    //04 - Série do documento fiscal
    public final static String SER = "SER";
    //05 - Subsérie do documento fiscal
    public final static String SUB = "SUB";
    //06
    /**Indicador do tipo de receita:
     * 0- Receita própria - serviços prestados;
     * 1- Receita própria - cobrança de débitos;
     * 2- Receita própria - venda de serviço pré-pago – faturamento de períodos anteriores;
     * 3- Receita própria - venda de serviço pré-pago – faturamento no período;
     * 4- Outras receitas próprias de serviços de comunicação e telecomunicação;
     * 5- Receita própria - co-faturamento;
     * 6- Receita própria – serviços a faturar em período futuro;
     * 7– Outras receitas próprias de natureza não-cumulativa;
     * 8 - Outras receitas de terceiros
     * 9 – Outras receitas
     */
    public static String IND_REC = "IND_REC";
    //07 - Quantidade de documentos consolidados neste registro
    public final static String QTD_CONS = "QTD_CONS";
    //08 - Data Inicial dos documentos consolidados no período
    public static String DT_DOC_INI = "DT_DOC_INI";
    //09 - Data Final dos documentos consolidados no período
    public static String DT_DOC_FIN = "DT_DOC_FIN";
    //10 - Valor total acumulado dos documentos fiscais
    public static String VL_DOC = "VL_DOC";
    //11 - Valor acumulado dos descontos
    public static String VL_DESC = "VL_DESC";
    //12 - Valor acumulado das prestações de serviços tributados pelo ICMS
    public static String VL_SERV = "VL_SERV";
    //13 - Valor acumulado dos serviços não-tributados pelo ICMS
    public static String VL_SERV_NT = "VL_SERV_NT";
    //14 - Valores cobrados em nome de terceiros
    public static String VL_TERC = "VL_TERC";
    //15 - Valor acumulado das despesas acessórias
    public static String VL_DA = "VL_DA";
    //16 - Valor acumulado da base de cálculo do ICMS
    public static String VL_BC_ICMS = "VL_BC_ICMS";
    //17 - Valor acumulado do ICMS
    public static String VL_ICMS = "VL_ICMS";
    //18 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //19 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    

    public RegistroD600() {
        setName("Consolidação da prestação de serviços - notas de serviço de comunicação (código 21) e de serviço de telecomunicação (código 22)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D600"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        FieldIntegerFixedLengthArchetype f03 = new FieldIntegerFixedLengthArchetype(7);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(COD_MUN, f03);
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(4);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(SER, f04);
        //05
        FieldIntegerMaximumLengthArchetype f05 = new FieldIntegerMaximumLengthArchetype(3);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SUB, f05);
        //06
        addFieldArchetype(IND_REC, new FieldIntegerFixedLengthArchetype(1));
        //07
        addFieldArchetype(QTD_CONS, new FieldIntegerMaximumLengthArchetype(19));
        //08
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //09
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_DOC, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_SERV, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_SERV_NT, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_TERC, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(VL_DA, f15);
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(15,2);
        f17.setFormat(fw);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f17);
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f18);
        //19
        FieldDecimalMaximumLengthArchetype f19 = new FieldDecimalMaximumLengthArchetype(15,2);
        f19.setFormat(fw);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f19);
        
    }
    
}
