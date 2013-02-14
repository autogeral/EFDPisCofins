package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 10:22:06
 * @author WILL
 */
public class Registro0150 extends LineArchetype {
         
         //01 - Fixo
         public static final String REG = "REG";
         //02 - Código de identificação do participante no arquivo.
         public static final String COD_PART = "COD_PART";
         //03 - Nome pessoal ou empresarial do participante.
         public static final String NOME = "NOME";
         //04 - Código do país do participante, conforme a tabela indicada no item 3.2.1.
         public static final String COD_PAIS = "COD_PAIS";
         //05 - CNPJ do participante
         public static final String CNPJ = "CNPJ";
         //06 - CPF do participante
         public static final String CPF = "CPF";
         //07 - Inscrição Estadual do participante.
         public static final String IE = "IE";
         //08 - Código do município, conforme a tabela IBGE
         public static final String COD_MUN = "COD_MUN";
         //09 - Número de inscrição do participante na Suframa
         public static final String SUFRAMA = "SUFRAMA";
         //10 - Logradouro e endereço do imóvel
         public static final String END = "END";
         //11 - Número do imóvel
         public static final String NUM1 = "NUM1";
         //12 - Dados complementares do endereço
         public static final String COMPL = "COMPL";
         //13 - Bairro em que o imóvel está situado
         public static final String BAIRRO = "BAIRRO";


    public Registro0150(){
        setName("Tabela de cadastro do participante");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0150"));
        //02
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //03
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        //04
        addFieldArchetype(COD_PAIS, new FieldIntegerFixedLengthArchetype(5));
        //05
        FieldIntegerFixedLengthArchetype f05 = new FieldIntegerFixedLengthArchetype(14);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(CNPJ, f05);
        //06
        FieldIntegerFixedLengthArchetype f06 = new FieldIntegerFixedLengthArchetype(11);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(CPF, f06);
        //07
        FieldStringFixedLengthArchetype f07 = new FieldStringFixedLengthArchetype(14);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(IE, f07);
        //08
        FieldIntegerFixedLengthArchetype f08 = new FieldIntegerFixedLengthArchetype(7);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(COD_MUN, f08);
        //09
        FieldStringFixedLengthArchetype f09 = new FieldStringFixedLengthArchetype(9);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(SUFRAMA, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(END, f10);
        //11
        FieldStringMaximumLengthArchetype f11 = new FieldStringMaximumLengthArchetype(255);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(NUM1, f11);
        //12
        FieldStringMaximumLengthArchetype f12 = new FieldStringMaximumLengthArchetype(60);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(COMPL, f12);
        //13
        FieldStringMaximumLengthArchetype f13 = new FieldStringMaximumLengthArchetype(60);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(BAIRRO, f13);
    } 
}
