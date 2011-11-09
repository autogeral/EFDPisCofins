/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2011 21:31:27
 * @author rafael.galvao
 */
public class Registro0110 extends LineArchetype {

    public static String REG = "REG";
    public static String COD_INC_TRIB = "COD_INC_TRIB";
    public static String IND_APRO_CRED = "IND_APRO_CRED";
    public static String COD_TIPO_CONT = "COD_TIPO_CONT";
    public static String IND_REG_CUM = "IND_REG_CUM";

    public Registro0110() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_INC_TRIB, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(IND_APRO_CRED, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(COD_TIPO_CONT, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(IND_REG_CUM, new FieldIntegerFixedLengthArchetype(1));
        
    }
}
