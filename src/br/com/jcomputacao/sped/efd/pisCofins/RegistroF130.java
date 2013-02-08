package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:56:45
 * @author Jonas
 */
public class RegistroF130 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Texto fixo contendo "10" (Código da Base de
    //Cálculo do Crédito sobre Bens Incorporados ao
    //Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7)
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //03
    /**Identificação dos Bens/Grupo de Bens Incorporados ao Ativo Imobilizado:
     * 01 = Edificações e Benfeitorias em Imóveis Próprios;
     * 02 = Edificações e Benfeitorias em Imóveis de Terceiros; 
     * 03 = Instalações;
     * 04 = Máquinas;
     * 05 = Equipamentos;
     * 06 = Veículos;
     * 99 = Outros
     */
    public static String IDENT_BEM_IMOB = "IDENT_BEM_IMOB";
    //04
    /**Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito:
     * 0 – Aquisição no Mercado Interno
     * 1 – Aquisição no Mercado Externo (Importação)
     */
    public static String IND_ORIG_CRED = "IND_ORIG_CRED";
    //05
    /**Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado:
     * 1 – Produção de Bens Destinados a Venda;
     * 2 – Prestação de Serviços;
     * 3 – Locação a Terceiros;
     * 9 – Outros
     */
    public static String IND_UTIL_BEM_IMOB = "IND_UTIL_BEM_IMOB";
    //06 - Mês/Ano de Aquisição dos Bens Incorporados ao
    //Ativo Imobilizado, com apuração de crédito com
    //base no valor de aquisição.
    public static String MES_OPER_AQUIS = "MES_OPER_AQUIS";
    //07 - Valor de Aquisição dos Bens Incorporados ao Ativo
    //Imobilizado – Crédito com base no valor de aquisição
    public static String VL_OPER_AQUIS = "VL_OPER_AQUIS";
    //08 - Parcela do Valor de Aquisição a excluir da base de cálculo de Crédito
    public static String PARC_OPER_NAO_BC_CRED = "PARC_OPER_NAO_BC_CRED";
    //09 - Valor da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado (07 – 08)
    public static String VL_BC_CRED = "VL_BC_CRED";
    //10
    /**Indicador do Número de Parcelas a serem apropriadas (Crédito sobre Valor de Aquisição):
     * 1 – Integral (Mês de Aquisição);
     * 2 – 12 Meses;
     * 3 – 24 Meses;
     * 4 – 48 Meses;
     * 5 – 6 Meses (Embalagens de bebidas frias)
     * 9 – Outra periodicidade definida em Lei
     */
    public static String IND_NR_PARC = "IND_NR_PARC";
    //11 - Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //12 - Base de cálculo Mensal do Crédito de PIS/PASEP, conforme indicador informado no campo 10.
    public static String VL_BC_PIS = "VL_BC_PIS";
    //13 - Alíquota do PIS/PASEP
    public static String ALIQ_PIS = "ALIQ_PIS";
    //14 - Valor do Crédito de PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //15 - Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
    public static String CST_COFINS = "CST_COFINS";
    //16 - Base de Cálculo Mensal do Crédito da COFINS, conforme indicador informado no campo 10.
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //17 - Alíquota da COFINS
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //18 - Valor do crédito da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //19 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    //20 - Código do Centro de Custos
    public static String COD_CCUS = "COD_CCUS";
    //21 - Descrição complementar do bem ou grupo de bens, com crédito apurado com base no valor de aquisição.
    public static String DESC_BEM_IMOB = "DESC_BEM_IMOB";

    public RegistroF130() {
        
        setName("Bens incorporados ao ativo imobilizado - operações geradoras de crédito com base no valor de aquisição/contribuição");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F130"));
        //02
        addFieldArchetype(NAT_BC_CRED, new FieldDefaultArchetype("10"));   
        //03
        addFieldArchetype(IDENT_BEM_IMOB, new FieldIntegerFixedLengthArchetype(2));
        //04
        FieldStringFixedLengthArchetype f04 = new FieldStringFixedLengthArchetype(1);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(IND_ORIG_CRED, f04); 
        //05
        addFieldArchetype(IND_UTIL_BEM_IMOB, new FieldIntegerFixedLengthArchetype(1));  
        //06
        addFieldArchetype(MES_OPER_AQUIS, new FieldDateFixedLengthArchetype("MMyyyy"));      
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        addFieldArchetype(VL_OPER_AQUIS, f07); 
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(PARC_OPER_NAO_BC_CRED, f08); 
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_BC_CRED, f09); 
        //10
        addFieldArchetype(IND_NR_PARC, new FieldIntegerFixedLengthArchetype(1));
        //11
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2)); 
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(13,4);
        f13.setFormat(fw4);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f14);
        //15
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f16); 
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(13,4);
        f17.setFormat(fw4);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f17);  
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f18);    
        //19
        FieldStringMaximumLengthArchetype f19 = new FieldStringMaximumLengthArchetype(60);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f19);
        //20
        FieldStringMaximumLengthArchetype f20 = new FieldStringMaximumLengthArchetype(60);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(COD_CCUS, f20); 
        //21
        FieldStringMaximumLengthArchetype f21 = new FieldStringMaximumLengthArchetype(255);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(DESC_BEM_IMOB, f21); 
    

    }
}
