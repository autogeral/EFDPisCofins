package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class RegistroF509 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Identificação do processo ou ato concessório
    public static String NUM_PROC = "NUM_PROC";
    //03
    /** Indicador da origem do processo:
     * 1 - Justiça Federal
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 - Outros
     */
    public static String IND_PROC = "IND_PROC";
    
    public RegistroF509() {

        setName("Processo referenciado");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F509"));
        //02
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        //03
        addFieldArchetype(IND_PROC, new FieldStringFixedLengthArchetype(1));
  }
}
