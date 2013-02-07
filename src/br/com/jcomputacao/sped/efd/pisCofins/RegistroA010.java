package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:29:18
 * @author Jonas
 */
public class RegistroA010 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - Número de inscrição do estabelecimento no CNPJ.
    public static String CNPJ = "CNPJ";
    
    public RegistroA010(){
        setName("Identificação do estabelecimento");
        setDelimiter("|");
         //01   
         addFieldArchetype(REG, new FieldDefaultArchetype("A010"));
         //02
         addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
    }
}
