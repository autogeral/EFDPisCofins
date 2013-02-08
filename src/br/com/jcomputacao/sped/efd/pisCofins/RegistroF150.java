
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/11/2011 09:07:16
 * @author Douglas
 */
public class RegistroF150 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - Texto fixo contendo "18"
    //Código da Base de Cálculo do Crédito sobre Estoque
    //de Abertura, conforme a Tabela indicada no item 4.3.7.
    public static String NAT_BC_CRED = "NAT_BC_CRED";
    //03 - Valor Total do Estoque de Abertura
    public static String VL_TOT_EST = "VL_TOT_EST";
    //04 - Parcela do estoque de abertura referente a bens,
    //produtos e mercadorias importados, ou adquiridas no
    //mercado interno sem direito ao crédito
    public static String EST_IMP = "EST_IMP";
    //05 - Valor da Base de Cálculo do Crédito sobre o Estoque de Abertura (03 – 04)
    public static String VL_BC_EST = "VL_BC_EST";
    //06 - Valor da Base de Cálculo Mensal do Crédito sobre o
    //Estoque de Abertura (1/12 avos do campo 05)
    public static String VL_BC_MEN_EST = "VL_BC_MEN_EST";
    //07 - Código da Situação Tributária referente ao PIS/PASEP,
    //conforme a Tabela indicada no item 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //08 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //09 - Valor Mensal do Crédito Presumido Apurado para o 
    //Período - PIS/PASEP (06 x 08)
    public static String VL_CRED_PIS = "VL_CRED_PIS";
    //10 - Código da Situação Tributária referente ao COFINS,
    //conforme a Tabela indicada no item 4.3.4
    public static String CST_COFINS = "CST_COFINS";
    //11 - Alíquota do COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //12 - Valor Mensal do Crédito Presumido Apurado para o
    //Período - COFINS (06 x 11)
    public static String VL_CRED_COFINS = "VL_CRED_ COFINS";
    //13 - Descrição do estoque
    public static String DESC_EST = "DESC_EST";
    //14 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    
    public RegistroF150() {
        setName("Crédito presumido sobre estoque de abertura");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F150"));
        //02
        addFieldArchetype(NAT_BC_CRED, new FieldDefaultArchetype("18"));         
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_TOT_EST, f03);
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(EST_IMP, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        addFieldArchetype(VL_BC_EST, f05);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(VL_BC_MEN_EST, f06);
        //07
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(13,4);
        f08.setFormat(fw4);
        addFieldArchetype(ALIQ_PIS, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_CRED_PIS, f09);
        //10
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(13,4);
        f11.setFormat(fw4);
        addFieldArchetype(ALIQ_COFINS, f11);
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_CRED_COFINS, f12);
        //13
        FieldStringMaximumLengthArchetype f13 = new FieldStringMaximumLengthArchetype(100);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(DESC_EST, f13);
        //14
        FieldStringMaximumLengthArchetype f14 = new FieldStringMaximumLengthArchetype(60);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f14);
           

    }
}
