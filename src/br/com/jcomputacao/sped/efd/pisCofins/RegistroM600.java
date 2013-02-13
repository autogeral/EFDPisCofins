package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 19:54:04
 * @author rafael.galvao
 */
public class RegistroM600 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Valor Total da Contribuição Não Cumulativa do Período
     * (recuperado do campo 13 do Registro M610, quando o
     * campo “COD_CONT” = 01, 02, 03, 04, 32 e 71)
     */
    public static String VL_TOT_CONT_NC_PER = "VL_TOT_CONT_NC_PER";
    //03
    /**Valor do Crédito Descontado, Apurado no Próprio
     * Período da Escrituração (recuperado do campo 14 do
     * Registro M500)
     */
    public static String VL_TOT_CRED_DESC = "VL_TOT_CRED_DESC";
    //04
    /**Valor do Crédito Descontado, Apurado em Período de
     * Apuração Anterior (recuperado do campo 13 do Registro
     * 1500)
     */
    public static String VL_TOT_CRED_DESC_ANT = "VL_TOT_CRED_DESC_ANT";
    //05
    /**Valor Total da Contribuição Não Cumulativa Devida (02 - 03 - 04)
     */
    public static String VL_TOT_CONT_NC_DEV = "VL_TOT_CONT_NC_DEV";
    //06
    /**Valor Retido na Fonte Deduzido no Período
     */
    public static String VL_RET_NC = "VL_RET_NC";
    //07
    /**Outras Deduções no Período
     */
    public static String VL_OUT_DED_NC = "VL_OUT_DED_NC";
    //08
    /**Valor da Contribuição Não Cumulativa a Recolher/Pagar
     * (05 - 06 - 07)
     */
    public static String VL_CONT_NC_REC = "VL_CONT_NC_REC";
    //09
    /**Valor Total da Contribuição Cumulativa do Período
     * (recuperado do campo 13 do Registro M610, quando o
     * campo “COD_CONT” = 31, 32, 51, 52, 53, 54 e 72)
     */
    public static String VL_TOT_CONT_CUM_PER = "VL_TOT_CONT_CUM_PER";
    //10
    /**Valor Retido na Fonte Deduzido no Período
     */
    public static String VL_RET_CUM = "VL_RET_CUM";
    //11
    /**Outras Deduções no Período
     */
    public static String VL_OUT_DED_CUM = "VL_OUT_DED_CUM";
    //12
    /**Valor da Contribuição Cumulativa a Recolher/Pagar (09 - 10 - 11)
     */
    public static String VL_CONT_CUM_REC = "VL_CONT_CUM_REC";
    //13
    /**Valor Total da Contribuição a Recolher/Pagar no Período (08 + 12)
     */
    public static String VL_TOT_CONT_REC = "VL_TOT_CONT_REC";
    
    public RegistroM600(){
        setName("Consolidação da contribuição para a seguridade social - Cofins do período");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M600"));
        //02
        addFieldArchetype(VL_TOT_CONT_NC_PER, fdm);
        //03
        addFieldArchetype(VL_TOT_CRED_DESC, fdm);
        //04
        addFieldArchetype(VL_TOT_CRED_DESC_ANT, fdm);
        //05
        addFieldArchetype(VL_TOT_CONT_NC_DEV, fdm);
        //06
        addFieldArchetype(VL_RET_NC, fdm);
        //07
        addFieldArchetype(VL_OUT_DED_NC, fdm);
        //08
        addFieldArchetype(VL_CONT_NC_REC, fdm);
        //09
        addFieldArchetype(VL_TOT_CONT_CUM_PER, fdm);
        //10
        addFieldArchetype(VL_RET_CUM, fdm);
        //11
        addFieldArchetype(VL_OUT_DED_CUM, fdm);
        //12
        addFieldArchetype(VL_CONT_CUM_REC, fdm);
        //13
        addFieldArchetype(VL_TOT_CONT_REC, fdm);

    }
}
