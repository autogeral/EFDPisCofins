package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:26:27
 * @author Jonas
 */
public class RegistroF010 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Número de inscrição do estabelecimento no CNPJ
    public static String CNPJ = "CNPJ";

    public RegistroF010() {
        setName("Identificação do estabelecimento");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F010"));
        //02
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
    }
}
