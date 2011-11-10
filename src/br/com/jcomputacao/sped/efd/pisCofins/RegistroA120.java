/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 21:43:36
 * @author Jonas
 */
public class RegistroA120 extends LineArchetype {

    public static String REG = "REG";
    public static String VL_TOT_SERV = "VL_TOT_SERV";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String VL_PIS_IMP = "VL_PIS_IMP";
    public static String DT_PAG_PIS = "DT_PAG_PIS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";

    public RegistroA120() {

        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(VL_TOT_SERV, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_PIS_IMP, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(DT_PAG_PIS, new FieldDateTimeFixedLengthArchetype());
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));

    }
}
