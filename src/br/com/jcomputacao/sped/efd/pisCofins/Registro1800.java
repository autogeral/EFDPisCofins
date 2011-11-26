
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 11:32:14
 * @author Douglas
 */
public class Registro1800 extends LineArchetype {

        public static String REG = "REG";
        public static String INC_IMOB = "INC_IMOB";
        public static String REC_RECEB_RET = "REC_RECEB_RET";
        public static String REC_FIN_RET = "REC_FIN_RET";
        public static String BC_RET = "BC_RET";
        public static String ALIQ_RET = "ALIQ_RET";
        public static String VL_REC_UNI = "VL_REC_UNI";
        public static String DT_REC_UNI = "DT_REC_UNI";
        public static String COD_REC = "COD_REC";


     public Registro1800(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1800"));
        addFieldArchetype(INC_IMOB, new FieldStringMaximumLengthArchetype(90));
        addFieldArchetype(REC_RECEB_RET, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(REC_FIN_RET , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(BC_RET , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_RET, new FieldDecimalMaximumLengthArchetype(6,2));
        addFieldArchetype(VL_REC_UNI , new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(DT_REC_UNI , new FieldIntegerMaximumLengthArchetype(8));
        addFieldArchetype(COD_REC , new FieldStringMaximumLengthArchetype(4));


    }

}