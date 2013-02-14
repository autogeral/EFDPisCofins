package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 10:40:15
 * @author WILL
 */
public class Registro1010 extends LineArchetype {
        
        //01 - Fixo
        public static String REG = "REG";
        //02 - Identificação do Número do Processo Judicial
        public static String NUM_PROC = "NUM_PROC";
        //03 - Identificação da Seção Judiciária
        public static String ID_SEC_JUD = "ID_SEC_JUD";
        //04 - Identificação da Vara
        public static String ID_VARA = "ID_VARA";
        //05
        /**Indicador da Natureza da Ação Judicial, impetrada na Justiça Federal:
         * 01 – Decisão Judicial Transitada em Julgado, a favor da Pessoa Jurídica
         * 02 – Decisão Judicial Não Transitada em Julgado, a favor da Pessoa Jurídica
         * 03 – Decisão Judicial oriunda de Liminar em Mandado de Segurança
         * 04 – Decisão Judicial oriunda de Liminar em Medida Cautelar
         * 05 – Decisão Judicial oriunda de Antecipação de Tutela
         * 06 - Decisão Judicial Vinculada a Depósito Administrativo ou Judicial em Montante Integral
         * 07 – Medida Judicial em que a Pessoa Jurídica não é o autor
         * 08 – Súmula Vinculante aprovada pelo STF
         * 99 - Outros
         */
        public static String IND_NAT_ACAO = "IND_NAT_ACAO";
        //06
        /**Descrição Resumida dos Efeitos Tributários abrangidos pela
         * Decisão Judicial proferida
         */
        public static String DESC_DEC_JUD = "DESC_DEC_JUD";
        //07 - Data da Sentença/Decisão Judicial
        public static String DT_SENT_JUD= "DT_SENT_JUD";
    
    public Registro1010(){
        setName("Processo Referenciado – Ação Judicial");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1010"));
        //02
        addFieldArchetype(NUM_PROC, new FieldStringMaximumLengthArchetype(20));
        //03
        addFieldArchetype(ID_SEC_JUD, new FieldStringMaximumLengthArchetype(255));
        //04
        addFieldArchetype(ID_VARA, new FieldStringFixedLengthArchetype(2));
        //05
        addFieldArchetype(IND_NAT_ACAO, new FieldStringFixedLengthArchetype(2));
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(100);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(DESC_DEC_JUD, f06);
        //07
        FieldDateFixedLengthArchetype f07 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(DT_SENT_JUD, f07);
    }
    
    
}
