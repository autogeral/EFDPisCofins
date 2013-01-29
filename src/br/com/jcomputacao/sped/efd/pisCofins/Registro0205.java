package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:27:48
 * @author WILL
 */
public class Registro0205 extends LineArchetype {
    //01 - Fixo
    public static final String REG = "REG";
    //02 - Descrição anterior do item
    public static final String DESCR_ANT_ITEM = "DESCR_ANT_ITEM";
    //03 - Data inicial de utilização da descrição do item
    public static final String DT_INI = "DT_INI";
    //04 - Data final de utilização da descrição do item
    public static final String DT_FIM = "DT_FIM";
    //05 - Código anterior do item com relação à última informação apresentada.
    public static final String COD_ANT_ITEM = "COD_ANT_ITEM";
    
        public Registro0205(){
            setName("");
            setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0205"));
        //02
        addFieldArchetype(DESCR_ANT_ITEM, new FieldStringMaximumLengthArchetype(255));
        //03
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(DT_FIM, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //05
        addFieldArchetype(COD_ANT_ITEM, new FieldStringMaximumLengthArchetype(60));
    }
}
