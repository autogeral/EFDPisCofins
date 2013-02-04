package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.text.NumberFormat;

/**
 * 09/11/2011 21:46:15
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC385 extends LineArchetype{
    
    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código da Situação Tributária referente a COFINS.
    public final static String CST_COFINS = "CST_COFINS";
    //03 - Código do item (campo 02 do Registro 0200)
    public final static String COD_ITEM = "COD_ITEM";
    //04 - Valor total dos itens
    public final static String VL_ITEM = "VL_ITEM";
    //05 - Valor da base de cálculo da COFINS
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    //06 - Alíquota da COFINS (em percentual)
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    //07 - Quantidade – Base de cálculo da COFINS
    public final static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //08 - Alíquota da COFINS (em reais)
    public final static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //09 - Valor da COFINS
    public final static String VL_COFINS = "VL_COFINS";
    //10 - Código da conta analítica contábil debitada/creditada
    public final static String COD_CTA = "COD_CTA";

    public RegistroC385() {
        
        setName("Detalhamento da consolidaão - Cofins");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //Teste
        FormatWrapper fw1 = FormatFactory.getFormat(FormatType.DECIMAL);
        fw1.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C385"));
        //02
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        addFieldArchetype(VL_ITEM, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_COFINS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(12,4);
        //((NumberFormat)fw1.getInternalFormat()).setMinimumFractionDigits(4);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(16,3);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_COFINS, f07);
        //08
         FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(17,4);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS_QUANT, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_COFINS, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f10);
    }
    
}
