package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroC990 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco C
    public static String QTD_LIN_C = "QTD_LIN_C";
    
    public RegistroC990() {
        setName("Encerramento do bloco C");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C990"));
        //02
        addFieldArchetype(QTD_LIN_C, new FieldIntegerMaximumLengthArchetype(20));
    }
}
