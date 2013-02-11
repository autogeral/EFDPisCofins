/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:36:34
 * @author WILL
 */
public class Registro1001 extends LineArchetype {
    
    /*
     * 1 - Texto fixo contendo "1001" 
     */
       public static String REG = "REG";
       
    /*
      * 2 - Indicador de movimento: 0 - Bloco com dados informados; 1 - Bloco sem dados informados 

     */
    public static String IND_MOV = "IND_MOV";
    
    public Registro1001(){
        setName("Processo Referenciado - acao judicial");
        setDelimiter("|");
        addFieldArchetype(REG, new FieldDefaultArchetype("1001"));
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));
    }
    
}
