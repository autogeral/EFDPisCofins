package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 22:15:51
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC509 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Identificação do processo ou ato concessório
    public final static String NUM_PROC = "NUM_PROC";
    //03
    /**Indicador da origem do processo:
     * 1 - Justiça Federal
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 – Outros
     */
    public final static String IND_PROC = "IND_PROC";

    public RegistroC509() {
        setName("Processo referenciado");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C509"));
        //02
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        //03
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
    }
}
