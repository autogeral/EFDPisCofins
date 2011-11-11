/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD600  extends LineArchetype {

    public static String REG = "REG";
    public static String COD_MOD = "COD_MOD";
    public static String COD_MUN = "COD_MUN";
    public static String SER = "SER";
    public static String SUB = "SUB";
    public static String IND_REC = "IND_REC";
    public static String QTD_CONS = "QTD_CONS";
    public static String DT_DOC_INI = "DT_DOC_INI";
    public static String DT_DOC_FIN = "DT_DOC_FIN";
    public static String VL_DOC = "VL_DOC";
    public static String VL_DESC = "VL_DESC";
    public static String VL_SERV = "VL_SERV";
    public static String VL_SERV_NT = "VL_SERV_NT";
    public static String VL_TERC = "VL_TERC";
    public static String VL_DA = "VL_DA";
    public static String VL_BC_ICMS = "VL_BC_ICMS";
    public static String VL_ICMS = "VL_ICMS";
    public static String VL_PIS = "VL_PIS";
    public static String VL_COFINS = "VL_COFINS";
    

    public RegistroD600() {
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_MUN, new FieldIntegerMaximumLengthArchetype(7));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(IND_REC, new FieldIntegerMaximumLengthArchetype(1));
        addFieldArchetype(QTD_CONS, new FieldIntegerMaximumLengthArchetype(20));
        addFieldArchetype(DT_DOC_INI, new FieldDateTimeFixedLengthArchetype("dd/mm/yyyy"));
        addFieldArchetype(DT_DOC_FIN, new FieldDateTimeFixedLengthArchetype("dd/mm/yyyy"));
        addFieldArchetype(VL_DOC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_SERV, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_SERV_NT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_TERC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_DA, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20,2));
        
    }
    
}
