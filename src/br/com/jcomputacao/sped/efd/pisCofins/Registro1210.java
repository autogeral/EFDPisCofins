/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:54:11
 * @author William Antunes
 */
public class Registro1210 extends LineArchetype {
        public static String REG = "REG";
        public static String CNPJ = "CNPJ";
        public static String CST_PIS = "CST_PIS";
        public static String COD_PART = "COD_PART";
        public static String DT_OPER = "DT_OPER";
        public static String VL_OPER = "VL_OPER";
        public static String VL_BC_PIS = "VL_BC_PIS";
        public static String ALIQ_PIS = "ALIQ_PIS";
        public static String VL_PIS = "VL_PIS";
        public static String COD_CTA = "COD_CTA";
        public static String DESC_COMPL = "DESC_COMPL";


    
    public Registro1210(){
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));        
        addFieldArchetype(CNPJ, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(COD_PART , new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DT_OPER, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_OPER, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20,3));
        addFieldArchetype(ALIQ_PIS , new FieldDecimalMaximumLengthArchetype(20,4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESC_COMPL, new FieldStringMaximumLengthArchetype(255));


    }
    
}
