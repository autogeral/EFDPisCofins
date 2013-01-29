package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:38:46
 * @author rafael.galvao
 */
public class Registro0206 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código do combustível, conforme tabela publicada pela ANP
    public static String COD_COMB = "COD_COMB";
    
    public Registro0206(){
        setName("Código de produto conforme tabela ANP (COmbustíveis)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0206"));
        //02
        addFieldArchetype(COD_COMB, new FieldStringMaximumLengthArchetype(255));
    }
}
