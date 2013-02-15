
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 26/11/2011 11:04:21
 * @author Douglas
 */
public class Registro1620 extends LineArchetype {
    
        //01
        public static String REG = "REG";
        //02
        public static String PER_APU_CRED = "PER_APU_CRED";
        //03
        public static String ORIG_CRED = "ORIG_CRED";
        //04
        public static String COD_CRED = "COD_CRED";
        //05
        public static String VL_CRED = "VL_CRED";

     public Registro1620(){
        
         setName("Demonstração do Crédito a Descontar da Contribuição Extemporânea – COFINS");
        setDelimiter("|");
         
         
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw); 
        
         //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1620"));
        //02
        addFieldArchetype(PER_APU_CRED, new FieldDateFixedLengthArchetype("MMyyyy"));
        //03
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(COD_CRED , new FieldIntegerFixedLengthArchetype(3));
        //05
        addFieldArchetype(VL_CRED , fdm);

    }

}