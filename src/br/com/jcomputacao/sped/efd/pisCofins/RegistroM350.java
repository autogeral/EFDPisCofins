package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 22:13:18
 * @author rafael.galvao
 */
public class RegistroM350 extends LineArchetype{

    
    public static String REG = "REG";
    public static String VL_TOT_FOL = "VL_TOT_FOL";
    public static String VL_EXC_BC = "VL_EXC_BC";
    public static String VL_TOT_BC = "VL_TOT_BC";
    public static String ALIQ_PIS_FOL = "ALIQ_PIS_FOL";
    public static String VL_TOT_CONT_FOL = "VL_TOT_CONT_FOL";
    
    public RegistroM350(){
        setName("");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M350"));
        //02
        addFieldArchetype(VL_TOT_FOL, fdm);
        //03
        addFieldArchetype(VL_EXC_BC, fdm);
        //04
        addFieldArchetype(VL_TOT_BC, fdm);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(9,2);
        f05.setFormat(fw);
        addFieldArchetype(ALIQ_PIS_FOL, f05);
        //06
        addFieldArchetype(VL_TOT_CONT_FOL, fdm);
    }
    
}
