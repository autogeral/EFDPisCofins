package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 09:25:21
 * @author WILL
 */
public class Registro0111 extends LineArchetype {
     //01 - Fixo
     public static final String REG = "REG";
     //02
     public static final String REC_BRU_NCUM_TRIB_MI= "REC_BRU_NCUM_TRIB_MI";
     //03
     public static final String REC_BRU_NCUM_NT_MI = "REC_BRU_ NCUM_NT_MI";
     //04
     public static final String REC_BRU_NCUM_EXP = "REC_BRU_ NCUM_EXP";
     //05
     public static final String REC_BRU_CUM = "REC_BRU_CUM";
     //06
     public static final String REC_BRU_TOTAL = "REC_BRU_TOTAL";


    public Registro0111(){
        setName("");
        setDelimiter("|");
        
        FieldDecimalMaximumLengthArchetype fdf15 = new FieldDecimalMaximumLengthArchetype(15,2);
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        fdf15.setFormat(fw);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0111"));
        //02
        /**Receita Bruta Não-Cumulativa - Tributada no Mercado Interno
         */
        addFieldArchetype(REC_BRU_NCUM_TRIB_MI, fdf15);
        //03
        /**Receita Bruta Não-Cumulativa – 
         * Não Tributada no Mercado Interno 
         * (Vendas com suspensão, alíquota zero, isenção e sem incidência das contribuições)
         */
        addFieldArchetype(REC_BRU_NCUM_NT_MI, fdf15);
        //04
        /**Receita Bruta Não-Cumulativa – Exportação
         */
        addFieldArchetype(REC_BRU_NCUM_EXP, fdf15);
        //05
        /**Receita Bruta Cumulativa
         */
        addFieldArchetype(REC_BRU_CUM, fdf15);
        //06
        /**Receita Bruta Total
         */
        addFieldArchetype(REC_BRU_TOTAL, fdf15);

    }
    
}
