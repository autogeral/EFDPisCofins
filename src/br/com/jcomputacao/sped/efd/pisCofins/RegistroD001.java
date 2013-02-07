package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD001 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador de movimento:
     * 0- Bloco com dados informados;
     * 1- Bloco sem dados informados
     */
    public static String IND_MOV = "IND_MOV";

    public RegistroD001() {
        setName("Abertura do bloco D");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D001"));
        //02
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));
    }
}
