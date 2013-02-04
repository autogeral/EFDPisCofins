package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 18:51:44
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC395 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public final static String COD_MOD = "COD_MOD";
    //03 - Código do participante emitente do documento (campo 02 do Registro 0150).
    public final static String COD_PART = "COD_PART";
    //04 - Série do documento fiscal
    public final static String SER = "SER";
    //05 - Subsérie do documento fiscal
    public final static String SUB_SER = "SUB_SER";
    //06 - Número do documento fiscal
    public final static String NUM_DOC = "NUM_DOC";
    //07 - Data da emissão do documento fiscal
    public final static String DT_DOC = "DT_DOC";
    //08 - Valor total do documento fiscal
    public final static String VL_DOC = "VL_DOC";

    public RegistroC395() {
        setName("Nostas fiscais de venda a consumidor (cófigos 02, 2D, 3E e 59) - aquisições/entradas com crédito");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C395"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        FieldStringMaximumLengthArchetype f03 = new FieldStringMaximumLengthArchetype(60);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(COD_PART, f03);
        //04
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(3));
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(3);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SUB_SER, f05);
        //06
        addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(6));
        //07
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        addFieldArchetype(VL_DOC, f08);   
    }
}
