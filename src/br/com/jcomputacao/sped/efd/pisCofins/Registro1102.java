package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:27:32
 * @author William Antunes
 */
public class Registro1102 extends LineArchetype {
        //1 - Fixo
        public static String REG = "REG";
        //02 - Parcela do Crédito de PIS/PASEP, vinculada a Receita Tributada no Mercado Interno
        public static String VL_CRED_PIS_TRIB_MI = "VL_CRED_PIS_TRIB_MI";
        //03 - Parcela do Crédito de PIS/PASEP, vinculada a Receita Não Tributada no Mercado Interno
        public static String VL_CRED_PIS_NT_MI = "VL_CRED_PIS_NT_MI";
        //04 - Parcela do Crédito de PIS/PASEP, vinculada a Receita de Exportação
        public static String VL_CRED_PIS_EXP = "VL_CRED_PIS_EXP";

    
    public Registro1102(){
        setName("Detalhamento do Crédito Extemporâneo, Vinculado a mais de um Tipo de Receita – PIS/PASEP");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        fdm.setNullableRepresentation("");
        fdm.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1102"));
        //02
        addFieldArchetype(VL_CRED_PIS_TRIB_MI, fdm);
        //03
        addFieldArchetype(VL_CRED_PIS_NT_MI, fdm);
        //04
        addFieldArchetype(VL_CRED_PIS_EXP, fdm);

    }
    
    
}
