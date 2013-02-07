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
public class RegistroD105 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador da Natureza do Frete Contratado, referente a:
     * 0 – Operações de vendas, com ônus suportado pelo estabelecimento vendedor;
     * 1 – Operações de vendas, com ônus suportado pelo adquirente;
     * 2 – Operações de compras (bens para revenda, matériasprima e outros produtos, geradores de crédito);
     * 3 – Operações de compras (bens para revenda, matériasprima e outros produtos, não geradores de crédito);
     * 4 – Transferência de produtos acabados entre estabelecimentos da pessoa jurídica
     * 5 – Transferência de produtos em elaboração entre estabelecimentos da pessoa jurídica
     * 9 – Outras
     */
    public static String IND_NAT_FRT = "IND_NAT_FRT";
    //03 - Valor total dos itens
    public static String VL_ITEM = "VL_ITEM";
    //04 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS";
    //05 - Código da base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //06 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_PIS";
    //07 - Alíquota da COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_PIS";
    //08 - Valor da COFINS
    public static String VL_COFINS = "VL_PIS";
    //09 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD105() {
        setName("Complemento do documento de transporte (códigos 07, 08, 8B, 09, 10, 11, 26, 27 e 57) - Cofins");
        setDelimiter("|");
        
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
         FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D105"));
        //02        
        addFieldArchetype(IND_NAT_FRT, new FieldStringFixedLengthArchetype(1));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
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
        addFieldArchetype(VL_BC_COFINS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(13,4);
        f07.setFormat(fw4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(ALIQ_COFINS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(60);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f09);
    }
    
}
