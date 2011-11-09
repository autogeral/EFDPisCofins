/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:39:44
 * @author Jonas
 */
public class RegistroA100 extends LineArchetype {
    
     public static String REG = "REG";
     public static String IND_OPER = "IND_OPER";
     public static String IND_EMIT = "IND_EMIT";
     public static String COD_PART = "COD_PART";
     public static String COD_SIT = "COD_SIT";
     public static String SER = "SER";
     public static String SUB = "SUB";
     public static String NUM_DOC = "NUM_DOC";
     
     public RegistroA100(){
        
          addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
         addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
         addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
         addFieldArchetype(COD_PART, new FieldStringFixedLengthArchetype(60));
         addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
         addFieldArchetype(SER, new FieldStringFixedLengthArchetype(20));
         addFieldArchetype(SUB, new FieldStringFixedLengthArchetype(20));
         addFieldArchetype(NUM_DOC, new FieldStringFixedLengthArchetype(60));
     }
}
