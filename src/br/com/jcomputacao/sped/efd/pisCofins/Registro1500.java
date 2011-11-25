
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/11/2011 10:44:35
 * @author Douglas
 */
public class Registro1500 extends LineArchetype {

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


    public Registro1500(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1500"));
        addFieldArchetype(PER_APU_CRED, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CNPJ_SUC , new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(VL_CRED_APU, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_EXT_APU, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_CRED_APU, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DESC_PA_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PER_PA_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DCOMP_PA_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(SD_CRED_DISP_EFD, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DESC_EFD, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PER_EFD, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_DCOMP_EFD, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_TRANS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_OUT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(SLD_CRED_FIM, new FieldDecimalMaximumLengthArchetype(20,2));

    }

}