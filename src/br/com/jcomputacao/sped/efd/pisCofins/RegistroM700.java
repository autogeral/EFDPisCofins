package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 11:53:49
 * @author rafael.galvao
 */
public class RegistroM700 extends LineArchetype{

    public static String REG = "REG";
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
    public static String VL_CONT_APUR_DIFER = "VL_CONT_APUR_DIFER";
    public static String NAT_CRED_DESC = "NAT_CRED_DESC";
    public static String VL_CRED_DESC_DIFER = "VL_CRED_DESC_DIFER";
    public static String VL_CONT_DIFER_ANT = "VL_CONT_DIFER_ANT";
    public static String PER_APUR = "PER_APUR";
    public static String DT_RECEB = "DT_RECEB";
    
    
    public RegistroM700(){
        
        setName("Cofins diferida em períodos anteriores - valores a pagar no período");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        FieldDecimalMaximumLengthArchetype fdm1 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm1.setFormat(fw);
        fdm1.setNullableRepresentation("");
        fdm1.setFullFillingNullable(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M700"));
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
        addFieldArchetype(VL_CRED_DESC_DIFER, fdm1);
        //06
        addFieldArchetype(VL_CONT_DIFER_ANT, fdm);
        //07
        addFieldArchetype(PER_APUR, new FieldDateFixedLengthArchetype("MMyyyy"));
        //08
        addFieldArchetype(DT_RECEB, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
