package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:30:22
 * @author WILL
 */
public class Registro9999 extends LineArchetype {
    
        //01
        public static final String REG = "REG";
        //02
        public static final String QTD_LIN = "QTD_LIN";
   
    public Registro9999(){
        
        setName("Encerramento do Arquivo Digital");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("9999"));
        //02
        addFieldArchetype(QTD_LIN, new FieldIntegerMaximumLengthArchetype(19));
      
    }    
}
