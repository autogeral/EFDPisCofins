package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 20:09:06
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC485 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código da Situação Tributária referente a COFINS.
    public final static String CST_COFINS = "CST_COFINS";
    //03 - Valor total dos itens
    public final static String VL_ITEM = "VL_ITEM";
    //04 - Valor da base de cálculo da COFINS
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    //05 - Alíquota da COFINS (em percentual)
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    //06 - Quantidade – Base de cálculo da COFINS
    public final static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //07 - Alíquota da COFINS (em reais)
    public final static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //08 - Valor da COFINS
    public final static String VL_COFINS = "VL_COFINS";
    //09 - Código do item (campo 02 do Registro 0200)
    public final static String COD_ITEM = "COD_ITEM";
    //10 - Código da conta analítica contábil debitada/creditada
    public final static String COD_CTA = "COD_CTA";

    public RegistroC485() {
        setName("Resumo diário de documentos emitidos por ECF - Cofins (códigos 02 e 2D)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C485"));
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
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(12,4);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(16,3);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(17,4);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(60);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
    }
}
