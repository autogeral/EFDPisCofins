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
public class RegistroD205 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS";
    //03 - Valor total dos itens
    public static String VL_ITEM = "VL_ITEM";
    //04 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //05 - Alíquota da COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //06 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //07 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD205() {
        setName("Totalização do resumo diário - Cofins");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D205"));
        //02
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(13,4);
        f05.setFormat(fw4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f06);
        //07
        FieldStringMaximumLengthArchetype f07 = new FieldStringMaximumLengthArchetype(60);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f07);
    }
}
