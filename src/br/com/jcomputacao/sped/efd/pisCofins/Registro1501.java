
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
 * 26/11/2011 08:09:41
 * @author Douglas
 */
public class Registro1501 extends LineArchetype {

        public static String REG = "REG";
        public static String COD_PART = "COD_PART";
        public static String COD_ITEM = "COD_ITEM";
        public static String COD_MOD = "COD_MOD";
        public static String SER = "SER";
        public static String SUB_SER = "SUB_SER";
        public static String NUM_DOC = "NUM_DOC";
        public static String DT_OPER = "DT_OPER";
        public static String CHV_NFE = "CHV_NFE";
        public static String VL_OPER = "VL_OPER";
        public static String CFOP = "CFOP";
        public static String NAT_BC_CRED = "NAT_BC_CRED";
        public static String IND_ORIG_CRED = "IND_ORIG_CRED";
        public static String CST_COFINS = "CST_COFINS";
        public static String VL_BC_COFINS = "VL_BC_COFINS";
        public static String ALIQ_COFINS = "ALIQ_COFINS";
        public static String VL_COFINS = "VL_COFINS";
        public static String COD_CTA = "COD_CTA";
        public static String COD_CCUS = "COD_CCUS";
        public static String DESC_COMPL = "DESC_COMPL";
        public static String PER_ESCRIT = "PER_ESCRIT";
        public static String CNPJ = "CNPJ";


    public Registro1501(){
        addFieldArchetype(REG, new FieldDefaultArchetype("1501"));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD , new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB_SER, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_OPER, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(CHV_NFE, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(VL_OPER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CCUS, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_COMPL, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(PER_ESCRIT, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));


    }

}