package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:15:26
 * @author Jonas
 */
public class RegistroA001 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador de movimento: 
     * 0 - Bloco com dados informados
     * 1 - Bloco sem dados informados
     */
    public static String IND_MOV = "IND_MOV";
    
    public RegistroA001(){
        setName("Abertura do bloco A");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("A001"));
        //02
        addFieldArchetype(IND_MOV, new FieldStringFixedLengthArchetype(1));
    }
   
    
}
