package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class Registro0120 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - Mês de referência do ano-calendário da escrituração,
    //dispensada da entrega. Campo a ser preenchido no formato “mmaaaa”
    public static String MES_DISPENSA = "MES_DISPENSA";
    //03 - Informação complementar do registro.
    public static String INF_COMP = "INF_COMP";
    
    public Registro0120 (){
        setName("Identificação de Períodos Dispensados da Escrituração Digital");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype ("0120"));
        //02
        addFieldArchetype(MES_DISPENSA, new FieldDateFixedLengthArchetype ("MMyyyy"));
        //
        //03
        FieldStringMaximumLengthArchetype f03 = new FieldStringMaximumLengthArchetype(90);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(INF_COMP, f03);
    }
}
