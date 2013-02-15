package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class RegistroP990 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco P
    public static String QTD_LIN_P = "QTD_LIN_P";
    
    public RegistroP990(){
         setName("Encerramento do bloco P");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("P990"));
        //02
        addFieldArchetype(QTD_LIN_P, new FieldIntegerMaximumLengthArchetype(19));
        
    }
}
