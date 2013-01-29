package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 18:30:25
 * @author rafael.galvao
 */
public class Registro0400 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da natureza da operação/prestação
    public static String COD_NAT = "COD_NAT";
    //03 - Descrição da natureza da operação/prestação
    public static String DESCR_NAT = "DESCR_NAT";
    
    public Registro0400(){
        setName("Tabela de natureza da operação/prestação");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0400"));
        //02
        addFieldArchetype(COD_NAT, new FieldStringMaximumLengthArchetype(10));
        //03
        addFieldArchetype(DESCR_NAT, new FieldStringMaximumLengthArchetype(255));
    }
}
