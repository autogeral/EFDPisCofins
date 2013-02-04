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
 * 10/11/2011 19:52:26
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC481 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código da Situação Tributária referente ao PIS/PASEP
    public final static String CST_PIS = "CST_PIS";
    //03 - Valor total dos itens
    public final static String VL_ITEM = "VL_ITEM";
    //04 - Valor da base de cálculo do PIS/PASEP
    public final static String VL_BC_PIS = "VL_BC_PIS";
    //05 - Alíquota do PIS/PASEP (em percentual)
    public final static String ALIQ_PIS = "ALIQ_PIS";
    //06 - Quantidade – Base de cálculo PIS/PASEP
    public final static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //07 - Alíquota do PIS/PASEP (em reais)
    public final static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //08 - Valor do PIS/PASEP
    public final static String VL_PIS = "VL_PIS";
    //09 - Código do item (campo 02 do Registro 0200)
    public final static String COD_ITEM = "COD_ITEM";
    //10 - Código da conta analítica contábil debitada/creditada
    public final static String COD_CTA = "COD_CTA";

    public RegistroC481() {
        setName("Resumo diário de documentos emitidos por ECF - Pis/Pasep (sódigos 02 e 2D)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C481"));
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
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(12,4);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(16,3);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(17,4);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);      
        addFieldArchetype(ALIQ_PIS_QUANT, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(60);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f10);
    }
}
