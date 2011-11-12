/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
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
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));        
        addFieldArchetype(PER_APU_CRED, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CNPJ_SUC, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(VL_CRED_APU, new FieldIntegerFixedLengthArchetype(20));
        addFieldArchetype(VL_CRED_EXT_APU, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CRED_APU, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DESC_PA_ANT, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PER_PA_ANT, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DCOMP_PA_ANT, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(SD_CRED_DISP_EFD, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DESC_EFD, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PER_EFD, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DCOMP_EFD, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DCOMP_EFD, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_OUT, new FieldDecimalFixedLengthArchetype(20,2));
        addFieldArchetype(SLD_CRED_FIM, new FieldDecimalFixedLengthArchetype(20,2));

    }
    
}
