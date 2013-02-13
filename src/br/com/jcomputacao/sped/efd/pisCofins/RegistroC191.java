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
public class RegistroC191 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02 - CNPJ/CPF do Participante a que se referem as operações consolidadas neste registro (pessoa jurídica ou pessoa física vendedora/remetente)
    public static String CNPJ_CPF_PART = "CNPJ_CPF_PART";
    //03 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //04 - Código fiscal de operação e prestação
    public static String CFOP = "CFOP";
    //05 - Valor do item
    public static String VL_ITEM = "VL_ITEM";
    //06 - Valor do desconto comercial / Exclusão
    public static String VL_DESC = "VL_DESC";
    //07 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //08 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //09 - Quantidade – Base de cálculo PIS/PASEP
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //10 - Alíquota do PIS/PASEP (em reais)
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //11 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //12 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC191(){
        setName("Detalhamento da consolidação - operações de aquisição com direito a crédito, e operações de devolução de compras e vendas - Pis/Pasep");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C191"));
        //02
        addFieldArchetype(CNPJ_CPF_PART, new FieldStringMaximumLengthArchetype(14));
        //03
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
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
        addFieldArchetype(VL_BC_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(13,4);
        f08.setFormat(fw4);
        addFieldArchetype(ALIQ_PIS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 =  new FieldDecimalMaximumLengthArchetype(16,3);
        f09.setFormat(fw3);
        addFieldArchetype(QUANT_BC_PIS, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(17,4);
        f10.setFormat(fw4);
        addFieldArchetype(ALIQ_PIS_QUANT, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(17,2);
        f11.setFormat(fw);
        addFieldArchetype(VL_PIS, f11);
        //12
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        
    }
    
}
