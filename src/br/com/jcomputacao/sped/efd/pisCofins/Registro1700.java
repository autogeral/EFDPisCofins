
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 11:16:42
 * @author Douglas
 */
public class Registro1700 extends LineArchetype {

        //01
        public static String REG = "REG";
        //02
        public static String IND_NAT_RET = "IND_NAT_RET";
        //03
        public static String PR_REC_RET = "PR_REC_RET";
        //04
        public static String VL_RET_APU = "VL_RET_APU";
        //05
        public static String VL_RET_DED = "VL_CRED";
        //06
        public static String VL_RET_PER = "VL_RET_PER";
        //07
        public static String VL_RET_DCOMP = "VL_RET_DCOMP";
        //08
        public static String SLD_RET = "SLD_RET";

     public Registro1700(){
         setName("Controle dos Valores Retidos na Fonte – COFINS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1700"));
        //02
        addFieldArchetype(IND_NAT_RET, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(PR_REC_RET, new FieldDateFixedLengthArchetype("MMyyyy"));
        //04
        addFieldArchetype(VL_RET_APU , fdm);
        //05
        addFieldArchetype(VL_RET_DED , fdm);
        //06
        addFieldArchetype(VL_RET_PER, fdm);
        //07
        addFieldArchetype(VL_RET_DCOMP , fdm);
        //08
        addFieldArchetype(SLD_RET , fdm);

    }

}