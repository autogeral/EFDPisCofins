package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:02:30
 * @author WILL
 */
public class Registro0190 extends LineArchetype {
    //01 - Fixo
    public static final String REG = "REG";
    //02 - Código da unidade de medida
    public static final String UNID = "UNID";
    //03 - Descrição da unidade de medida
    public static final String DESCR= "DESCR";
    
    public Registro0190(){
        setName("Identificação das unidades de medida");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0190"));
        //02
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        //03
        addFieldArchetype(DESCR, new FieldStringMaximumLengthArchetype(255));
    }
    
}
