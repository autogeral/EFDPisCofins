/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2011 20:48:31
 * @author rafael.galvao
 */
public class Registro0100 extends LineArchetype {

    public static String REG = "REG";
    public static String NOME = "NOME";
    public static String CPF = "CPF";
    public static String CRC = "CRC";
    public static String CNPJ = "CNPJ";
    public static String CEP = "CEP";
    public static String END = "END";
    public static String NUM = "NUM";
    public static String COMPL = "COMPL";
    public static String BAIRRO = "BAIRRO";
    public static String FONE = "FONE";
    public static String FAX = "FAX";
    public static String EMAIL = "EMAIL";
    public static String COD_MUN = "COD_MUN";

    public Registro0100() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(CPF, new FieldIntegerFixedLengthArchetype(11));
        addFieldArchetype(CRC, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(END, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(NUM, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(COMPL, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(FONE, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(FAX, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(EMAIL, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
    }
}
