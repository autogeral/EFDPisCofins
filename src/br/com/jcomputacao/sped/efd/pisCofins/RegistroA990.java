package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 10/11/2011 20:41:22
 * @author Jonas
 */
public class RegistroA990 extends LineArchetype{
    
       //01 - Fixo
       public static String REG = "REG";
       //02 - Quantidade total de linhas do Bloco A
       public static String QTD_LIN_A = "QTD_LIN_A";
       
       public RegistroA990(){
           setName("Encerramento do bloco A");
           setDelimiter("|");
           //01
           addFieldArchetype(REG, new FieldDefaultArchetype("A990"));
           //02
           addFieldArchetype(QTD_LIN_A , new FieldIntegerMaximumLengthArchetype(6)); 
       }
    
}
