/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 18:50:57
 * @author rafael.galvao
 */
public class Registro0500 extends LineArchetype {

    public static String REG = "REG";
    public static String DT_ALT = "DT_ALT";
    public static String COD_NAT_CC = "COD_NAT_CC";
    public static String IND_CTA = "IND_CTA";
    public static String NIVEL = "NIVEL";
    public static String COD_CTA = "COD_CTA";
    public static String NOME_CTA = "NOME_CTA";
    public static String COD_CTA_REF = "COD_CTA_REF";
    public static String CNPJ_EST = "CNPJ_EST";

    public Registro0500() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(DT_ALT, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(COD_NAT_CC, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IND_CTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NIVEL, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(COD_CTA, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(NOME_CTA, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(COD_CTA_REF, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(CNPJ_EST, new FieldIntegerFixedLengthArchetype(14));
            
    }
}
