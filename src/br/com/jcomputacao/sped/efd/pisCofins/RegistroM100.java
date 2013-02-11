package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroM100 extends LineArchetype {

    public static String REG = "REG";
    public static String COD_CRED = "COD_CRED";
    public static String IND_CRED_ORI= "IND_CRED_ORI";
    public static String VL_BC_PIS = "VL_BC_PIS";
    public static String ALIQ_PIS = "ALIQ_PIS";
    

    public RegistroM100() {
        addFieldArchetype(REG, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(COD_CRED, new FieldStringMaximumLengthArchetype(3));
    }
    
}
