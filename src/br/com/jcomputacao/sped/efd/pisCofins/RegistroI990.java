package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class RegistroI990 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco I
    public static String QTD_LIN_I = "QTD_LIN_I";
    
    public RegistroI990(){
         setName("Encerramento do bloco I");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("I990"));
        //02
        addFieldArchetype(QTD_LIN_I, new FieldIntegerMaximumLengthArchetype(19));
        
    }
}
