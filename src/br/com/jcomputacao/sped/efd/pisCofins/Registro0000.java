package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:53:19
 * @author João Batista Rodrigues Porfirio
 */
public class Registro0000 extends LineArchetype implements EfdPisCofinsRegistro {

    public String getNome() {
        return "ABERTURA DO ARQUIVO DIGITAL E IDENTIFICACAO DA PESSOA JURIDICA";
    }
    //01 - Texto fixo contendo “0000”.
    public final static String REG = "REG";
    //02
    /**Código da versão do leiaute conforme a tabela 3.1.1.
     * 
     */
    public final static String COD_VER = "COD_VER";
    //03
    /**Tipo de escrituração:
     * 0 - Original
     * 1- Retificadora
     */
    public final static String TIPO_ESCRIT = "TIPO_ESCRIT";
    //04
    /**
     * Indicador de situação especial:
     * 0 - Abertura
     * 1 - Cisão
     * 2 - Fusão
     * 3 - Incorporação
     * 4 - Encerramento
     */
    public final static String IND_SIT_ESP = "IND_SIT_ESP";
    //05
    /**
     * Número do Recibo da Escrituração anterior 
     * a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1
     */
    public final static String NUM_REC_ANTERIOR = "NUM_REC_ANTERIOR";
    //06
    public final static String DT_INI = "DT_INI";
    //07
    public final static String DT_FIN = "DT_FIN";
    //08
    public final static String NOME = "NOME";
    //09
    public final static String CNPJ = "CNPJ";
    //10
    public final static String UF = "UF";
    //11 - Código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE
    public final static String COD_MUN = "COD_MUN";
    //12 - Inscrição da pessoa jurídica na Suframa
    public final static String SUFRAMA = "SUFRAMA";
    //13
    /**Indicador da natureza da pessoa jurídica:
     * 00 - SOciedade empresarial em geral
     * 01 - Sociedade cooperativa
     * 02 - Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
    */
    public final static String IND_NAT_PJ = "IND_NAT_PJ";
    //14
    /**Indicador de tipo de atividade preponderante:
     * 0 – Industrial ou equiparado a industrial
     * 1 – Prestador de serviços
     * 2 - Atividade de comércio
     * 3 – Atividade financeira
     * 4 – Atividade imobiliária
     * 9 – Outros
     */
    public final static String IND_ATIV = "IND_ATIV";

    public Registro0000() {
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0000"));
        //02
        addFieldArchetype(COD_VER, new FieldIntegerFixedLengthArchetype(3));
        //03
        addFieldArchetype(TIPO_ESCRIT, new FieldIntegerFixedLengthArchetype(1));
        //04
        addFieldArchetype(IND_SIT_ESP, new FieldIntegerFixedLengthArchetype(1));
        //05
        addFieldArchetype(NUM_REC_ANTERIOR, new FieldStringFixedLengthArchetype(41));
        //06
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //07
        addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //08
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        //09
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //09
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        //10
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        //11
        addFieldArchetype(SUFRAMA, new FieldStringFixedLengthArchetype(9));
        //12
        addFieldArchetype(IND_NAT_PJ, new FieldIntegerFixedLengthArchetype(2));
        //13
        addFieldArchetype(IND_ATIV, new FieldIntegerFixedLengthArchetype(1));
    }
}