package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:57:27
 * @author WILL
 */
public class Registro1100 extends LineArchetype {
        public static String REG = "REG";
        public static String PER_APU_CRED = "PER_APU_CRED";
        public static String ORIG_CRED = "ORIG_CRED";
        public static String CNPJ_SUC = "CNPJ_SUC";
        public static String COD_CRED = "COD_CRED";
        public static String VL_CRED_APU = "VL_CRED_APU";
        public static String VL_CRED_EXT_APU = "VL_CRED_EXT_APU";
        public static String VL_TOT_CRED_APU = "VL_TOT_CRED_APU";
        public static String VL_CRED_DESC_PA_ANT = "VL_CRED_DESC_PA_ANT";
        public static String VL_CRED_PER_PA_ANT = "VL_CRED_PER_PA_ANT";
        public static String VL_CRED_DCOMP_PA_ANT = "VL_CRED_DCOMP_PA_ANT";
        public static String SD_CRED_DISP_EFD = "SD_CRED_DISP_EFD";
        public static String VL_CRED_DESC_EFD = "VL_CRED_DESC_EFD";
        public static String VL_CRED_PER_EFD = "VL_CRED_PER_EFD";
        public static String VL_CRED_DCOMP_EFD = "VL_CRED_DCOMP_EFD";
        public static String VL_CRED_TRANS = "VL_CRED_TRANS";
        public static String VL_CRED_OUT = "VL_CRED_OUT";
        public static String SLD_CRED_FIM = "SLD_CRED_FIM";

    
    public Registro1100(){
        setName("");
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
        addFieldArchetype(REG, new FieldDefaultArchetype("1100"));        
        //02
        addFieldArchetype(PER_APU_CRED, new FieldDateFixedLengthArchetype("MMyyyy"));
        //03
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        //04
        FieldIntegerFixedLengthArchetype f04 = new FieldIntegerFixedLengthArchetype(14);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(CNPJ_SUC, f04);
        //05
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(3));
        //06
        addFieldArchetype(VL_CRED_APU, fdm2);
        //07
        addFieldArchetype(VL_CRED_EXT_APU, fdm2);
        //08
        addFieldArchetype(VL_TOT_CRED_APU, fdm);
        //09
        addFieldArchetype(VL_CRED_DESC_PA_ANT, fdm);
        //10
        addFieldArchetype(VL_CRED_PER_PA_ANT, fdm2);
        //11
        addFieldArchetype(VL_CRED_DCOMP_PA_ANT, fdm2);
        //12
        addFieldArchetype(SD_CRED_DISP_EFD, fdm);
        //13
        addFieldArchetype(VL_CRED_DESC_EFD, fdm2);
        //14
        addFieldArchetype(VL_CRED_PER_EFD, fdm2);
        //15
        addFieldArchetype(VL_CRED_DCOMP_EFD, fdm2);
        //16
        addFieldArchetype(VL_CRED_DCOMP_EFD, fdm2);
        //17
        addFieldArchetype(VL_CRED_OUT, fdm2);
        //18
        addFieldArchetype(SLD_CRED_FIM, fdm2);

    }
    
}
