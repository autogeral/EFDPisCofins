package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD990 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco C
    public static String QTD_LIN_D = "QTD_LIN_D";

    public RegistroD990() {
        setName("Encerramento do bloco D");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D990"));
        //02
        addFieldArchetype(QTD_LIN_D, new FieldIntegerMaximumLengthArchetype(20));
    }
}
