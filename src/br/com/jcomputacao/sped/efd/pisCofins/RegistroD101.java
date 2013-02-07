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
public class RegistroD101 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador da Natureza do Frete Contratado, referente a:
     * 0 – Operações de vendas, com ônus suportado pelo estabelecimento vendedor;
     * 1 – Operações de vendas, com ônus suportado pelo adquirente;
     * 2 – Operações de compras (bens para revenda, matériasprima e outros produtos, geradores de crédito);
     * 3 – Operações de compras (bens para revenda, matériasprima e outros produtos, não geradores de crédito);
     * 4 – Transferência de produtos acabados entre estabelecimentos da pessoa jurídica;
     * 5 – Transferência de produtos em elaboração entre estabelecimentos da pessoa jurídica
     * 9 – Outras
     */
    public static String IND_NAT_FRT = "IND_NAT_FRT";
    //03 - Valor total dos itens
    public static String VL_ITEM = "VL_ITEM";
    //04 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //05 - Código da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7.
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //06 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //07 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //08 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //09 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD101() {
        setName("Complemento d documento de transporte (códigos 07, 08, 08B, 09, 10, 11, 26, 27 e 57) - Pis/Pasep");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
         FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D101"));
        //02
        addFieldArchetype(IND_NAT_FRT, new FieldStringFixedLengthArchetype(1));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //05
        FieldStringFixedLengthArchetype f05 = new FieldStringFixedLengthArchetype(2);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(NAT_BC_CRED, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(13,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(60);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f09);
    }
}