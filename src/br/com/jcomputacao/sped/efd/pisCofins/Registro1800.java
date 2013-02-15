
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 11:32:14
 * @author Douglas
 */
public class Registro1800 extends LineArchetype {

        //01
        public static String REG = "REG";
        //02
        public static String INC_IMOB = "INC_IMOB";
        //03
        public static String REC_RECEB_RET = "REC_RECEB_RET";
        //04
        public static String REC_FIN_RET = "REC_FIN_RET";
        //05
        public static String BC_RET = "BC_RET";
        //06
        public static String ALIQ_RET = "ALIQ_RET";
        //07
        public static String VL_REC_UNI = "VL_REC_UNI";
        //08
        public static String DT_REC_UNI = "DT_REC_UNI";
        //09
        public static String COD_REC = "COD_REC";


     public Registro1800(){
         
        setName("Incorporação Imobiliária – RET");
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
        addFieldArchetype(REG, new FieldDefaultArchetype("1800"));
        //02
        addFieldArchetype(INC_IMOB, new FieldStringMaximumLengthArchetype(90));
        //03
        addFieldArchetype(REC_RECEB_RET, fdm);
        //04
        addFieldArchetype(REC_FIN_RET , fdm2);
        //05
        addFieldArchetype(BC_RET , fdm);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(9,2);
        f06.setFormat(fw);
        addFieldArchetype(ALIQ_RET, f06);
        //07
        addFieldArchetype(VL_REC_UNI , fdm);
        //08
        FieldDateFixedLengthArchetype f08 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(DT_REC_UNI , f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(4);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(COD_REC , f09);


    }

}