/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:53:19
 * @author João Batista Rodrigues Porfirio
 */
public class Registro0000 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÃ‡ÃƒO DA PESSOA JURÃ�DICA";
    }
    public final static String REG = "REG";
    public final static String COD_VER = "COD_VER";
    public final static String TIPO_ESCRIT = "TIPO_ESCRIT";
    public final static String IND_SIT_ESP = "IND_SIT_ESP";
    public final static String NUM_REC_ANTERIOR = "NUM_REC_ANTERIOR";
    public final static String DT_INI = "DT_INI";
    public final static String DT_FIN = "DT_FIN";
    public final static String NOME = "NOME";
    public final static String CNPJ = "CNPJ";
    public final static String UF = "UF";
    public final static String COD_MUN = "COD_MUN";
    public final static String SUFRAMA = "SUFRAMA";
    public final static String IND_NAT_PJ = "IND_NAT_PJ";
    public final static String IND_ATIV = "IND_ATIV";

    public Registro0000() {
        addFieldArchetype(REG, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(COD_VER, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(TIPO_ESCRIT, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(IND_SIT_ESP, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUM_REC_ANTERIOR, new FieldStringFixedLengthArchetype(41));
        addFieldArchetype(DT_INI, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(DT_FIN, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(SUFRAMA, new FieldStringFixedLengthArchetype(9));
        addFieldArchetype(IND_NAT_PJ, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IND_ATIV, new FieldIntegerFixedLengthArchetype(1));
    }
}