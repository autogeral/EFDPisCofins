package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:40:36
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC405 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Data do movimento a que se refere a Redução Z
    public final static String DT_DOC = "DT_DOC";
    //03 - Posição do Contador de Reinício de Operação
    public final static String CRO = "CRO";
    //04 - Posição do Contador de Redução Z
    public final static String CRZ = "CRZ";
    //05 - Número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z)
    public final static String NUM_COO_FIN = "NUM_COO_FIN";
    //06 - Valor do Grande Total final
    public final static String GT_FIN = "GT_FIN";
    //07 - Valor da venda bruta
    public final static String VL_BRT = "VL_BRT";

    public RegistroC405() {
        setName("Redução Z (códigos 02 e 2D)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C405"));
        //02
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //03
        addFieldArchetype(CRO, new FieldIntegerMaximumLengthArchetype(3));
        //04
        addFieldArchetype(CRZ, new FieldIntegerMaximumLengthArchetype(6));
        //05
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerMaximumLengthArchetype(6));
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(GT_FIN, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        addFieldArchetype(VL_BRT, f07);
    }
}
