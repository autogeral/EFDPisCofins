package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 18:50:57
 * @author rafael.galvao
 */
public class Registro0500 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Data da inclusão/alteração
    public static String DT_ALT = "DT_ALT";
    //03
    /**Código da natureza da conta/grupo de contas:
     * 01 - Contas de ativo
     * 02 - Contas de passivo
     * 03 - Patrimônio líquido
     * 04 - Contas de resultado
     * 05 - Contas de compensação
     * 09 - Outras
     */
    public static String COD_NAT_CC = "COD_NAT_CC";
    //04
    /**Indicador do tipo de conta
     * S - Sintética (grupo de contas)
     * A - Analítica (conta)
     */
    public static String IND_CTA = "IND_CTA";
    //05 - Nível da conta analítica/grupo de contas.
    public static String NIVEL = "NIVEL";
    //06 - Código da conta analítica/grupo de contas.
    public static String COD_CTA = "COD_CTA";
    //07 - Nome da conta analítica/grupo de contas.
    public static String NOME_CTA = "NOME_CTA";
    //08 - Código da conta correlacionada no Plano de Contas Referenciado, publicado pela RFB.
    public static String COD_CTA_REF = "COD_CTA_REF";
    //09 - CNPJ do estabelecimento, no caso da conta informada no campo COD_CTA ser específica de um estabelecimento.
    public static String CNPJ_EST = "CNPJ_EST";

    public Registro0500() {
        setName("Plano de contas contábeis");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0500"));
        //02
        addFieldArchetype(DT_ALT, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //03
        addFieldArchetype(COD_NAT_CC, new FieldStringFixedLengthArchetype(2));
        //04
        addFieldArchetype(IND_CTA, new FieldStringFixedLengthArchetype(1));
        //05
        addFieldArchetype(NIVEL, new FieldIntegerFixedLengthArchetype(5));
        //06
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
        //07
        addFieldArchetype(NOME_CTA, new FieldStringMaximumLengthArchetype(60));
        //08
        FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(60);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA_REF, f08);
        //09
        FieldIntegerFixedLengthArchetype f09 = new FieldIntegerFixedLengthArchetype(14);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CNPJ_EST, f09);
            
    }
}
