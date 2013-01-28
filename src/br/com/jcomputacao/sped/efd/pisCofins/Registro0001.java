/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2011 20:45:07
 * @author WILL
 */
public class Registro0001 extends LineArchetype
{ 
     //01 - Texto fixo contendo “0001”
     public static final String REG = "REG";
     //02
     /**Indicador de movimento:
      * 0 - Bloco com dados informados
      * 1 - Bloco sem dados informados
      */
     public static final String IND_MOV = "IND_MOV";


    public Registro0001(){
        setName("Abertura do bloco 0");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0001"));
        //02
        addFieldArchetype(IND_MOV, new FieldIntegerFixedLengthArchetype(1));

    }
    
}
