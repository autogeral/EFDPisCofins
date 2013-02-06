package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Feb 6, 2013 3:49:38 PM
 * @author Jennifer
 */
public class RegistroC860 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public static String COD_MOD = "COD_MOD";
    //03
    public static String NR_SAT = "NR_SAT";
    //04
    public static String DT_DOC = "DT_DOC";
    //05
    public static String DOC_INI = "DOC_INI";
    //06
    public static String DOC_FIM = "DOC_FIM";
    
    public RegistroC860 (){
        setName("Identificação do equipamento sat-cf-e");
        setDelimiter("|");
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C860"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        //03
        addFieldArchetype(NR_SAT, new FieldIntegerMaximumLengthArchetype(9));
        //04
        FieldDateFixedLengthArchetype f04 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(DT_DOC, f04);
        //05
        FieldIntegerMaximumLengthArchetype f05 = new FieldIntegerMaximumLengthArchetype(9);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(DOC_INI, f05);
        //06
        FieldIntegerMaximumLengthArchetype f06 = new FieldIntegerMaximumLengthArchetype(9);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(DOC_FIM, f06);
    }
}
