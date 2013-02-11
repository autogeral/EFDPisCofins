
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 23/11/2011 11:41:21
 * @author Douglas
 */
public class RegistroF210 extends LineArchetype {

    public static String REG = "REG";
    public static String VL_CUS_ORC = "VL_CUS_ORC";
    public static String VL_EXC = "VL_EXC";
    public static String VL_CUS_ORC_AJU = "VL_CUS_ORC_AJU";
    public static String VL_BC_CRED = "VL_BC_CRED";
    public static String CST_PIS = "CST_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_CRED_PIS_UTIL = "VL_CRED_PIS_UTIL";
    public static String CST_COFINS = "CST_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_CRED_COFINS_UTIL = "VL_CRED_COFINS_UTIL";

    public RegistroF210() {
        setName("Operações da atividade imobiliária - custo orçado da unidade imobiliária vendida");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        FieldDecimalMaximumLengthArchetype fdm4 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm4.setFormat(fw4);
        fdm4.setNullableRepresentation("");
        fdm4.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F210"));
        //02
        addFieldArchetype(VL_CUS_ORC, fdm);
        //03
        addFieldArchetype(VL_EXC, fdm);
        //04
        addFieldArchetype(VL_CUS_ORC_AJU , fdm);
        //05
        addFieldArchetype(VL_BC_CRED, fdm);
        //06
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //07
        addFieldArchetype(ALIQ_PIS, fdm4);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_CRED_PIS_UTIL, f08);
        //09
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //10
        addFieldArchetype(ALIQ_COFINS, fdm4);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_CRED_COFINS_UTIL, f11);

    }
}
