package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 20:14:18
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC380 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02
    /**Código do modelo do documento fiscal, conforme a Tabela
     * 4.1.1 (Código 02 – Nota Fiscal de Venda a Consumidor)
     */
    public final static String COD_MOD = "COD_MOD";
    //03 - Data de Emissão Inicial dos Documentos
    public final static String DT_DOC_INI = "DT_DOC_INI";
    //04 - Data de Emissão Final dos Documentos
    public final static String DT_DOC_FIN = "DT_DOC_FIN";
    //05 - Número do documento fiscal inicial
    public final static String NUM_DOC_INI = "NUM_DOC_INI";
    //06 - Número do documento fiscal final
    public final static String NUM_DOC_FIN = "NUM_DOC_FIN";
    //07 - Valor total dos documentos emitidos
    public final static String VL_DOC = "VL_DOC";
    //08 - Valor total dos documentos cancelados
    public final static String VL_DOC_CANC = "VL_DOC_CANC";
    
    public RegistroC380() {
        setName("Nota fiscal de venda a consumidor (código 02) - consolidação de documentos emitidos");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C380"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //05
        FieldIntegerMaximumLengthArchetype f06 = new FieldIntegerMaximumLengthArchetype(6);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC_INI, f06);
        FieldIntegerMaximumLengthArchetype f07 = new FieldIntegerMaximumLengthArchetype(6);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC_FIN, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        addFieldArchetype(VL_DOC, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_DOC_CANC, f09);
    }    
}
