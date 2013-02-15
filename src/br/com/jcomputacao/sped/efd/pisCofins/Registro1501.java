
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 08:09:41
 * @author Douglas
 */
public class Registro1501 extends LineArchetype {

        //01
        public static String REG = "REG";
        //02
        public static String COD_PART = "COD_PART";
        //03
        public static String COD_ITEM = "COD_ITEM";
        //04
        public static String COD_MOD = "COD_MOD";
        //05
        public static String SER = "SER";
        //06
        public static String SUB_SER = "SUB_SER";
        //07
        public static String NUM_DOC = "NUM_DOC";
        //08
        public static String DT_OPER = "DT_OPER";
        //09
        public static String CHV_NFE = "CHV_NFE";
        //10
        public static String VL_OPER = "VL_OPER";
        //11
        public static String CFOP = "CFOP";
        //12
        public static String NAT_BC_CRED = "NAT_BC_CRED";
        //13
        public static String IND_ORIG_CRED = "IND_ORIG_CRED";
        //14
        public static String CST_COFINS = "CST_COFINS";
        //15
        public static String VL_BC_COFINS = "VL_BC_COFINS";
        //16
        public static String ALIQ_COFINS = "ALIQ_COFINS";
        //17
        public static String VL_COFINS = "VL_COFINS";
        //18
        public static String COD_CTA = "COD_CTA";
        //19
        public static String COD_CCUS = "COD_CCUS";
        //20
        public static String DESC_COMPL = "DESC_COMPL";
        //21
        public static String PER_ESCRIT = "PER_ESCRIT";
        //22
        public static String CNPJ = "CNPJ";


    public Registro1501(){
        setName("Apuração de Crédito Extemporâneo - Documentos e Operações de Períodos Anteriores – COFINS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm2  = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm2.setFormat(fw);
        FieldDecimalMaximumLengthArchetype fdm3 = new FieldDecimalMaximumLengthArchetype(16,3);
        fdm3.setFormat(fw3);
        FieldDecimalMaximumLengthArchetype fdm4 = new FieldDecimalMaximumLengthArchetype(17,4);
        fdm4.setFormat(fw4);

        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1501"));
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
        addFieldArchetype(COD_MOD , f04);
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
        addFieldArchetype(VL_OPER, fdm2);
        //11
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        //12
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        //13
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1));
        //14
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //15
        addFieldArchetype(VL_BC_COFINS, fdm3);
        //16
        addFieldArchetype(ALIQ_COFINS, fdm4);
        //17
        addFieldArchetype(VL_COFINS, fdm2);
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
        FieldDateFixedLengthArchetype f21 = new FieldDateFixedLengthArchetype("MMyyyy");
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(PER_ESCRIT, f21);
        //22
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));


    }

}