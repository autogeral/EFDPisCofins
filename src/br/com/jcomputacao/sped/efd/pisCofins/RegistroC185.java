package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.text.NumberFormat;

/**
 * 11/11/2011 18:22:14
 * @author rafael.galvao
 */
public class RegistroC185 extends LineArchetype{

   //01 - Fixo
   public static String REG = "REG";
   //02 - Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
   public static String CST_COFINS = "CST_COFINS";
   //03 - Código fiscal de operação e prestação
   public static String CFOP = "CFOP";
   //04 - Valor do item
   public static String VL_ITEM = "VL_ITEM";
   //05 - Valor do desconto comercial / Exclusão
   public static String VL_DESC = "VL_DESC";
   //06 - Valor da base de cálculo da COFINS
   public static String VL_BC_COFINS = "VL_BC_COFINS";
   //07 - Alíquota da COFINS (em percentual)
   public static String ALIQ_COFINS = "ALIQ_COFINS";
   //08 - Quantidade – Base de cálculo da COFINS
   public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
   //09 - Alíquota da COFINS (em reais)
   public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
   //10 - Valor da COFINS
   public static String VL_COFINS = "VL_COFINS";
   //11 - Código da conta analítica contábil debitada/creditada
   public static String COD_CTA = "COD_CTA";
      
   public RegistroC185(){
       setName("Detalhamento da consolidação - operação de vendas - Cofins");
       setDelimiter("|");
       
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
//       ((NumberFormat)fw.getInternalFormat()).setMinimumFractionDigits(4);
//       ((NumberFormat)fw.getInternalFormat()).setMinimumFractionDigits(4);
       
       
       //01
       addFieldArchetype(REG, new FieldDefaultArchetype("C185"));
       //02
       addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
       //03
       addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
       //04
       FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
       f04.setFormat(fw);
       addFieldArchetype(VL_ITEM, f04);
       //05
       FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
       f05.setFormat(fw);
       f05.setNullableRepresentation("");
       f05.setFullFillingNullable(false);
       addFieldArchetype(VL_DESC, f05);
       //06
       FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
       f06.setFormat(fw);
       f06.setNullableRepresentation("");
       f06.setFullFillingNullable(false);
       addFieldArchetype(VL_BC_COFINS, f06);
       //07
       FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(12,4);
       f07.setFormat(fw);
       f07.setNullableRepresentation("");
       f07.setFullFillingNullable(false);
       addFieldArchetype(ALIQ_COFINS, f07);
       //08
       FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(16,3);
       f08.setFormat(fw);
       f08.setNullableRepresentation("");
       f08.setFullFillingNullable(false);
       addFieldArchetype(QUANT_BC_COFINS, f08);
       //09
       FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(17,4);
       f09.setFormat(fw);
       f09.setNullableRepresentation("");
       f09.setFullFillingNullable(false);
       addFieldArchetype(ALIQ_COFINS_QUANT, f09);
       //10
       FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
       f10.setFormat(fw);
       f10.setNullableRepresentation("");
       f10.setFullFillingNullable(false);
       addFieldArchetype(VL_COFINS, f10);
       //11
       addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));
   }
   
}
