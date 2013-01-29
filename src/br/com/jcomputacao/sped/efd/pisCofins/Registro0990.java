package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:18:09
 * @author rafael.galvao
 */
public class Registro0990 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco 0
    public static String QTD_LIN_0 = "QTD_LIN_0";
    
    public Registro0990(){
        setName("Encerramento do bloco 0");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0990"));
        //02
        addFieldArchetype(QTD_LIN_0, new FieldIntegerMaximumLengthArchetype(6));
    }
}
