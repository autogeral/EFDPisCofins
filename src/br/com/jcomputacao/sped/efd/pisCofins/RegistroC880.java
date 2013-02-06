package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Feb 6, 2013 4:54:54 PM
 * @author Jennifer
 */
public class RegistroC880 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - 
    //03 - 
    //04 - 
    //05 - 
    //06 - 
    //07 - 
    //08 - 
    //09 - 
    //10 - 
    //11 - 
    //12 -
    //13 -
    
    
    public RegistroC880 (){
        setName("Resumo diário de documentos emitidos por equipamento sta-cf-e (código 59) - Pis/Pasep e cofins apurado por unidade de medida de produto");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C880"));
        //02 - 
        //03 - 
        //04 - 
        //05 - 
        //06 - 
        //07 - 
        //08 - 
        //09 - 
        //10 - 
        //11 - 
        //12 -
        //13 -
        
    }
}
