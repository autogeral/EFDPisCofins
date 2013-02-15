package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class RegistroP001 extends LineArchetype{
        //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador de movimento: 
     *0- Bloco com dados informados;
     * 1- Bloco sem dados informados
     */
    public static String IND_MOV = "IND_MOV";

    public RegistroP001() {
        setName("Abertura do bloco P");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("P001"));
        //02
        addFieldArchetype(IND_MOV, new FieldStringMaximumLengthArchetype(1));
    }
}
