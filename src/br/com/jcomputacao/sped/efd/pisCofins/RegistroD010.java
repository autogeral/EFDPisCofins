package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jeni
 */
public class RegistroD010 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - 
    public static String CNPJ = "CNPJ";
 
    public RegistroD010(){
        setName("Identificação do estabelecimento");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D010"));
        //02
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
    }
}
