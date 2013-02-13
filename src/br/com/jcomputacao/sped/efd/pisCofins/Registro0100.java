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
        FieldIntegerFixedLengthArchetype f05 = new FieldIntegerFixedLengthArchetype(14);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(CNPJ, f05);
        //06
        FieldIntegerFixedLengthArchetype f06 = new FieldIntegerFixedLengthArchetype(8);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(CEP, f06);
        //07
        FieldStringMaximumLengthArchetype f07 = new FieldStringMaximumLengthArchetype(60);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(END, f07);
        //08
        FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(255);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(NUM, f08);
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(60);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(COMPL, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(BAIRRO, f10);
        //11
        FieldStringFixedLengthArchetype f11 = new FieldStringFixedLengthArchetype(10);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(FONE, f11);
        //12
        FieldStringFixedLengthArchetype f12 = new FieldStringFixedLengthArchetype(10);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(FAX, f12);
        //13
        FieldStringMaximumLengthArchetype f13 = new FieldStringMaximumLengthArchetype(255);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(EMAIL, f13);
        //14
        FieldIntegerFixedLengthArchetype f14 = new FieldIntegerFixedLengthArchetype(7);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(COD_MUN, f14);
    }
}
