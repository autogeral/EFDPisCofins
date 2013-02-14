package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 11:01:56
 * @author rafael.galvao
 */
public class Registro0200 extends LineArchetype {
    //01 - Fixo
     public static final String REG = "REG";
     //02 - Código do item
     public static final String COD_ITEM= "COD_ITEM";
     //03 - Descrição do item
     public static final String  DESCR_ITEM = "DESCR_ITEM";
     //04 - Representação alfanumérico do código de barra do produto
     public static final String COD_BARRA = "COD_BARRA";
     //05 - Código anterior do item com relação à última informação apresentada.
     public static final String COD_ANT_ITEM = "COD_ANT_ITEM";
     //06 - Unidade de medida utilizada na quantificação de estoques.
     public static final String UNID_INV = "UNID_INV";
     //07
     /**Tipo do item – Atividades Industriais, Comerciais e Serviços: 
      * 00 – Mercadoria para Revenda
      * 01 – Matéria-Prima
      * 02 – Embalagem
      * 03 – Produto em Processo
      * 04 – Produto Acabado
      * 05 – Subproduto
      * 06 – Produto Intermediário
      * 07 – Material de Uso e Consumo
      * 08 – Ativo Imobilizado
      * 09 – Serviços
      * 10 – Outros insumos
      * 99 – Outras
      */
     public static final String TIPO_ITEM = "TIPO_ITEM";
     //08 - Código da Nomenclatura Comum do Mercosul
     public static final String COD_NCM = "COD_NCM";
     //09 - Código EX, conforme a TIPI
     public static final String  EX_IPI = "EX_IPI";
     //10 - Código do gênero do item, conforme a Tabela 4.2.1.
     public static final String COD_GEN = "COD_GEN";
     //11 - Código do serviço conforme lista do Anexo I da Lei Complementar Federal nº 116/03.
     public static final String COD_LST = "COD_LST";
     //12 - Alíquota de ICMS aplicável ao item nas operações internas
     public static final String ALIQ_ICMS = "ALIQ_ICMS";
     
     public Registro0200(){
         setName("Tabela de identificação do item (produtos e serviços)");
         setDelimiter("|");
         //01
         addFieldArchetype(REG, new FieldDefaultArchetype("0200"));
         //02
         addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
         //03
         addFieldArchetype(DESCR_ITEM, new FieldStringMaximumLengthArchetype(255));
         //04
         FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(255);
         f04.setNullableRepresentation("");
         f04.setFullFillingNullable(false);
         addFieldArchetype(COD_BARRA, f04);
         //05
         FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(60);
         f05.setNullableRepresentation("");
         f05.setFullFillingNullable(false);
         addFieldArchetype(COD_ANT_ITEM, f05);
         //06
         FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(6);
         f06.setNullableRepresentation("");
         f06.setFullFillingNullable(false);
         addFieldArchetype(UNID_INV, f06);
         //07
         addFieldArchetype(TIPO_ITEM, new FieldIntegerFixedLengthArchetype(2));
         //08
         FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(8);
         f08.setNullableRepresentation("");
         f08.setFullFillingNullable(false);
         addFieldArchetype(COD_NCM, f08);
         //09
         FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(3);
         f09.setNullableRepresentation("");
         f09.setFullFillingNullable(false);
         addFieldArchetype(EX_IPI, f09);
         //10
         FieldIntegerMaximumLengthArchetype f10 = new FieldIntegerMaximumLengthArchetype(2);
         f10.setNullableRepresentation("");
         f10.setFullFillingNullable(false);
         addFieldArchetype(COD_GEN, f10);
         //11
         FieldIntegerMaximumLengthArchetype f11 = new FieldIntegerMaximumLengthArchetype(4);
         f11.setNullableRepresentation("");
         f11.setFullFillingNullable(false);
         addFieldArchetype(COD_LST, f11);
         //12
         FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(9,2);
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
         fw.setReplaceComa(false);
         fdf.setFormat(fw);
         fdf.setNullableRepresentation("");
         fdf.setFullFillingNullable(false);
         addFieldArchetype(ALIQ_ICMS, fdf);
     }

}
