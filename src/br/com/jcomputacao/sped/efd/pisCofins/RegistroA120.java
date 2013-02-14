package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 21:43:36
 * @author Jonas
 */
public class RegistroA120 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - 
    public static String VL_TOT_SERV = "VL_TOT_SERV";
    //03 - 
    public static String VL_BC_PIS = "VL_BC_PIS";
    //04 - 
    public static String VL_PIS_IMP = "VL_PIS_IMP";
    //05 - 
    public static String DT_PAG_PIS = "DT_PAG_PIS";
    //06 - 
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //07 - 
    public static String VL_COFINS_IMP = "VL_COFINS_IMP";
    //08 - 
    public static String DT_PAG_COFINS = "DT_PAG_COFINS";
    //09
    /**Local da execução do serviço: 
     * 0 – Executado no País
     * 1 – Executado no Exterior, cujo resultado se verifique no País
     */
    public static String LOC_EXE_SERV = "LOC_EXE_SERV";

    public RegistroA120() {
        setName("Informação complementar - Operações de importação");
        setDelimiter("|");
        
        FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(15,2);
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        fdf.setFormat(fw);
        FieldDecimalMaximumLengthArchetype fdf2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdf2.setFormat(fw);
        fdf2.setNullableRepresentation("");
        fdf2.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("A120"));
        //02
        addFieldArchetype(VL_TOT_SERV, fdf);
        //03
        addFieldArchetype(VL_BC_PIS, fdf);
        //04
        addFieldArchetype(VL_PIS_IMP, fdf2);
        //05
        FieldDateFixedLengthArchetype f05 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(DT_PAG_PIS, f05);
        //06
        addFieldArchetype(VL_BC_COFINS, fdf);
        //07
        addFieldArchetype(VL_COFINS_IMP, fdf2);
        //08
        FieldDateFixedLengthArchetype f08 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(DT_PAG_COFINS, f08);
        //09
        addFieldArchetype(LOC_EXE_SERV, new FieldStringFixedLengthArchetype(1));
    }
}
