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
 * @author Jennifer
 */
public class Registro0145 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Código indicador da incidência tributária no período:
     * 1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta
     * 2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações pagas, na
     * forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991
     */
    public static String COD_INC_TRIB = "COD_INC_TRIB";
    //03 - Valor da Receita Bruta Total da Pessoa Jurídica no Período
    public static String VL_REC_TOT = "VL_REC_TOT";
    //04
    /**Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à
     * Contribuição Previdenciária sobre a Receita Bruta
     */
    public static String VL_REC_ATIV = "VL_REC_ATIV";         
    //05
    /**Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à
     * Contribuição Previdenciária sobre a Remuneração (Incisos I e
     * III do art. 22 da Lei nº 8.212, de 1991)
     */
    public static String VL_REC_DEMAIS_ATIV = "VL_REC_DEMAIS_ATIV";
    //06 - 
    public static String INFO_COMPL = "INFO_COMPL";
    
    public Registro0145(){
        setName("Regime de Apuração da Contribuição Previdenciária sobre a Receita Bruta");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("0145"));
        //02
        addFieldArchetype(COD_INC_TRIB, new FieldIntegerFixedLengthArchetype(1));
        //03
        FieldDecimalMaximumLengthArchetype f03 = new FieldDecimalMaximumLengthArchetype(15,2);
        f03.setFormat(fw);
        addFieldArchetype(VL_REC_TOT, f03);
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        addFieldArchetype(VL_REC_ATIV, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(VL_REC_DEMAIS_ATIV, f05);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(255);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(INFO_COMPL, f06);
                
    }
}
