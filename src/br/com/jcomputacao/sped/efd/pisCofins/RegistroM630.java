package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 12/11/2011 12:12:28
 * @author rafael.galvao
 */
public class RegistroM630 extends LineArchetype{
    
    //01 - Fixo
    public static String REG = "REG";
    //02
    /**CNPJ da pessoa jurídica de direito público, empresa
     * pública, sociedade de economia mista ou suas
     * subsidiárias
     */
    public static String CNPJ = "CNPJ";
    //03 - Valor Total das vendas no período
    public static String VL_VEND = "VL_VEND";
    //04 - Valor Total não recebido no período
    public static String VL_NAO_RECEB = "VL_NAO_RECEB";
    //05 - Valor da Contribuição diferida no período
    public static String VL_CONT_DIF = "VL_CONT_DIF";
    //06 - Valor do Crédito diferido no período
    public static String VL_CRED_DIF = "VL_CRED_DIF";
    //07 - Código de Tipo de Crédito diferido no período, conforme a Tabela 4.3.6
    public static String COD_CRED = "COD_CRED";
    
    public RegistroM630(){
        
        setName("Informações adicionais de diferimento");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M630"));
        //02
        addFieldArchetype(CNPJ, new FieldIntegerMaximumLengthArchetype(14));
        //03
        addFieldArchetype(VL_VEND, fdm);
        //04
        addFieldArchetype(VL_NAO_RECEB, fdm);
        //05
        addFieldArchetype(VL_CONT_DIF, fdm);
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(VL_CRED_DIF, f06);
        //07
        FieldStringFixedLengthArchetype f07 = new FieldStringFixedLengthArchetype(3);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(COD_CRED, f07);
    }
}
