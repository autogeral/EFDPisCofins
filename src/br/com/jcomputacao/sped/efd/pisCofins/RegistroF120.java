package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:04:03
 * @author Jonas
 */
public class RegistroF120 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7:
     * 09 = Crédito com Base nos Encargos de Depreciação; 
     * 11 = Crédito com Base nos Encargos de Amortização
     */
    public static String NAT_BC_CREDN = "NAT_BC_CREDN";
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
    //06 - Valor do Encargo de Depreciação/Amortização Incorrido no Período
    public static String VL_OPER_DEP = "VL_OPER_DEP";
    //07 - Parcela do Valor do Encargo de Depreciação/Amortização a excluir da base de cálculo de Crédito
    public static String PARC_OPER_NAO_BC_CRED = "PARC_OPER_NAO_BC_CRED";
    //08 - Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //09 - Base de cálculo do Crédito de PIS/PASEP no período (06 – 07)
    public static String VL_BC_PIS = "VL_BC_PIS";
    //10 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //11 - Valor do Crédito de PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //12 - Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
    public static String CST_COFINS = "CST_COFINS";
    //13 - Base de Cálculo do Crédito da COFINS no período (06 – 07)
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //14 - Alíquota da COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //15 - Valor do crédito da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //16 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    //17 - Código do Centro de Custos
    public static String COD_CCUS = "COD_CCUS";
    //18 - Descrição complementar do bem ou grupo de bens,
    //com crédito apurado com base nos encargos de
    //depreciação ou amortização.
    public static String DESC_BEM_IMOB = "DESC_BEM_IMOB";

    public RegistroF120() {
        setName("");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F120"));
        //02
        addFieldArchetype(NAT_BC_CREDN, new FieldStringFixedLengthArchetype(2));
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
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(VL_OPER_DEP, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(PARC_OPER_NAO_BC_CRED, f07);
        //08
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(13,4);
        f10.setFormat(fw4);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f11);
        //12
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(13,4);
        f14.setFormat(fw4);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f15);
        //16
        FieldStringMaximumLengthArchetype f16 = new FieldStringMaximumLengthArchetype(60);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f16);
        //17
        FieldStringMaximumLengthArchetype f17 = new FieldStringMaximumLengthArchetype(60);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(COD_CCUS, f17);
        //18
        FieldStringMaximumLengthArchetype f18 = new FieldStringMaximumLengthArchetype(255);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(DESC_BEM_IMOB, f18);

    }
}
