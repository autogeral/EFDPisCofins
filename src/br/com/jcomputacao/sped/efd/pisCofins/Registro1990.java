package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class Registro1990 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco 1
    public static String QTD_LIN_1 = "QTD_LIN_1";
    
    public Registro1990(){
        setName("Encerramento do bloco 1");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1990"));
        //02
        addFieldArchetype(QTD_LIN_1, new FieldIntegerMaximumLengthArchetype(6));
    }
}
