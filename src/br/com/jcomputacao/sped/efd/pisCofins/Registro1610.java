
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
 * 26/11/2011 10:35:03
 * @author Douglas
 */
public class Registro1610 extends LineArchetype {

        public static String REG = "REG";
        public static String CNPJ = "CNPJ";
        public static String CST_COFINS = "CST_COFINS";
        public static String COD_PART = "COD_PART";
        public static String DT_OPER = "DT_OPER";
        public static String VL_OPER = "VL_OPER";
        public static String VL_BC_COFINS = "VL_BC_COFINS";
        public static String ALIQ_COFINS = "ALIQ_COFINS";
        public static String VL_COFINS = "VL_COFINS";
        public static String COD_CTA = "COD_CTA";
        public static String DESC_COMPL = "DESC_COMPL";


    public Registro1610(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1610"));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DT_OPER, new FieldIntegerMaximumLengthArchetype(8));
        addFieldArchetype(VL_OPER, new FieldDecimalMaximumLengthArchetype(20,2));;
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_COMPL, new FieldStringMaximumLengthArchetype(255));


    }

}
