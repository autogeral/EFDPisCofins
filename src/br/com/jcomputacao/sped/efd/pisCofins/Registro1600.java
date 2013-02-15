
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 10:14:34
 * @author Douglas
 */
public class Registro1600 extends LineArchetype {

    //01
        public static String REG = "REG";
        //02
        public static String PER_APUR_ANT = "PER_APUR_ANT";
        //03
        public static String NAT_CONT_REC = "NAT_CONT_REC";
        //04
        public static String VL_CONT_APUR = "VL_CONT_APUR";
        //05
        public static String VL_CRED_COFINS_DESC = "VL_CRED_COFINS_DESC";
        //06
        public static String VL_CONT_DEV = "VL_CONT_DEV";
        //07
        public static String VL_OUT_DED = "VL_OUT_DED";
        //08
        public static String VL_CONT_EXT = "VL_CONT_EXT";
        //09
        public static String VL_MUL = "VL_MUL";
        //10
        public static String VL_JUR = "VL_JUR";
        //11
        public static String DT_RECOL = "DT_RECOL";


    public Registro1600(){
        setName("Contribuição Social Extemporânea – COFINS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        FieldDecimalMaximumLengthArchetype fdm2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm2.setFormat(fw);
        fdm2.setNullableRepresentation("");
        fdm2.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1600"));
        //02
        addFieldArchetype(PER_APUR_ANT, new FieldDateFixedLengthArchetype("MMyyyy"));
        //03
        addFieldArchetype(NAT_CONT_REC, new FieldStringMaximumLengthArchetype(2));
        //04
        addFieldArchetype(VL_CONT_APUR , fdm);
        //05
        addFieldArchetype(VL_CRED_COFINS_DESC, fdm);
        //06
        addFieldArchetype(VL_CONT_DEV, fdm);;
        //07
        addFieldArchetype(VL_OUT_DED, fdm);
        //08
        addFieldArchetype(VL_CONT_EXT, fdm);
        //09
        addFieldArchetype(VL_MUL, fdm2);
        //10
        addFieldArchetype(VL_JUR, fdm2);
        //11
        addFieldArchetype(DT_RECOL, new FieldDateFixedLengthArchetype("ddMMyyyy"));


    }

}