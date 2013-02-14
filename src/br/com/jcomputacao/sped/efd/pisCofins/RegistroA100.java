package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 19:39:44
 * @author Jonas
 */
public class RegistroA100 extends LineArchetype {
    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador do tipo de operação: 
     * 0 - Serviço Contratado pelo Estabelecimento
     * 1 - Serviço Prestado pelo Estabelecimento
     */
    public static String IND_OPER = "IND_OPER";
    //03
    /**Indicador do emitente do documento fiscal: 
     * 0 - Emissão Própria
     * 1 - Emissão de Terceiros
     */
    public static String IND_EMIT = "IND_EMIT";
    //04
    /**Código do participante (campo 02 do Registro 0150): 
     * - do emitente do documento, no caso de emissão de terceiros 
     * - do adquirente, no caso de serviços prestados
     */
    public static String COD_PART = "COD_PART";
    //05
    /**Código da situação do documento fiscal: 
     * 00 – Documento regular 
     * 02 – Documento cancelado
     */
    public static String COD_SIT = "COD_SIT";
    //06 - Série do documento fiscal
    public static String SER = "SER";
    //07 - Subsérie do documento fiscal
    public static String SUB = "SUB";
    //08 - Número do documento fiscal ou documento internacional equivalente
    public static String NUM_DOC = "NUM_DOC";
    //09 - Chave/Código de Verificação da nota fiscal de serviço eletrônica
    public static String CHV_NFSE = "CHV_NFSE";
    //10 - Data da emissão do documento fiscal
    public static String DT_DOC = "DT_DOC";
    //11 - Data de Execução / Conclusão do Serviço
    public static String DT_EXE_SERV = "DT_EXE_SERV";
    //12 - Valor total do documento
    public static String VL_DOC = "VL_DOC";
    //13
    /**Indicador do tipo de pagamento: 
     * 0 - À vista
     * 1 - A prazo
     * 9 - Sem pagamento
     */
    public static String IND_PGTO = "IND_PGTO";
    //14 - Valor total do desconto
    public static String VL_DESC = "VL_DESC";
    //15 - Valor da base de cálculo do PIS/PASEP
    public static String VL_BC_PIS = "VL_BC_PIS";
    //16 - Valor total do PIS
    public static String VL_PIS = "VL_PIS";
    //17 - Valor da base de cálculo da COFINS
    public static String VL_BC_COFINS = "VL_BC_COFINS";
    //18 - Valor total da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //19 - Valor total do PIS retido na fonte
    public static String VL_PIS_RET = "VL_PIS_RET";
    //20 - Valor total da COFINS retido na fonte.
    public static String VL_COFINS_RET = "VL_COFINS_RET";
    //21 - Valor do ISS
    public static String VL_ISS = "VL_ISS";

    public RegistroA100() {
        setName("Nota fiscal de serviço");
        setDelimiter("|");
        
        FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(15,2);
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fdf.setFormat(fw);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdf2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdf2.setFormat(fw);
        fdf2.setNullableRepresentation("");
        fdf2.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("A100"));
        //02
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        //03
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(60);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_PART, f04);
        //05
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(20);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(SER, f06);
        //07
        FieldStringMaximumLengthArchetype f07 = new FieldStringMaximumLengthArchetype(20);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(SUB, f07);
        //08
        addFieldArchetype(NUM_DOC, new FieldStringMaximumLengthArchetype(60));
        //09
        FieldStringMaximumLengthArchetype f09 = new FieldStringMaximumLengthArchetype(60);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CHV_NFSE, f09);
        //10
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //11
        FieldDateFixedLengthArchetype f11 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(DT_EXE_SERV, f11);
        //12
        addFieldArchetype(VL_DOC, fdf);
        //13
        addFieldArchetype(IND_PGTO, new FieldStringFixedLengthArchetype(1));
        //14
        addFieldArchetype(VL_DESC, fdf2);
        //15
        addFieldArchetype(VL_BC_PIS, fdf);
        //16
        addFieldArchetype(VL_PIS, fdf);
        //17
        addFieldArchetype(VL_BC_COFINS, fdf);
        //18
        addFieldArchetype(VL_COFINS, fdf);
        //19
        addFieldArchetype(VL_PIS_RET, fdf2);
        //20
        addFieldArchetype(VL_COFINS_RET, fdf2);
        //21
        addFieldArchetype(VL_ISS, fdf2);
    }
}
