package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:51:56
 * @author WILL
 */
public class Registro1020 extends LineArchetype {
        
        //01 - Fixo
        public static String REG = "REG";
        //02 - Identificação do Processo Administrativo ou da Decisão Administrativa
        public static String NUM_PROC = "NUM_PROC";
        //03
        /**Indicador da Natureza da Ação, decorrente de Processo
         * Administrativo na Secretaria da Receita Federal do Brasil:
         * 01 – Processo Administrativo de Consulta
         * 02 – Despacho Decisório
         * 03 – Ato Declaratório Executivo
         * 04 – Ato Declaratório Interpretativo
         * 05 – Decisão Administrativa de DRJ ou do CARF
         * 06 – Auto de Infração
         * 99 – Outros
         */
        public static String IND_NAT_ACAO = "IND_NAT_ACAO";
        //04 - Data do Despacho/Decisão Administrativa
        public static String DT_DEC_ADM = "DT_DEC_ADM";

    
    public Registro1020(){
        setName("Processo Referenciado – Processo Administrativo");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1020"));
        //02
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        //03
        addFieldArchetype(IND_NAT_ACAO, new FieldStringFixedLengthArchetype(2));
        //04
        addFieldArchetype(DT_DEC_ADM, new FieldDateFixedLengthArchetype("ddMMyyyyy"));
    }
}
