package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:38:37
 * @author rafael.galvao
 */
public class RegistroC181 extends LineArchetype{
    
    //01 - Fixo
    public static final String REG = "REG";
    //02
    /**Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3
     */
    public static final String CST_PIS = "CST_PIS";
    //03 - Código fiscal de operação e prestação
    public static final String CFOP = "CFOP";
    //04 - Valor do item
    public static final String VL_ITEM = "VL_ITEM";
    //05 - Valor do desconto comercial / Exclusão
    public static final String VL_DESC = "VL_DESC";
    //06 - Valor da base de cálculo do PIS/PASEP
    public static final String VL_BC_PIS = "VL_BC_PIS";
    //07 - Alíquota do PIS/PASEP (em percentual)
    public static final String ALIQ_PIS = "ALIQ_PIS";
    //08 - Quantidade – Base de cálculo PIS/PASEP
    public static final String QUANT_BC_PIS = "QUANT_BC_PIS";
    //09 - Alíquota do PIS/PASEP (em reais)
    public static final String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //10 - Valor do PIS/PASEP
    public static final String VL_PIS = "VL_PIS";
    //11 - Código da conta analítica contábil debitada/creditada
    public static final String COD_CTA = "COD_CTA";
    
    public RegistroC181(){
        setName("Detalhamento da consolidação - operação de vendas - Pis/Pasep");
        setDelimiter("|");
        
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C181"));
        //02
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        addFieldArchetype(VL_ITEM, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(13,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(16,3);
        f08.setFormat(fw3);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(17,4);
        f09.setFormat(fw4);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT,f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f10);
        //11
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        
        
        
    }
}
