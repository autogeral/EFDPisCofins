
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 26/11/2011 09:57:24
 * @author Douglas
 */
public class Registro1502 extends LineArchetype {

        //01
        public static String REG = "REG";
        //02
        public static String VL_CRED_COFINS_TRIB_MI = "VL_CRED_COFINS_TRIB_MI";
        //03
        public static String VL_CRED_COFINS_NT_MI = "VL_CRED_COFINS_NT_MI";
        //04
        public static String VL_CRED_COFINS_EXP = "VL_CRED_COFINS_EXP";

     public Registro1502(){
         setName("Detalhamento do Crédito Extemporâneo, Vinculado a mais de um Tipo de Receita – COFINS");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        fdm.setNullableRepresentation("");
        fdm.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1502"));
        //02
        addFieldArchetype(VL_CRED_COFINS_TRIB_MI, fdm);
        //03
        addFieldArchetype(VL_CRED_COFINS_NT_MI, fdm);
        //04
        addFieldArchetype(VL_CRED_COFINS_EXP , fdm);

    }

}