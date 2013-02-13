package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 22/11/2011 20:20:26
 * @author rafael.galvao
 */
public class RegistroM210 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da contribuição social apurada no período, conforme a Tabela 4.3.5.
    public static String COD_CONT = "COD_CONT";
    //03 - Valor da Receita Bruta
    public static String VL_REC_BRT = "VL_REC_BRT";
    //04 - Valor da Base de Cálculo da Contribuição
    public static String VL_BC_CONT = "VL_BC_CONT";
    //05 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //06 - Quantidade – Base de cálculo PIS
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //07 - Alíquota do PIS (em reais)
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //08 - Valor total da contribuição social apurada
    public static String VL_CONT_APUR = "VL_CONT_APUR";
    //09 - Valor total dos ajustes de acréscimo
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    //10 - Valor total dos ajustes de redução
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    //11 - Valor da contribuição a diferir no período
    public static String VL_CONT_DIFER = "VL_CONT_DIFER";
    //12 - Valor da contribuição diferida em períodos anteriores
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    //13 - Valor Total da Contribuição do Período (08 + 09 – 10 – 11+12)
    public static String VL_CONT_PER = "VL_CONT_PER";
    
    public RegistroM210(){
        setName("Detalhamento da contribuição para o Pis/Pasep do período");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M210"));
        //02        
        addFieldArchetype(COD_CONT, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(VL_REC_BRT, fdm);
        //04
        addFieldArchetype(VL_BC_CONT, fdm);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(17,4);
        f05.setFormat(fw4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(16,3);
        f06.setFormat(fw3);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(17,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT, f07);
        //08
        addFieldArchetype(VL_CONT_APUR, fdm);
        //09
        addFieldArchetype(VL_AJUS_ACRES, fdm);
        //10
        addFieldArchetype(VL_AJUS_REDUC, fdm);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_CONT_DIFER, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(VL_CONT_DIFER_ANT, f12);
        //13
        addFieldArchetype(VL_CONT_PER, fdm);
        
    }
    
}
