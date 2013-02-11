
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 24/11/2011 11:54:17
 * @author Douglas
 */
public class RegistroF990 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Quantidade total de linhas do Bloco F
    public static String QTD_LIN_F = "QTD_LIN_F";


    public RegistroF990() {
        setName("Encerramento do bloco F");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F990"));
        //02
        addFieldArchetype(QTD_LIN_F, new FieldIntegerMaximumLengthArchetype(19));
      
    }
}