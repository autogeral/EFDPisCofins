package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 20:48:51
 * @author Jonas
 */
public class RegistroF001 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador de movimento: 
     *0- Bloco com dados informados;
     * 1- Bloco sem dados informados
     */
    public static String IND_MOV = "QTD_LIN_A";

    public RegistroF001() {
        setName("Abertura do bloco F");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F001"));
        //02
        addFieldArchetype(IND_MOV, new FieldStringMaximumLengthArchetype(1));
    }
}
