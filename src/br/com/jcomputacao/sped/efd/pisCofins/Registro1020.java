/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:51:56
 * @author WILL
 */
public class Registro1020 extends LineArchetype {
            
        public static String REG = "REG";
        public static String NUM_PROC = "NUM_PROC";
        public static String IND_NAT_ACAO = "IND_NAT_ACAO";
        public static String DT_DEC_ADM = "DT_DEC_ADM";

    
    public Registro1020(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(NUM_PROC, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(IND_NAT_ACAO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(DT_DEC_ADM, new FieldIntegerFixedLengthArchetype(8));

    }
    
    
}
