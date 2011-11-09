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
 * 09/11/2011 09:41:17
 * @author WILL
 */
public class Registro0140 extends LineArchetype {
    public static final String REG = "REG";
    public static final String COD_EST = "COD_EST";
    public static final String NOME = "NOME";
    public static final String CNPJ = "CNPJ";
    public static final String UF = "UF";
    public static final String IE = "IE";
    public static final String COD_MUN = "COD_MUN";
    public static final String IM = "IM";
    public static final String SUFRAMA = "SUFRAMA";
     


    public Registro0140(){
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_EST, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IE, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(IM, new FieldStringFixedLengthArchetype(255));
        addFieldArchetype(SUFRAMA, new FieldStringFixedLengthArchetype(9));

    }
    
    
}
