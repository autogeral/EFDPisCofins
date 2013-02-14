package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:30:54
 * @author Jonas
 */
public class RegistroA170 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02 - Número seqüencial do item no documento fiscal
    public static String NUM_ITEM = "NUM_ITEM";
    //03 - Código do item (campo 02 do Registro 0200)
    public static String COD_ITEM = "COD_ITEM";
    //04 - Descrição complementar do item como adotado no documento fiscal
    public static String DESCR_COMPL = "DESCR_COMPL";
    //05 - Valor total do item (mercadorias ou serviços)
    public static String VL_ITEM = "VL_ITEM";
    //06 - Valor do desconto do item / Exclusão
    public static String VL_DESC = "VL_DESC";
    //07 - Código da Base de Cálculo do Crédito, 
    //conforme a Tabela indicada no item 4.3.7, caso seja 
    //informado código representativo de crédito no 
    //Campo 09 (CST_PIS) ou no Campo 13 (CST_COFINS).
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //08
    /**Indicador da origem do crédito: 
     * 0 – Operação no Mercado Interno 
     * 1 – Operação de Importação
     */
    public static String IND_ORIG_CRED = "IND_ORIG_CRED";
    //09 - Código da Situação Tributária referente ao PIS/PASEP – Tabela 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //10 - Valor da base de cálculo do PIS/PASEP.
    public static String VL_BC_PIS = "VL_BC_PIS";
    //11 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //12 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //13 - Código da Situação Tributária referente ao COFINS – Tabela 4.3.4.
    public static String CST_COFINS = "CST_COFINS";
    //14 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //15 - Alíquota do COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //16 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //17 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    //18 - Código do centro de custos
    public static String COD_CCUS = "COD_CCUS";

    public RegistroA170() {
        setName("Complemento do documento - itens do documento");
        setDelimiter("|");
        FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(15,2);
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        fdf.setFormat(fw);
        FieldDecimalMaximumLengthArchetype fdf2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdf2.setNullableRepresentation("");
        fdf2.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("A170"));
        //02
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(4)); 
        //03
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(255);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(DESCR_COMPL, f04);
        //05
        addFieldArchetype(VL_ITEM, fdf);
        //06
        addFieldArchetype(VL_DESC,  fdf2);
        //07
        FieldStringFixedLengthArchetype f07 = new FieldStringFixedLengthArchetype(2);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(NAT_BC_CRED, f07);
        //08
        addFieldArchetype(IND_ORIG_CRED, new FieldStringFixedLengthArchetype(1));
        //09
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //10
        addFieldArchetype(VL_BC_PIS, fdf2);
        //11
        addFieldArchetype(ALIQ_PIS, fdf2);
        //12
        addFieldArchetype(VL_PIS, fdf2);
        //13
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //14
        addFieldArchetype(VL_BC_COFINS, fdf2);
        //15
        FieldDecimalMaximumLengthArchetype fdf6 = new FieldDecimalMaximumLengthArchetype(9,2);
        fdf6.setFormat(fw);
        fdf6.setNullableRepresentation("");
        fdf6.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS , fdf6);
        //16
        addFieldArchetype(VL_COFINS , fdf2);
        //17
        addFieldArchetype(COD_CTA , new FieldStringMaximumLengthArchetype(60));
        //18
        addFieldArchetype(COD_CCUS ,new FieldStringMaximumLengthArchetype(60));
    }
}
