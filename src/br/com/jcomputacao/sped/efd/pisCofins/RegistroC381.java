package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 21:22:06
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC381 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02
    public final static String CST_PIS = "CST_PIS";
    //03
    public final static String COD_ITEM = "COD_ITEM";
    //04
    public final static String VL_ITEM = "VL_ITEM";
    //05
    public final static String VL_BC_PIS = "VL_BC_PIS";
    //06
    public final static String ALIQ_PIS = "ALIQ_PIS";
    //07
    public final static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //08
    public final static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //09
    public final static String VL_PIS = "VL_PIS";
    //10
    public final static String COD_CTA = "COD_CTA";

    public RegistroC381() {
        setName("Detalhamento da consolidação - Pis/Pasep");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C381"));
        //02
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        addFieldArchetype(VL_ITEM, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(12,4);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(16,3);
        f07.setFormat(fw);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(QUANT_BC_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS_QUANT, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_PIS, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f10);
    }
}
