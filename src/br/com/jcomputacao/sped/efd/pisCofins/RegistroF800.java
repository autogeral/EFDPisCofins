
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 24/11/2011 11:29:24
 * @author Douglas
 */
public class RegistroF800 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador da Natureza do Evento de Sucessão:
     * 01 – Incorporação
     * 02 – Fusão
     * 03 – Cisão Total
     * 04 – Cisão Parcial
     * 99 – Outros
     */
    public static String IND_NAT_EVEN = "IND_NAT_EVEN";
    //03 - Data do Evento
    public static String DT_EVEN = "DT_EVEN";
    //04 - CNPJ da Pessoa Jurídica Sucedida
    public static String CNPJ_SUCED = "CNPJ_SUCED";
    //05 - Período de Apuração do Crédito – Mês/Ano (MM/AAAA)
    public static String PA_CONT_CRED = "PA_CONT_CRED";
    //06 - Código do crédito transferido, conforme Tabela 4.3.6
    public static String COD_CRED = "COD_CRED";
    //07 - Valor do Crédito Transferido de PIS/Pasep
    public static String VL_CRED_PIS = "VL_CRED_PIS";
    //08 - Valor do Crédito Transferido de Cofins
    public static String VL_CRED_COFINS = "VL_CRED_COFINS";
    //09 - Percentual do crédito original transferido, no caso de evento de Cisão.
    public static String PER_CRED_CIS = "PER_CRED_CIS";

    public RegistroF800() {
        setName("Créditos decorrentes de eventos de incorporação, fusão e cisão");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        FieldDecimalMaximumLengthArchetype fdm2 = new FieldDecimalMaximumLengthArchetype(9,2);
        fdm2.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F800"));
        //02
        addFieldArchetype(IND_NAT_EVEN, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(DT_EVEN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(CNPJ_SUCED, new FieldIntegerFixedLengthArchetype(14));
        //05
        addFieldArchetype(PA_CONT_CRED, new FieldDateFixedLengthArchetype("MMyyyy"));
        //06
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(3));
        //07
        addFieldArchetype(VL_CRED_PIS, fdm);
        //08
        addFieldArchetype(VL_CRED_COFINS, fdm);
        //09
        addFieldArchetype(PER_CRED_CIS, fdm2);

    }
}