package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroM110 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador do tipo de ajuste:
     * 0- Ajuste de redução;
     * 1- Ajuste de acréscimo
     */
    public static String IND_AJ = "IND_AJ";
    //03 - Valor do ajuste
    public static String VL_AJ = "VL_AJ";
    //04 - Código do ajuste, conforme a Tabela indicada no item 4.3.8
    public static String COD_AJ = "COD_AJ";
    //05 - Número do processo, documento ou ato concessório ao qual o
    //ajuste está vinculado, se houver
    public static String NUM_DOC = "NUM_DOC";
    //06 - Descrição resumida do ajuste
    public static String DESCR_AJ = "DESCR_AJ";
    //07 - Data de referência do ajuste (ddmmaaaa)
    public static String DT_REF = "DT_REF";

    public RegistroM110() {
        setName("Ajuste do crédito de Pis/Pasep apurado");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M110"));
        //02
        addFieldArchetype(IND_AJ, new FieldStringFixedLengthArchetype(1));
        //03
        addFieldArchetype(VL_AJ, fdm);
        //04
        addFieldArchetype(COD_AJ, new FieldStringFixedLengthArchetype(2));
        //05
        FieldStringMaximumLengthArchetype f05 =  new FieldStringMaximumLengthArchetype(255);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC, f05);
        //06
        FieldStringMaximumLengthArchetype f06 =  new FieldStringMaximumLengthArchetype(255);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(DESCR_AJ, f06);
        //07
        addFieldArchetype(DT_REF, new FieldDateFixedLengthArchetype("ddMMyyyy"));

    }
}
