/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 * 09/11/2011 10:22:06
 * @author WILL
 */
public class Registro0150 extends LineArchetype {
         public static final String REG = "REG";
         public static final String COD_PART = "COD_PART";
         public static final String NOME = "NOME";
         public static final String COD_PAIS = "COD_PAIS";
         public static final String CNPJ = "CNPJ";
         public static final String CPF = "CPF";
         public static final String IE = "IE";
         public static final String COD_MUN = "COD_MUN";
         public static final String SUFRAMA = "SUFRAMA";
         public static final String END = "END";
         public static final String NUM1 = "NUM1";
         public static final String NUM2 = "NUM2";
         public static final String BAIRRO = "BAIRRO";


    public Registro0150(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_PART, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(COD_PAIS, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(CPF, new FieldIntegerFixedLengthArchetype(11));
        addFieldArchetype(IE, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(SUFRAMA, new FieldStringFixedLengthArchetype(9));
        addFieldArchetype(END, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(NUM1, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUM2, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(60));

    }
    
    
}
