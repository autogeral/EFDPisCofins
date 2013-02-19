package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:35:05
 * @author William Antunes
 */
public class Registro1200 extends LineArchetype {
    
        //01 - Fixo
        public static String REG = "REG";
        //02 - Período de Apuração da Contribuição Social Extemporânea (MMAAAA).
        public static String PER_APUR_ANT = "PER_APUR_ANT";
        //03 - Natureza da Contribuição a Recolher, conforme Tabela 4.3.5.
        /**
        * Tabela 4.3.5
        * <table>
        * <tr><th colspan="2">4.3.5 – Tabela Código de Contribuição Social Apurada</th></tr>
        * <tr><th>Codigo</th><th>Descricao</th></tr>
        * <tr><td>01</td><td>Contribuição não-cumulativa apurada a alíquota básica</td></tr>
        * <tr><td>02</td><td>Contribuição não-cumulativa apurada a alíquotas diferenciadas</td></tr>
        * <tr><td>03</td><td>Contribuição não-cumulativa apurada a alíquota por unidade de medida de produto</td></tr>
        * <tr><td>04</td><td>Contribuição não-cumulativa apurada a alíquota básica – Atividade Imobiliária</td></tr>
        * <tr><td>31</td><td>Contribuição apurada por substituição tributária</td></tr> 
        * <tr><td>32</td><td>Contribuição apurada por substituição tributária – Vendas à Zona Franca de Manaus</td></tr>
        * <tr><td>51</td><td>Contribuição cumulativa apurada a alíquota básica</td></tr>
        * <tr><td>53</td><td>Contribuição cumulativa apurada a alíquota por unidade de medida de produto</td></tr>
        * <tr><td>54</td><td>Contribuição cumulativa apurada a alíquota básica – Atividade Imobiliária</td></tr>
        * <tr><td>70</td><td>Contribuição apurada da Atividade Imobiliária - RET</td></tr>
        * <tr><td>71</td><td>Contribuição apurada de SCP – Incidência Não Cumulativa</td></tr>
        * <tr><td>72</td><td>Contribuição apurada de SCP – Incidência Cumulativa</td></tr>
        * <tr><td>99</td><td>Contribuição para o PIS/Pasep – Folha de Salários</td></tr>
        * </table>
        */
        public static String NAT_CONT_REC = "NAT_CONT_REC";
        //04 - alor da Contribuição Apurada.
        public static String VL_CONT_APUR = "VL_CONT_APUR";
        //05 - Valor do Crédito de PIS/PASEP a Descontar, da Contribuição Social Extemporânea.
        public static String VL_CRED_PIS_DESC = "VL_CRED_PIS_DESC";
        //06 - Valor da Contribuição Social Extemporânea Devida.
        public static String VL_CONT_DEV = "VL_CONT_DEV";
        //07 - Valor de Outras Deduções.
        public static String VL_OUT_DED = "VL_OUT_DED";
        //08 - Valor da Contribuição Social Extemporânea a pagar.
        public static String VL_CONT_EXT = "VL_CONT_EXT";
        //09 - Valor da Multa.
        public static String VL_MUL = "VL_MUL";
        //10 - Valor dos Juros.
        public static String VL_JUR = "VL_JUR";
        //11 - Data do Recolhimento.
        public static String DT_RECOL = "DT_RECOL";
    
    public Registro1200(){
        setName("Contribuição Social Extemporânea – PIS/PASEP");
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
        addFieldArchetype(REG, new FieldDefaultArchetype("1200"));    
        //02
        addFieldArchetype(PER_APUR_ANT, new FieldDateFixedLengthArchetype("MMyyyy"));
        //03
        addFieldArchetype(NAT_CONT_REC, new FieldStringMaximumLengthArchetype(2));
        //04
        addFieldArchetype(VL_CONT_APUR , fdm);
        //05
        addFieldArchetype(VL_CRED_PIS_DESC, fdm);
        //06
        addFieldArchetype(VL_CONT_DEV, fdm);
        //07
        addFieldArchetype(VL_OUT_DED, fdm);
        //08
        addFieldArchetype(VL_CONT_EXT , fdm);
        //09
        addFieldArchetype(VL_MUL, fdm2);
        //10
        addFieldArchetype(VL_JUR, fdm2);
        //11
        addFieldArchetype(DT_RECOL, new FieldDateFixedLengthArchetype("ddMMyyyy"));


    }
    
}
