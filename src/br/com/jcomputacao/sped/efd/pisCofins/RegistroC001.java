package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:49:37
 * @author rafael.galvao
 */
public class RegistroC001 extends LineArchetype{

    //01 - Fixo
    public static final String REG = "REG";
    //02
    /**Indicador de movimento: 
     * 0 - Bloco com dados informados
     * 1 - Bloco sem dados informados
     */
    public static final String IND_MOV = "IND_MOV";

    public RegistroC001() {
        setName("Abertura do bloco C");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C001"));
        //02
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));

    }
}
