package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 20:27:49
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC490 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Data de Emissão Inicial dos Documentos
    public final static String DT_DOC_INI = "DT_DOC_INI";
    //03 - Data de Emissão Final dos Documentos
    public final static String DT_DOC_FIN = "DT_DOC_FIN";
    //04 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public final static String COD_MOD = "COD_MOD";

    public RegistroC490() {
        setName("Consolidação de documentos emitidos por ECF (códigos 02, 2D e 59)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C490"));
        //02
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //03
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
    }
}
