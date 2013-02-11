
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 24/11/2011 10:42:32
 * @author Douglas
 */
public class RegistroF700 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador de Origem de Deduções Diversas:
     * 01 – Créditos Presumidos - Medicamentos
     * 02 – Créditos Admitidos no Regime Cumulativo – Bebidas Frias
     * 03 – Contribuição Paga pelo Substituto Tributário - ZFM
     * 04 – Substituição Tributária – Não Ocorrência do Fato Gerador Presumido
     * 99 - Outras Deduções
     */
    public static String IND_ORI_DED = "IND_ORI_DED";
    //03
    /**Indicador da Natureza da Dedução:
     * 0 – Dedução de Natureza Não Cumulativa
     * 1 – Dedução de Natureza Cumulativa
     */
    public static String IND_NAT_DED = "IND_NAT_DED";
    //04 - Valor a Deduzir - PIS/PASEP
    public static String VL_DED_PIS = "VL_DED_PIS";
    //05 - Valor a Deduzir – Cofins
    public static String VL_DED_COFINS = "VL_DED_COFINS";
    //06
    /**Valor da Base de Cálculo da Operação que ensejou o
     * Valor a Deduzir informado nos Campos 04 e 05
     */
    public static String VL_BC_OPER = "VL_BC_OPER";
    //07
    /**CNPJ da Pessoa Jurídica relacionada à Operação que
     * ensejou o Valor a Deduzir informado nos Campos 04 e 05
     */
    public static String CNPJ = "CNPJ";
    //08
    /**Informações Complementares do Documento/Operação
     * que ensejou o Valor a Deduzir informado nos Campos 04 e 05
     */
    public static String INF_COMP = "INF_COMP";

    public RegistroF700() {
        setName("Deduções diversas");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F700"));
        //02
        addFieldArchetype(IND_ORI_DED, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(IND_NAT_DED, new FieldIntegerFixedLengthArchetype(1));
        //04
        addFieldArchetype(VL_DED_PIS, fdm);
        //05
        addFieldArchetype(VL_DED_COFINS, fdm);
        //06
        addFieldArchetype(VL_BC_OPER, fdm);
        //07
        FieldIntegerFixedLengthArchetype f07 = new FieldIntegerFixedLengthArchetype(14);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(CNPJ, f07);
        //08
        FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(90);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(INF_COMP, f08);

    }
}
