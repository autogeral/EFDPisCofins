
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 18/11/2011 11:09:31
 * @author Douglas
 */

    public class RegistroF200 extends LineArchetype {

     /*
     * 01 (REG) - Texto fixo contendo "F200"
     */
    public static String REG = "REG";
     /** 02 (IND_OPER) - INDICADOR DO TIPO DE OPERACAO
     * 01 - Venda a vista de unidade concluida
     * 02 - Venda a prazo de unidade concluida
     * 03 - Venda a vista de unidade em construacao
     * 04 - Venda a prazo de unidade em contrução
     * 05 - Outras
     */
    public static String IND_OPER = "IND_OPER";
    /** 03 (UNID_IMOB) - INDICADOR DO TIPO DE UNIDADE IMOBILIARIA VENDIDA
     * 01 - Terreno adquirido para venda
     * 02 - Terreno decorrente de loteamento
     * 03 - Lote oriundo de desmenbramento de terreno
     * 04 - Unidade resultante de incorporacao imobiliara
     * 05 - Predio construido/em construcao para venda
     * 06 - Outras
     */
    public static String UNID_IMOB = "UNID_IMOB";
    /** 04 (IDENT_EMP) - IDENTIFICACAO/NOME DO EMPREENDIMENTO
     */
    public static String IDENT_EMP = "IDENT_EMP";
    /** 05 (DESC_UNID_IMOB) - DESCRICAO RESUMIDA DA UNIDADE IMOBILIARIA VENDIDA
     * Nao obrigatorio
     */
    public static String DESC_UNID_IMOB = "DESC_UNID_IMOB";
    /** 06 (NUM_CONT) - NUMERO DO CONTRATO/DOCUMENTO QUE FORMALIZA A VENDA DA UNIDADE IMOBILIARIA 
     * Nao obrigatorio
     */
    public static String NUM_CONT = "NUM_CONT";
     /** 07 (CPF_CNPJ_ADQU) - IDENTIFICACAO DA PESSOA FISICA (CPF) OU
     * DA PESSOA JURIDICA ADQUIRENTE DA UNIDADE IMOBILIARIA
     */
    public static String CPF_CNPJ_ADQU = "CPF_CNPJ_ADQU";
    /** 08 (DT_OPER) - DATA DA OPERACAO DE VENDA DA UNIDADE IMOBILIARIA
     * Formato: ddmmaaaa
     */
    public static String DT_OPER = "DT_OPER";
    /** 09 (VL_TOT_VEND) - VALOR TOTAL DA UNIDADE IMOBILIARIA VENDIDA ATUALIZADO ATÉ O PERIODO DA ESCRITURACAO
     */
    public static String VL_TOT_VEND = "VL_TOT_VEND";
    /** 10 (VL_REC_ACUM) - VALOR RECEBIDO ACUMULADO ATÉ O MÊS ANTERIOR AO DA ESCRITURACAO 
     */
    public static String VL_REC_ACUM = "VL_REC_ACUM";
    /** 11 (VL_TOT_RECEB) - VALOR TOTAL RECEBIDO NO MES DA ESCRITURACAO
     */
    public static String VL_TOT_REC = "VL_TOT_REC"; 
    /** 12 (CST_PIS) - CODIGO DA SITUACAO TRIBUTARIA REFERENTE AO PIS/PASEP
     * TABELA ITEM 4.3.3
     */
    public static String CST_PIS = "CST_PIS";
    /** 13 (VL_BC_PIS) - BASE DE CALCULO DO PIS/PASEP 
     * Nao obrigatorio
     */
    public static String VL_BC_PIS = "VL_BC_PIS";
     /** 14 (ALIQ_PIS) - ALIQUOTA DO PIS/PASEP (EM PERCENTUAL)
      * Nao obrigatorio
     */
    public static String ALIQ_PIS = "ALIQ_PIS";
    /** 15 (VL_PIS) - VALOR DO PIS/PASEP
     * Nao obrigatorio
     */
    public static String VL_PIS = "VL_PIS";
    /** 16 (CST_COFINS) - CODIGO DA SITUACAO TRIBUTARIA REFERENTE A COFINS
     * TABELA 4.3.4
     */
    public static String CST_COFINS = "CST_COFINS";
    /** 17 (VL_BC_CONFINS) - BASE DE CÁLCULO DO COFINS
     * Nao obrigatorio
     */
    public static String VL_BC_COFINS = "VL_BC_COFINS";
     /** 18 (ALIQ_COFINS) - ALIQUITA DA COFINS (EM PERCENTUAL) 
     */
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    /** 19 (VL_COFINS) - VALOR DA COFINS 
     * Nao obrigatorio
     */
    public static String VL_COFINS = "VL_COFINS";
    /** 20 (PERC_REC_RECEB) - PERCENTUAL DA RECEITA TOTAL RECEBIDA ATÉ O MES
     * DA UNIDADE IMOBILIARIA VENDIDA
     * (CAMPO 10 + CAMPO 11)/CAMPO 09
     * Nao obrigatorio
     */
    public static String PERC_REC_RECEB = "PERC_REC_RECEB";
    /** 21 (IND_NAT_EMP) - INDICADOR DA NATUREZA ESPECIFICA DO EMPREENDIMENTO:
     * 1 - Consorcio
     * 2 - SCP
     * 3 - Incorporacao em condominio
     * 4 - Outras
     */
    public static String IND_NAT_EMP = "IND_NAT_EMP";
     /** 22 (INF_COMP) - INFORMACOES COMPLEMENTARES
     * Nao obrigatorio
     */
    public static String INF_COMP = "INF_COMP";


    public RegistroF200() {
        setName("Operação da atividade imobiliária - unidade imobiliária vendida");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F200"));
        //02
        addFieldArchetype(IND_OPER, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(UNID_IMOB, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(IDENT_EMP, new FieldStringMaximumLengthArchetype(255));
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(90);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(DESC_UNID_IMOB, f05);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(90);
        f06.setNullableRepresentation("");
        addFieldArchetype(NUM_CONT, f06);
        //07
        addFieldArchetype(CPF_CNPJ_ADQU, new FieldStringMaximumLengthArchetype(14));
        //08
        addFieldArchetype(DT_OPER, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_TOT_VEND, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_REC_ACUM, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_TOT_REC, f11);
        //12
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(13,4);
        f14.setFormat(fw4);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f15);
        //16
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(15,2);
        f17.setFormat(fw);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f17);
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(13,4);
        f18.setFormat(fw4);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f18);
        //19
        FieldDecimalMaximumLengthArchetype f19 = new FieldDecimalMaximumLengthArchetype(15,2);
        f19.setFormat(fw);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f19);
        //20
        FieldDecimalMaximumLengthArchetype f20 = new FieldDecimalMaximumLengthArchetype(7,2);
        f20.setFormat(fw);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(PERC_REC_RECEB, f20);
        //21
        FieldIntegerFixedLengthArchetype f21 = new FieldIntegerFixedLengthArchetype(1);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(IND_NAT_EMP, f21);
        //22
        FieldStringMaximumLengthArchetype f22 = new FieldStringMaximumLengthArchetype(90);
        f22.setNullableRepresentation("");
        f22.setFullFillingNullable(false);
        addFieldArchetype(INF_COMP, f22);


    }
}
