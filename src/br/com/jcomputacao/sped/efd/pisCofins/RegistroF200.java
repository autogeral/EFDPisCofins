
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 18/11/2011 11:09:31
 * @author Douglas
 */

    public class RegistroF200 extends LineArchetype {

    public static String REG = "REG";
    public static String IND_OPER = "IND_OPER";
    public static String UNID_IMOB = "UNID_IMOB";
    public static String IDENT_EMP = "IDENT_EMP";
    public static String DESC_UNID_IMOB = "DESC_UNID_IMOB";
    public static String NUM_CONT = "NUM_CONT";
    public static String CPF_CNPJ_ADQU = "CPF_CNPJ_ADQU";
    public static String DT_OPER = "DT_OPER";
    public static String VL_TOT_VEND = "VL_TOT_VEND";
    public static String VL_REC_ACUM = "VL_REC_ACUM";
    public static String VL_TOT_REC = "VL_TOT_REC";
    public static String CST_PIS = "CST_PIS";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    public static String VL_PIS = "VL_PIS";
    public static String CST_COFINS = "CST_COFINS";
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    public static String VL_COFINS = "VL_COFINS";
    public static String PERC_REC_RECEB = "PERC_REC_RECEB";
    public static String IND_NAT_EMP = "IND_NAT_EMP";
    public static String INF_COMP = "INF_COMP";


    public RegistroF200() {

        addFieldArchetype(REG, new FieldDefaultArchetype("F200"));
        addFieldArchetype(IND_OPER, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(UNID_IMOB, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IDENT_EMP, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(DESC_UNID_IMOB, new FieldStringMaximumLengthArchetype(90));
        addFieldArchetype(NUM_CONT, new FieldStringMaximumLengthArchetype(90));
        addFieldArchetype(CPF_CNPJ_ADQU, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(DT_OPER, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VL_TOT_VEND, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_REC_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TOT_REC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,2));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(PERC_REC_RECEB, new FieldDecimalMaximumLengthArchetype(6,2));
        addFieldArchetype(IND_NAT_EMP, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(INF_COMP, new FieldStringMaximumLengthArchetype(90));


    }
}
