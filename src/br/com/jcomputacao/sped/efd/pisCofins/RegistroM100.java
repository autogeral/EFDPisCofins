package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroM100 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6.
    public static String COD_CRED = "COD_CRED";
    //03
    /**Indicador de Crédito Oriundo de:
     * 0 – Operações próprias
     * 1 – Evento de incorporação, cisão ou fusão
     */
    public static String IND_CRED_ORI= "IND_CRED_ORI";
    //04 - Valor da Base de Cálculo do Crédito
    public static String VL_BC_PIS = "VL_BC_PIS";
    //05 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //06 - Quantidade – Base de cálculo PIS
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //07 - Alíquota do PIS (em reais)
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //08 - Valor total do crédito apurado no período
    public static String VL_CRED = "VL_CRED";
    //09 - Valor total dos ajustes de acréscimo
    public static String VL_AJUS_ACRES = "VL_AJUS_ACRES";
    //10 - Valor total dos ajustes de redução
    public static String VL_AJUS_REDUC = "VL_AJUS_REDUC";
    //11 - Valor total do crédito diferido no período
    public static String VL_CRED_DIF = "VL_CRED_DIF";
    //12 - Valor Total do Crédito Disponível relativo ao Período (08 + 09 – 10 – 11)
    public static String VL_CRED_DISP = "VL_CRED_DISP";
    //13
    /**Indicador de opção de utilização do crédito disponível no período:
     * 0 – Utilização do valor total para desconto da
     * contribuição apurada no período, no Registro M200
     * 1 – Utilização de valor parcial para desconto da
     * contribuição apurada no período, no Registro M200
     */
    public static String IND_DESC_CRED = "IND_DESC_CRED";
    //14
    /**Valor do Crédito disponível, descontado da contribuição
     * apurada no próprio período
     * Se IND_DESC_CRED=0, informar o valor total do Campo 12
     * Se IND_DESC_CRED=1, informar o valor parcial do Campo 12
     */
     public static String VL_CRED_DESC = "VL_CRED_DESC";     
     //15 - Saldo de créditos a utilizar em períodos futuros (12 – 14)
     public static String SLD_CRED = "SLD_CRED";
     
            
    public RegistroM100() {
        setName("Crédito de Pis/Pasep relativo ao período");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M100"));
        //02
        addFieldArchetype(COD_CRED, new FieldStringMaximumLengthArchetype(3));
        //03
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(1));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_PIS, f04);
        //05
        
    }
    
}
