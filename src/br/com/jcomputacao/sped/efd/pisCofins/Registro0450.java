package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 18:40:49
 * @author rafael.galvao
 */
public class Registro0450 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da informação complementar do documento fiscal.
    public static String COD_INF = "COD_INF";
    //03
    /**Texto livre da informação complementar existente no documento 
     * fiscal, inclusive espécie de normas legais, poder normativo, 
     * número, capitulação, data e demais referências pertinentes 
     * com indicação referentes ao tributo.
     */
    public static String TXT = "TXT";
    
    public Registro0450(){
        setName("Tabela de informação complementar do documento fiscal");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0450"));
        //02 
        addFieldArchetype(COD_INF, new FieldStringMaximumLengthArchetype(6));
        //03
        addFieldArchetype(TXT,  new FieldStringMaximumLengthArchetype(255));
        
    }
  
    
}
