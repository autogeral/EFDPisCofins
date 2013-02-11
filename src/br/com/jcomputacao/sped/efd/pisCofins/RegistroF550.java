package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class RegistroF550 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Valor total da receita auferida, referente à combinação de CST e Alíquota.
    public static String VL_REC_COMP = "VL_REC_COMP";
    //03 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //04 - Valor do desconto / exclusão da base de cálculo
    public static String VL_DESC_PIS = "VL_DESC_PIS";          
    //05 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS"; 
    //06 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS"; 
    //07 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS"; 
    //08 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS"; 
    //09 - Valor do desconto / exclusão da base de cálculo
    public static String VL_DESC_COFINS = "VL_DESC_COFINS"; 
    //10 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS"; 
    //11 - Alíquota da COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS"; 
    //12 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS"; 
    //13 - Código do modelo do documento fiscal conforme a Tabela 4.1.1
    public static String COD_MOD = "COD_MOD";
    //14 - Código fiscal de operação e prestação
    public static String CFOP = "CFOP"; 
    //15 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA"; 
    //16 - Informação complementar
    public static String INFO_COMPL = "INFO_COMPL"; 
    
    public RegistroF550(){
        setName("Consolidação das operações da pessoa jurídica submetida ao regime de tributação com base no lucro presumido - incidência do Pis/Pasep e da Cofins pelo regime de competência");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        fdm.setNullableRepresentation("");
        fdm.setFullFillingNullable(false);
        
        FieldDecimalMaximumLengthArchetype fdm4 = new FieldDecimalMaximumLengthArchetype(13,4);
        fdm4.setFormat(fw4);
        fdm4.setNullableRepresentation("");
        fdm4.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F550"));
        //02
        FieldDecimalMaximumLengthArchetype f02 = new FieldDecimalMaximumLengthArchetype(15,2);
        f02.setFormat(fw);
        addFieldArchetype(VL_REC_COMP, f02);
        //03
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(VL_DESC_PIS, fdm);
        //05
        addFieldArchetype(VL_BC_PIS, fdm);
        //06
        addFieldArchetype(ALIQ_PIS, fdm4);
        //07
        addFieldArchetype(VL_PIS, fdm);
        //08
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //09
        addFieldArchetype(VL_DESC_COFINS, fdm);
        //10
        addFieldArchetype(VL_BC_COFINS, fdm);
        //11
        addFieldArchetype(ALIQ_COFINS, fdm4);
        //12
        addFieldArchetype(VL_COFINS, fdm);
        //13
        FieldStringFixedLengthArchetype f13 = new FieldStringFixedLengthArchetype(2);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(COD_MOD, f13);
        //14
        FieldIntegerFixedLengthArchetype f14 = new FieldIntegerFixedLengthArchetype(4);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(CFOP, f14);
        //15
        FieldStringMaximumLengthArchetype f15 = new FieldStringMaximumLengthArchetype(60);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f15);
        //16
        FieldStringMaximumLengthArchetype f16 = new FieldStringMaximumLengthArchetype(255);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(INFO_COMPL, f15);
    }
}
