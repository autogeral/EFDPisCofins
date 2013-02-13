package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * $[date] $[time]
 * @author rafael.galvao
 */
public class RegistroC195 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    public static String CNPJ_CPF_PART = "CNPJ_CPF_PART";
    //03
    public static String CST_COFINS = "CST_COFINS";
    //04
    public static String CFOP = "CFOP";
    //05
    public static String VL_ITEM = "VL_ITEM";
    //06
    public static String VL_DESC = "VL_DESC";
    //07
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //08
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //09
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //10
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //11
    public static String VL_COFINS = "VL_COFINS";
    //12
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC195(){
        setName("Detalhamento da consolidação - operações de aquisição com direito a crédito, e operações de devolução de compras e vendas - Cofins");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C195"));
        //02
        addFieldArchetype(CNPJ_CPF_PART, new FieldStringMaximumLengthArchetype(14));
        //03
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        addFieldArchetype(VL_ITEM, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(VL_DESC, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        addFieldArchetype(VL_BC_COFINS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(13,4);
        f08.setFormat(fw4);
        addFieldArchetype(ALIQ_COFINS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(16,3);
        f09.setFormat(fw3);
        addFieldArchetype(QUANT_BC_COFINS, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(17,4);
        f10.setFormat(fw4);
        addFieldArchetype(ALIQ_COFINS_QUANT, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_COFINS, f11);
        //12
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        
    }
}
