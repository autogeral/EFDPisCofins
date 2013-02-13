package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 21/11/2011 16:39:20
 * @author rafael.galvao
 */
public class RegistroM220 extends LineArchetype{

    public static String REG = "REG";
    public static String IND_AJ = "IND_AJ";
    public static String VL_AJ = "VL_AJ";
    public static String COD_AJ = "COD_AJ";
    public static String NUM_DOC = "NUM_DOC";
    public static String DESCR_AJ = "DESCR_AJ";
    public static String DT_REF = "DT_REF";
    
    public RegistroM220(){
        setName("Ajustes da contribuição para o Pis/Pasep apurada");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M220"));
        //02
        addFieldArchetype(IND_AJ, new FieldStringFixedLengthArchetype(1));
        //03
        addFieldArchetype(VL_AJ, fdm);
        //04
        addFieldArchetype(COD_AJ, new FieldStringFixedLengthArchetype(2));
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(255);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC, f05);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(255);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(DESCR_AJ, f06);
        //07
        FieldDateFixedLengthArchetype f07 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(DT_REF, f07);
    }
    
    
}
