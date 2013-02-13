package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:07:52
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC396 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "ITENS DO DOCUMENTO (CÓDIGOS 02, 2D, 2E e 59) – AQUISIÇÕES/ENTRADAS COM CRÉDITO";
    }
    //01 - Fixo 
    public final static String REG = "REG";
    //02 - Código do item (campo 02 do Registro 0200)
    public final static String COD_ITEM = "COD_ITEM";
    //03 - Valor total do item (mercadorias ou serviços)
    public final static String VL_ITEM = "VL_ITEM";
    //04 - Valor do desconto comercial do item
    public final static String VL_DESC = "VL_DESC";
    //05 - Código da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7.
    public final static String NAT_BC_CRED = "NAT_BC_CRED";
    //06 - Código da Situação Tributária referente ao PIS/PASEP
    public final static String CST_PIS = "CST_PIS";
    //07 - Valor da base de cálculo do crédito de PIS/PASEP
    public final static String VL_BC_PIS = "VL_BC_PIS";
    //08 - Alíquota do PIS/PASEP (em percentual)
    public final static String ALIQ_PIS = "ALIQ_PIS";
    //09 - Valor do crédito de PIS/PASEP
    public final static String VL_PIS = "VL_PIS";
    //10 - Código da Situação Tributária referente a COFINS
    public final static String CST_COFINS = "CST_COFINS";
    //11 - Valor da base de cálculo do crédito de COFINS
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    //12 - Alíquota da COFINS (em percentual)
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    //13 - Valor do crédito de COFINS
    public final static String VL_COFINS = "VL_COFINS";
    //14 - Código da conta analítica contábil debitada/creditada
    public final static String COD_CTA = "COD_CTA";

    public RegistroC396() {
        setName("Itens do documento (códigos 02, 2D, 2E e 59) aquisições/entradas com crédito");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C396"));
        //02
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f04);
        //05
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        //06
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //07
        FieldDecimalMaximumLengthArchetype f07 =  new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(13,4);
        f08.setFormat(fw4);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f09);
        //10
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(13,4);
        f12.setFormat(fw4);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f13);
        //14
        FieldStringMaximumLengthArchetype f14 = new FieldStringMaximumLengthArchetype(60);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f14);

    }
}
