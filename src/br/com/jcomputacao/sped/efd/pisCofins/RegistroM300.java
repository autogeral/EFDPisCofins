package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 22:26:06
 * @author rafael.galvao
 */
public class RegistroM300 extends LineArchetype{
   
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código da contribuição social diferida em períodos anteriores, conforme a Tabela 4.3.5
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
    public static String COD_CONT = "COD_CONT";
    //03 - Valor da Contribuição Apurada, diferida em períodos anteriores
    public static String VL_CONT_APUR_DIFER = "VL_CONT_APUR_DIFER";
    //04
    /**Natureza do Crédito Diferido, vinculado à receita tributada no mercado interno, a descontar:
     * 01 – Crédito a Alíquota Básica;
     * 02 – Crédito a Alíquota Diferenciada;
     * 03 – Crédito a Alíquota por Unidade de Produto;
     * 04 – Crédito Presumido da Agroindústria
     */
    public static String NAT_CRED_DESC = "NAT_CRED_DESC";
    //05 - Valor do Crédito a Descontar vinculado à contribuição diferida.
    public static String VL_CRED_DESC_DIFER = "VL_CRED_DESC_DIFER";
    //06 - Valor da Contribuição a Recolher, diferida em períodos anteriores (Campo 03 – Campo 05)
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    //07 - Período de apuração da contribuição social e dos créditos diferidos (MMAAAA)
    public static String PER_APUR = "PER_APUR";
    //08 - Data de recebimento da receita, objeto de diferimento
    public static String DT_RECEB = "DT_RECEB";
    
    public RegistroM300(){
        setName("");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M300"));
        //02
        addFieldArchetype(COD_CONT, new FieldStringMaximumLengthArchetype(2));
        //03
        addFieldArchetype(VL_CONT_APUR_DIFER, fdm);
        //04
        FieldStringFixedLengthArchetype f04 = new FieldStringFixedLengthArchetype(2);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(NAT_CRED_DESC, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(VL_CRED_DESC_DIFER, f05);
        //06
        addFieldArchetype(VL_CONT_DIFER_ANT, fdm);
        //07
        addFieldArchetype(PER_APUR, new FieldDateFixedLengthArchetype("MMyyyy"));
        //08
        addFieldArchetype(DT_RECEB, new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }
}
