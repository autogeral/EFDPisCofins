package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:17:14
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC495 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código do item (campo 02 do Registro 0200)
    public final static String COD_ITEM = "COD_ITEM";
    //03 - Código da Situação Tributária referente a COFINS.
    public final static String CST_COFINS = "CST_COFINS";
    //04 - Código fiscal de operação e prestação
    public final static String CFOP = "CFOP";
    //05 - Valor total dos itens
    public final static String VL_ITEM = "VL_ITEM";
    //06 - Valor da base de cálculo da COFINS
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    //07 - Alíquota da COFINS (em percentual)
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    //08 - Quantidade – Base de cálculo da COFINS
    public final static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //09 - Alíquota da COFINS (em reais)
    public final static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //10 - Valor da COFINS
    public final static String VL_COFINS = "VL_COFINS";
    //11 - Código da conta analítica contábil debitada/creditada
    public final static String COD_CTA = "COD_CTA";

    public RegistroC495() {
        setName("Detalhamento da consolidação de documentos emitidos por EDF (códigos 02, 2D e 59) - Cofins");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C495"));
        //02
        FieldStringMaximumLengthArchetype f02 = new FieldStringMaximumLengthArchetype(60);
        f02.setNullableRepresentation("");
        f02.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f02);
        //03
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //04
        FieldIntegerFixedLengthArchetype f04 = new FieldIntegerFixedLengthArchetype(4);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(CFOP, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        addFieldArchetype(VL_ITEM, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(13,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(16,3);
        f08.setFormat(fw3);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(17,4);
        f09.setFormat(fw4);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f10);
        //11
        FieldStringMaximumLengthArchetype f11 = new FieldStringMaximumLengthArchetype(60);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f11);

    }
}
