package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:06:55
 * @author WILL
 */
public class Registro9900 extends LineArchetype {
    //01
    public static final String REG = "REG";
    //02
    public static final String REG_BLC = "REG_BLC";
    //03
    public static final String QTD_REG_BLC = "QTD_REG_BLC";


    public Registro9900(){
        setName("Registros do Arquivo");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("9900"));
        //02
        addFieldArchetype(REG_BLC, new FieldStringMaximumLengthArchetype(4));
        //03
        addFieldArchetype(QTD_REG_BLC, new FieldIntegerMaximumLengthArchetype(19));
    }
}
