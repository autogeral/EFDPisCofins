/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:40:15
 * @author WILL
 */
public class Registro1010 extends LineArchetype {
        
        public static String REG = "REG";
        public static String NUM_PROC = "NUM_PROC";
        public static String ID_SEC_JUD = "ID_SEC_JUD";
        public static String ID_VARA = "ID_VARA";
        public static String IND_NAT_ACAO = "IND_NAT_ACAO";
        public static String DESC_DEC_JUD = "DESC_DEC_JUD";
        public static String DT_SENT_JUD= "DT_SENT_JUD";
    
    public Registro1010(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(NUM_PROC, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(ID_SEC_JUD, new FieldStringFixedLengthArchetype(255));
        addFieldArchetype(ID_VARA, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IND_NAT_ACAO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(DESC_DEC_JUD, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(DT_SENT_JUD, new FieldIntegerFixedLengthArchetype(8));
    }
    
    
}
