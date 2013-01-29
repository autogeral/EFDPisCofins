package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:31:28
 * @author rafael.galvao
 */
public class Registro0600 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Data da inclusão/alteração.
    public static String DT_ALT = "DT_ALT";
    //03 - Código do centro de custos.
    public static String COD_CCUS = "COD_CCUS";
    //04 - Nome do centro de custos.
    public static String CCUS = "CCUS";
    
    public Registro0600(){
        setName("Centro de custos");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0600"));
        //02
        addFieldArchetype(DT_ALT, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //03
        addFieldArchetype(COD_CCUS, new FieldStringMaximumLengthArchetype(60));
        //04
        addFieldArchetype(CCUS, new FieldStringMaximumLengthArchetype(60));
    }
}
