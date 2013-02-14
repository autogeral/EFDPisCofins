package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:53:19
 * @author João Batista Rodrigues Porfirio
 */

public class Registro0000 extends LineArchetype{
    //OBRIGATÓRIO

    //01 - Texto fixo contendo “0000”.
    public final static String REG = "REG";
    //02
    /**Código da versão do leiaute conforme a tabela 3.1.1
     * Código - Versão - Leiaute Instituído por - Período de Apuração Inicial 
     *  001    1.00       ADE Cofis nº 31/2010            01/04/2011
     *  002    1.01       ADE Cofis nº 34/2010,           01/04/2011
     *                    atualizado pelo ADE 
     *                     Cofis nº 37/2010
     *  002    2.00       ADE Cofis nº 20/2012            01/04/2011 
     *  003    2.01A      ADE Cofis nº 20/2012            01/07/2012
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
        setName("Abertura do arquivo digital e identificação da pessoa jurídica");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0000"));
        //02
        addFieldArchetype(COD_VER, new FieldIntegerFixedLengthArchetype(3));
        //03
        addFieldArchetype(TIPO_ESCRIT, new FieldIntegerFixedLengthArchetype(1));
        //04
        FieldIntegerFixedLengthArchetype f04 = new FieldIntegerFixedLengthArchetype(1);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(IND_SIT_ESP, f04);
        //05
        FieldStringFixedLengthArchetype f05 = new FieldStringFixedLengthArchetype(41);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(NUM_REC_ANTERIOR, f05);
        //06
        addFieldArchetype(DT_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //07
        addFieldArchetype(DT_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //08
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        //09
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //10
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        //11
        addFieldArchetype(COD_MUN, new FieldIntegerFixedLengthArchetype(7));
        //12
        FieldStringFixedLengthArchetype f12 = new FieldStringFixedLengthArchetype(9);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(SUFRAMA, f12);
        //13
        FieldIntegerFixedLengthArchetype f13 = new FieldIntegerFixedLengthArchetype(2);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(IND_NAT_PJ, f13);
        //14
        addFieldArchetype(IND_ATIV, new FieldIntegerFixedLengthArchetype(1));
    }
}