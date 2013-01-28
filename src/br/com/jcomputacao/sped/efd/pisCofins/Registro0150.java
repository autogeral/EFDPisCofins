/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //06
        addFieldArchetype(CPF, new FieldIntegerFixedLengthArchetype(11));
        //07
        addFieldArchetype(IE, new FieldStringFixedLengthArchetype(14));
        //08
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        //09
        addFieldArchetype(SUFRAMA, new FieldStringFixedLengthArchetype(9));
        //10
        addFieldArchetype(END, new FieldStringMaximumLengthArchetype(60));
        //11
        addFieldArchetype(NUM1, new FieldStringMaximumLengthArchetype(255));
        //12
        addFieldArchetype(COMPL, new FieldStringMaximumLengthArchetype(60));
        //13
        addFieldArchetype(BAIRRO, new FieldStringMaximumLengthArchetype(60));
    } 
}
