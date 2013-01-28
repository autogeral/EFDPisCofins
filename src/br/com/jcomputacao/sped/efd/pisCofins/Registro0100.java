package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2011 20:48:31
 * @author rafael.galvao
 */
public class Registro0100 extends LineArchetype {
    
    //01 
    public static String REG = "REG";
    //02
    public static String NOME = "NOME";
    //03
    public static String CPF = "CPF";
    //04
    public static String CRC = "CRC";
    //05
    public static String CNPJ = "CNPJ";
    //06
    public static String CEP = "CEP";
    //07
    public static String END = "END";
    //08
    public static String NUM = "NUM";
    //09
    public static String COMPL = "COMPL";
    //10
    public static String BAIRRO = "BAIRRO";
    //11
    public static String FONE = "FONE";
    //12
    public static String FAX = "FAX";
    //13
    public static String EMAIL = "EMAIL";
    //14
    public static String COD_MUN = "COD_MUN";

    public Registro0100() {
        
        setName("Dados do contabilista");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0100"));
        //02
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        //03
        addFieldArchetype(CPF, new FieldIntegerFixedLengthArchetype(11));
        //04
        addFieldArchetype(CRC, new FieldStringMaximumLengthArchetype(15));
        //05
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //06
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(8));
        //07
        addFieldArchetype(END, new FieldStringMaximumLengthArchetype(60));
        //08
        addFieldArchetype(NUM, new FieldStringMaximumLengthArchetype(255));
        //09
        addFieldArchetype(COMPL, new FieldStringMaximumLengthArchetype(60));
        //10
        addFieldArchetype(BAIRRO, new FieldStringMaximumLengthArchetype(60));
        //11
        addFieldArchetype(FONE, new FieldStringFixedLengthArchetype(10));
        //12
        addFieldArchetype(FAX, new FieldStringFixedLengthArchetype(10));
        //13
        addFieldArchetype(EMAIL, new FieldStringMaximumLengthArchetype(255));
        //14
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
    }
}
