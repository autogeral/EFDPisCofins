package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 22:05:03
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC505 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02 - Código da Situação Tributária referente a COFINS
    public final static String CST_COFINS = "CST_COFINS";
    //03 - Valor total dos itens
    public final static String VL_ITEM = "VL_ITEM";
    //04 - Código da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7
    public final static String NAT_BC_CRED = "NAT_BC_CRED";
    //05 - Valor da base de cálculo da COFINS
    public final static String VL_BC_COFINS = "VL_BC_COFINS";
    //06 - Alíquota da COFINS (em percentual)
    public final static String ALIQ_COFINS = "ALIQ_COFINS";
    //07 - Valor da COFINS
    public final static String VL_COFINS = "VL_COFINS";
    //08 - Código da conta analítica contábil debitada/creditada
    public final static String COD_CTA = "COD_CTA";

    public RegistroC505() {
        setName("Complemento da operação (códigos 06, 28 e 29) - Cofins");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C505"));
        //02
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_ITEM, f03);
        //04
        FieldStringFixedLengthArchetype f04 = new FieldStringFixedLengthArchetype(2);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(NAT_BC_CRED, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 =  new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        addFieldArchetype(VL_BC_COFINS, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(13,4);
        f06.setFormat(fw4);
        addFieldArchetype(ALIQ_COFINS, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(15,2);
        f07.setFormat(fw);
        addFieldArchetype(VL_COFINS, f07);
        //08
        FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(60);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f08);

    }
}
