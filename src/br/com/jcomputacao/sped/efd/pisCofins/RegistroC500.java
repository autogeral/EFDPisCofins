package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:39:58
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC500 extends LineArchetype{

    //01 - Fixo    
    public final static String REG = "REG";
    //02 - Código do participante do fornecedor (campo 02 do Registro 0150).
    public final static String COD_PART = "COD_PART";
    //03 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public final static String COD_MOD = "COD_MOD";
    //04 - Código da situação do documento fiscal, conforme a Tabela 4.1.2
    public final static String COD_SIT = "COD_SIT";
    //05 - Série do documento fiscal
    public final static String SER = "SER";
    //06 - Subsérie do documento fiscal
    public final static String SUB = "SUB";
    //07 - Número do documento fiscal
    public final static String NUM_DOC = "NUM_DOC";
    //08 - Data da emissão do documento fiscal
    public final static String DT_DOC = "DT_DOC";
    //09 - Data da entrada
    public final static String DT_ENT = "DT_ENT";
    //10 - Valor total do documento fiscal
    public final static String VL_DOC = "VL_DOC";
    //11 - Valor acumulado do ICMS
    public final static String VL_ICMS = "VL_ICMS";
    //12 - Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
    public final static String COD_INF = "COD_INF";
    //13 - Valor do PIS/PASEP
    public final static String VL_PIS = "VL_PIS";
    //14 - Valor da COFINS
    public final static String VL_COFINS = "VL_COFINS";

    public RegistroC500() {
        setName("Nota fiscal/conta energia elétrica (código 06), nora fiscal/ conta de fornecimento d'água canalizada (código 29) e nota fiscal consumo fornecimento de gás (código 28) e NF-e (código 55) - documentos de entrada/aquisição com crédito");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C500"));
        //02
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //03
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //04
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SER, f05);
        //06
        FieldIntegerMaximumLengthArchetype f06 = new FieldIntegerMaximumLengthArchetype(4);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(SUB, f06);
        //07
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        //08
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //09
        FieldDateFixedLengthArchetype f09 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(DT_ENT, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_DOC, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f11);
        //12
        FieldStringMaximumLengthArchetype f12 = new FieldStringMaximumLengthArchetype(6);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(COD_INF, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f14);
    }
}
