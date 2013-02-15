package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:22:54
 * @author WILL
 */
public class Registro9990 extends LineArchetype {
    
        //01
        public static final String REG = "REG";
        //002
        public static final String QTD_LIN_9 = "QTD_LIN_9";
  
    public Registro9990(){
        
        setName("Encerramento do Bloco 9");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("9990"));
        //02
        addFieldArchetype(QTD_LIN_9, new FieldIntegerMaximumLengthArchetype(19));
      
    }
    
}
