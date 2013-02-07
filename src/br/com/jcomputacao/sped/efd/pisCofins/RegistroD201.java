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
public class RegistroD201 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //03 - Valor total dos itens
    public static String VL_ITEM = "VL_ITEM";
    //04 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //05 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //06 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //07 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD201() {
        setName("Totalização do resumo diário - Pis/Pasep");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D201"));
        //02
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(13,4);
        f05.setFormat(fw4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f06);
        //07
        FieldStringMaximumLengthArchetype f07 = new FieldStringMaximumLengthArchetype(60);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f07);
    }
}
