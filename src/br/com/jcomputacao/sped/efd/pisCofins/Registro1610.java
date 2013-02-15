
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 10:35:03
 * @author Douglas
 */
public class Registro1610 extends LineArchetype {

        //01
        public static String REG = "REG";
        //02
        public static String CNPJ = "CNPJ";
        //03
        public static String CST_COFINS = "CST_COFINS";
        //04
        public static String COD_PART = "COD_PART";
        //05
        public static String DT_OPER = "DT_OPER";
        //06
        public static String VL_OPER = "VL_OPER";
        //07
        public static String VL_BC_COFINS = "VL_BC_COFINS";
        //08
        public static String ALIQ_COFINS = "ALIQ_COFINS";
        //09
        public static String VL_COFINS = "VL_COFINS";
        //10
        public static String COD_CTA = "COD_CTA";
        //11
        public static String DESC_COMPL = "DESC_COMPL";


    public Registro1610(){
        setName("Detalhamento da Contribuição Social Extemporânea – COFINS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm2.setFormat(fw);
        FieldDecimalMaximumLengthArchetype fdm3 = new FieldDecimalMaximumLengthArchetype(16,3);
        fdm3.setFormat(fw3);
        FieldDecimalMaximumLengthArchetype fdm4 = new FieldDecimalMaximumLengthArchetype(17,4);
        fdm4.setFormat(fw4);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1610"));
        //02
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //03
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(60);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_PART, f04);
        //05
        addFieldArchetype(DT_OPER, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //06
        addFieldArchetype(VL_OPER, fdm2);
        //07
        addFieldArchetype(VL_BC_COFINS, fdm3);
        //08
        addFieldArchetype(ALIQ_COFINS, fdm4);
        //09
        addFieldArchetype(VL_COFINS, fdm2);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f10);
        //11
        FieldStringMaximumLengthArchetype f11 = new FieldStringMaximumLengthArchetype(255);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(DESC_COMPL, f11);


    }

}
