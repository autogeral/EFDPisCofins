package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:31:41
 * @author WILL
 */
public class Registro1101 extends LineArchetype {
        
        public static String REG = "REG";
        public static String COD_PART = "COD_PART";
        public static String COD_ITEM = "COD_ITEM";
        public static String COD_MOD = "COD_MOD";
        public static String SER = "SER";
        public static String SUB_SER = "SUB_SER";
        public static String NUM_DOC = "NUM_DOC";
        public static String DT_OPER = "DT_OPER";
        public static String CHV_NFE = "CHV_NFE";
        public static String VL_OPER = "VL_OPER";
        public static String CFOP = "CFOP";
        public static String NAT_BC_CRED = "NAT_BC_CRED";
        public static String IND_ORIG_CRED = "IND_ORIG_CRED";
        public static String CST_PIS = "CST_PIS";
        public static String VL_BC_PIS = "VL_BC_PIS";
        public static String ALIQ_PIS = "ALIQ_PIS";
        public static String VL_PIS = "VL_PIS   ";
        public static String COD_CTA = "COD_CTA";
        public static String COD_CCUS = "COD_CCUS";
        public static String DESC_COMPL = "DESC_COMPL";
        public static String PER_ESCRIT = "PER_ESCRIT";
        public static String CNPJ = "CNPJ";

    
    public Registro1101(){
        setName("Apuração de Crédito Extemporâneo - Documentos e Operações de Períodos Anteriores – PIS/PASEP");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1101"));        
        //02
        FieldStringMaximumLengthArchetype f02 = new FieldStringMaximumLengthArchetype(60);
        f02.setNullableRepresentation("");
        f02.setFullFillingNullable(false);
        addFieldArchetype(COD_PART, f02);
        //03
        FieldStringMaximumLengthArchetype f03 = new FieldStringMaximumLengthArchetype(60);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f03);
        //04
        FieldStringFixedLengthArchetype f04 = new FieldStringFixedLengthArchetype(2);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_MOD, f04);
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SER, f05);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(3);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(SUB_SER, f06);
        //07
        FieldIntegerMaximumLengthArchetype f07 = new FieldIntegerMaximumLengthArchetype(9);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC, f07);
        //08
        addFieldArchetype(DT_OPER, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //09
        FieldStringFixedLengthArchetype f09 = new FieldStringFixedLengthArchetype(44);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CHV_NFE, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_OPER, f10);
        //11
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //12
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        //13
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1));
        //14
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(16,3);
        f15.setFormat(fw3);
        addFieldArchetype(VL_BC_PIS, f15);
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(17,4);
        f16.setFormat(fw4);
        addFieldArchetype(ALIQ_PIS, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(15,2);
        f17.setFormat(fw);
        addFieldArchetype(VL_PIS, f17);
        //18
        FieldStringMaximumLengthArchetype f18 = new FieldStringMaximumLengthArchetype(60);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f18);
        //19
        FieldStringMaximumLengthArchetype f19 = new FieldStringMaximumLengthArchetype(60);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(COD_CCUS, f19);
        //20
        FieldStringMaximumLengthArchetype f20 = new FieldStringMaximumLengthArchetype(255);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(DESC_COMPL, f20);
        //21
        FieldIntegerFixedLengthArchetype f21 = new FieldIntegerFixedLengthArchetype(6);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(PER_ESCRIT, f21);
        //22
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        

    }
    
}
