package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroM105 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da Base de Cálculo do Crédito apurado no período, conforme a Tabela 4.3.7.
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //03 - Código da Situação Tributária referente ao crédito de
    //PIS/Pasep (Tabela 4.3.3) vinculado ao tipo de crédito
    //escriturado em M100.
    public static String CST_PIS = "CST_PIS";
    //04
    /**Valor Total da Base de Cálculo escriturada nos
     * documentos e operações (Blocos “A”, “C”, “D” e “F”),
     * referente ao CST_PIS informado no Campo 03
     */
    public static String VL_BC_PIS_TOT = "VL_BC_PIS_TOT";
    //05
    /**Parcela do Valor Total da Base de Cálculo informada no
     * Campo 04, vinculada a receitas com incidência cumulativa
     * Campo de preenchimento específico para a pessoa
     * jurídica sujeita ao regime cumulativo e não-cumulativo da
     * contribuição (COD_INC_TRIB = 3 do Registro 0110)
     */
    public static String VL_BC_PIS_CUM = "VL_BC_CUM";
    //06
    /**Valor Total da Base de Cálculo do Crédito, vinculada a
     * receitas com incidência não-cumulativa (Campo 04 – Campo 05)
     */
    public static String VL_BC_PIS_NC = "VL_BC_PIS_NC";
    //07
    /**Valor da Base de Cálculo do Crédito, vinculada ao tipo de
     * Crédito escriturado em M100
     * - Para os CST_PIS = “50”, “51”, “52”, “60”, “61” e “62”:
     * Informar o valor do Campo 06 (VL_BC_PIS_NC);
     * - Para os CST_PIS = “53”, “54”, “55”, “56”, “63”, “64”
     * “65” e “66” (Crédito sobre operações vinculadas a mais
     * de um tipo de receita): Informar a parcela do valor do
     * Campo 06 (VL_BC_PIS_NC) vinculada especificamente
     * ao tipo de crédito escriturado em M100
     * O valor deste campo será transportado para o Campo 04
     * (VL_BC_PIS) do registro M100
     */
    public static String VL_BC_PIS = "VL_BC_PIS";
    //08
    /**Quantidade Total da Base de Cálculo do Crédito apurado
     * em Unidade de Medida de Produto, escriturada nos
     * documentos e operações (Blocos “A”, “C”, “D” e “F”),
     * referente ao CST_PIS informado no Campo 03
     */
    public static String QUANT_BC_PIS_TOT = "QUANT_BC_PIS_TOT";
    //09
    /**Parcela da base de cálculo do crédito em quantidade
     * (campo 08) vinculada ao tipo de crédito escriturado em M100
     * - Para os CST_PIS = “50”, “51” e “52”: Informar o valor
     * do Campo 08 (QUANT_BC_PIS);
     * - Para os CST_PIS = “53”, “54”, “55” e “56” (crédito
     * vinculado a mais de um tipo de receita): Informar a
     * parcela do valor do Campo 08 (QUANT_BC_PIS)
     * vinculada ao tipo de crédito escriturado em M100
     * O valor deste campo será transportado para o Campo 06
     * (QUANT_BC_PIS) do registro M100
     */
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //10 - Descrição do crédito
    public static String DESC_CRED = "DESC_CRED";

    public RegistroM105() {
        setName("Detalhamento da base de cáculo do crédito apurado no período - Pis/Pasep");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        fdm.setNullableRepresentation("");
        fdm.setFullFillingNullable(false);
        
        FieldDecimalMaximumLengthArchetype fdm3 = new FieldDecimalMaximumLengthArchetype(16,3);
        fdm3.setFormat(fw3);
        fdm3.setNullableRepresentation("");
        fdm3.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M105"));
        //02
        addFieldArchetype(NAT_BC_CRED, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(VL_BC_PIS_TOT, fdm);
        //05
        addFieldArchetype(VL_BC_PIS_CUM, fdm);
        //06
        addFieldArchetype(VL_BC_PIS_NC, fdm);
        //07
        addFieldArchetype(VL_BC_PIS, fdm);
        //08
        addFieldArchetype(QUANT_BC_PIS_TOT, fdm3);
        //09
        addFieldArchetype(QUANT_BC_PIS, fdm3);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(DESC_CRED, f10);
        
    }
}
