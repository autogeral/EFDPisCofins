package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:28:12
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC400 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public final static String COD_MOD = "COD_MOD";
    //03 - Modelo do equipamento
    public final static String ECF_MOD = "ECF_MOD";
    //04 - Número de série de fabricação do ECF
    public final static String ECF_FAB = "ECF_FAB";
    //05 - Número do caixa atribuído ao ECF
    public final static String ECF_CX = "ECF_CX";

    public RegistroC400() {
        setName("Equipamentos ECF (códigos 02 e 2D)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C400"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(ECF_MOD, new FieldStringMaximumLengthArchetype(20));
        //04
        addFieldArchetype(ECF_FAB, new FieldStringMaximumLengthArchetype(20));
        //05
        addFieldArchetype(ECF_CX, new FieldIntegerMaximumLengthArchetype(3));
    }
}
