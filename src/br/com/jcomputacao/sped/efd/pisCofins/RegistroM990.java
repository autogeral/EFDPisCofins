package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:26:57
 * @author rafael.galvao
 */
public class RegistroM990 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco M
    public static String QTD_LIN_M = "QTD_LIN_M";
    
    public RegistroM990(){
         setName("Encerramento do bloco M");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M990"));
        //02
        addFieldArchetype(QTD_LIN_M, new FieldIntegerMaximumLengthArchetype(19));
        
    }    
}
