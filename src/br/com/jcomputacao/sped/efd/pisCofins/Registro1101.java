/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:31:41
 * @author WILL
 */
public class Registro1101 extends LineArchetype {
        
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
        public static String CST_PIS = "CST_PIS";
        public static String VL_BC_PIS = "VL_BC_PIS";
        public static String ALIQ_PIS = "ALIQ_PIS";
        public static String VL_PIS = "VL_PIS   ";
        public static String COD_CTA = "COD_CTA";
        public static String COD_CCUS = "COD_CCUS";
        public static String DESC_COMPL = "DESC_COMPL";
        public static String PER_ESCRIT = "PER_ESCRIT";
        public static String CNPJ = "CNPJ";

    
    public Registro1101(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));        
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB_SER, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_OPER, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CHV_NFE, new FieldStringMaximumLengthArchetype(44));
        addFieldArchetype(VL_OPER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        addFieldArchetype(NAT_BC_CRED, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(IND_ORIG_CRED, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CCUS, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_COMPL, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(PER_ESCRIT, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(CNPJ, new FieldIntegerMaximumLengthArchetype(14));
        

    }
    
}
