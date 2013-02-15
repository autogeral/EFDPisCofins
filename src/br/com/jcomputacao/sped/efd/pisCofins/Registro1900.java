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
public class Registro1900 extends LineArchetype {
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - 
    public static String CNPJ = "CNPJ";
    //03 - 
    public static String COD_MOD = "COD_MOD";
    //04 - 
    public static String SER = "SER";
    //05 - 
    public static String SUB_SER = "SUB_SER";
    //06 - 
    public static String COD_SIT = "COD_SIT";
    //07 - 
    public static String VL_TOT_REC = "VL_TOT_REC";
    //08 - 
    public static String QUANT_DOC = "QUANT_DOC";
    //09 - 
    public static String CST_PIS = "CST_PIS";
    //10 - 
    public static String CST_COFINS = "CST_COFINS";
    //11 - 
    public static String CFOP = "CFOP";
    //12 -
    public static String INF_COMPL = "INF_COMPL";
    //13 -
    public static String COD_CTA = "COD_CTA";
    
    public Registro1900 (){
        setName("Consolidação dos Documentos Emitidos por Pessoa Jurídica Submetida ao Regime de Tributação com Base no Lucro Presumido – Regime de Caixa ou de Competência");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1900"));
        //02
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //03
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(4);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(SER, f04);
        //05
        FieldIntegerMaximumLengthArchetype f05 = new FieldIntegerMaximumLengthArchetype(19);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SUB_SER, f05);
        //06
        FieldIntegerFixedLengthArchetype f06 = new FieldIntegerFixedLengthArchetype(2);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(COD_SIT, f06);
        //07
        addFieldArchetype(VL_TOT_REC, fdm);
        //08
        FieldIntegerMaximumLengthArchetype f08 = new FieldIntegerMaximumLengthArchetype(19);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(QUANT_DOC, f08);
        //09
        FieldIntegerFixedLengthArchetype f09 = new FieldIntegerFixedLengthArchetype(2);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CST_PIS, f09);
        //10
        FieldIntegerFixedLengthArchetype f10 = new FieldIntegerFixedLengthArchetype(2);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(CST_COFINS, f10);
        //11
        FieldIntegerFixedLengthArchetype f11 = new FieldIntegerFixedLengthArchetype(4);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(CFOP, f11);
        //12
        FieldStringMaximumLengthArchetype f12 = new FieldStringMaximumLengthArchetype(255);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(INF_COMPL, f12);
        //13
        FieldStringMaximumLengthArchetype f13 = new FieldStringMaximumLengthArchetype(60);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f13);
    }
}
