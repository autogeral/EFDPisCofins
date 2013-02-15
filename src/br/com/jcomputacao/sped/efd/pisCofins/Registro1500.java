
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/11/2011 10:44:35
 * @author Douglas
 */
public class Registro1500 extends LineArchetype {

        //01 - Fixo
        public static String REG = "REG";
        //02 - Período de Apuração do Crédito (MM/AAAA)
        public static String PER_APU_CRED = "PER_APU_CRED";
        //03 - Indicador da origem do crédito:
        //01 – Crédito decorrente de operações próprias;
        //02 – Crédito transferido por pessoa jurídica sucedida.
        public static String ORIG_CRED = "ORIG_CRED";
        //04 - CNPJ da pessoa jurídica cedente do crédito (se ORIG_CRED = 02).
        public static String CNPJ_SUC = "CNPJ_SUC";
        //05 - Código do Tipo do Crédito, conforme Tabela 4.3.6.
        public static String COD_CRED = "COD_CRED";
        //06
        /**Valor Total do crédito apurado na Escrituração Fiscal Digital
         * (Registro M500) ou em demonstrativo DACON (Fichas 16A
         * e 16B) de período anterior
         */
        public static String VL_CRED_APU = "VL_CRED_APU";
        //07
        /**Valor de Crédito Extemporâneo Apurado (Registro 1501),
         * referente a Período Anterior, Informado no Campo 02 –
         * PER_APU_CRED
         */
        public static String VL_CRED_EXT_APU = "VL_CRED_EXT_APU";
        //08 - Valor Total do Crédito Apurado (06 + 07)
        public static String VL_TOT_CRED_APU = "VL_TOT_CRED_APU";
        //09 - Valor do Crédito utilizado mediante Desconto, em Período(s) Anterior(es)
        public static String VL_CRED_DESC_PA_ANT = "VL_CRED_DESC_PA_ANT";
        //10 - Valor do Crédito utilizado mediante Pedido de Ressarcimento, em Período(s) Anterior(es).
        public static String VL_CRED_PER_PA_ANT = "VL_CRED_PER_PA_ANT";
        //11 - Valor do Crédito utilizado mediante Declaração de
        //Compensação Intermediária (Crédito de Exportação), em 
        //Período(s) Anterior(es)
        public static String VL_CRED_DCOMP_PA_ANT = "VL_CRED_DCOMP_PA_ANT";
        //12  - Saldo do Crédito Disponível para Utilização neste Período de Escrituração (08-09-10-11)
        public static String SD_CRED_DISP_EFD = "SD_CRED_DISP_EFD";
        //13 - Valor do Crédito descontado neste período de escrituração
        public static String VL_CRED_DESC_EFD = "VL_CRED_DESC_EFD";
        //14 - Valor do Crédito objeto de Pedido de Ressarcimento (PER) neste período de escrituração
        public static String VL_CRED_PER_EFD = "VL_CRED_PER_EFD";
        //15 - Valor do Crédito utilizado mediante Declaração de 
        //Compensação Intermediária neste período de escrituração
        public static String VL_CRED_DCOMP_EFD = "VL_CRED_DCOMP_EFD";
        //16 - Valor do crédito transferido em evento de cisão, fusão ou incorporação
        public static String VL_CRED_TRANS = "VL_CRED_TRANS";
        //17 - Valor do crédito utilizado por outras formas
        public static String VL_CRED_OUT = "VL_CRED_OUT";
        //18 - Saldo de créditos a utilizar em período de apuração futuro (12-13-14-15-16-17).
        public static String SLD_CRED_FIM = "SLD_CRED_FIM";


    public Registro1500(){
        setName("Controle de Créditos Fiscais – COFINS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        FieldDecimalMaximumLengthArchetype fdm2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm2.setFormat(fw);
        fdm2.setNullableRepresentation("");
        fdm2.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1500"));
        //02
        addFieldArchetype(PER_APU_CRED, new FieldDateFixedLengthArchetype("MMyyyy"));
        //03
        addFieldArchetype(ORIG_CRED, new FieldIntegerFixedLengthArchetype(2));
        //04
        addFieldArchetype(CNPJ_SUC , new FieldIntegerFixedLengthArchetype(14));
        //05
        addFieldArchetype(COD_CRED, new FieldIntegerFixedLengthArchetype(3));
        //06
        addFieldArchetype(VL_CRED_APU, fdm);
        //07
        addFieldArchetype(VL_CRED_EXT_APU, fdm2);
        //08
        addFieldArchetype(VL_TOT_CRED_APU, fdm);
        //09
        addFieldArchetype(VL_CRED_DESC_PA_ANT, fdm);
        //10
        addFieldArchetype(VL_CRED_PER_PA_ANT, fdm2);
        //11
        addFieldArchetype(VL_CRED_DCOMP_PA_ANT, fdm2);
        //12
        addFieldArchetype(SD_CRED_DISP_EFD, fdm);
        //13
        addFieldArchetype(VL_CRED_DESC_EFD, fdm2);
        //14
        addFieldArchetype(VL_CRED_PER_EFD, fdm2);
        //15
        addFieldArchetype(VL_CRED_DCOMP_EFD, fdm2);
        //16
        addFieldArchetype(VL_CRED_TRANS, fdm2);
        //17
        addFieldArchetype(VL_CRED_OUT, fdm2);
        //18
        addFieldArchetype(SLD_CRED_FIM, fdm2);

    }

}