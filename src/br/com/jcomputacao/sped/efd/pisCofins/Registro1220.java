package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 21:19:12
 * @author William Antunes
 */
public class Registro1220 extends LineArchetype {
    
        //01 - Fixo
        public static String REG = "REG";
        //02 - Período de Apuração do Crédito (MM/AAAA)
        public static String PER_APU_CRED = "PER_APU_CRED";
        //03
        /**Indicador da origem do crédito:
         * 01 – Crédito decorrente de operações próprias;
         * 02 – Crédito transferido por pessoa jurídica sucedida
         */
        public static String ORIG_CRED = "ORIG_CRED";
        //04 - Código do Tipo do Crédito, conforme Tabela 4.3.6.
        public static String COD_CRED = "COD_CRED";
        //05 - Valor do Crédito a Descontar
        public static String VL_CRED = "VL_CRED";
        
        
    public Registro1220(){
        setName("Demonstração do Crédito a Descontar da Contribuição Extemporânea – PIS/PASEP");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1220"));      
        //02
        addFieldArchetype(PER_APU_CRED, new FieldDateFixedLengthArchetype("MMyyyy"));
        //03
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(COD_CRED , new FieldIntegerFixedLengthArchetype(3));
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        addFieldArchetype(VL_CRED, f05);
        


    }
    
}
