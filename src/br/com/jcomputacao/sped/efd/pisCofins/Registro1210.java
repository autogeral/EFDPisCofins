package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 20:54:11
 * @author William Antunes
 */
public class Registro1210 extends LineArchetype {
    
        //01 - Fixo
        public static String REG = "REG";
        //02 - Número de inscrição do estabelecimento no CNPJ (Campo 04 do Registro 0140).
        public static String CNPJ = "CNPJ";
        //03 - Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
        public static String CST_PIS = "CST_PIS";
        //04 - Código do participante (Campo 02 do Registro 0150)
        public static String COD_PART = "COD_PART";
        //05 - Data da Operação (ddmmaaaa)
        public static String DT_OPER = "DT_OPER";
        //06 - Valor da Operação
        public static String VL_OPER = "VL_OPER";
        //07 - Base de cálculo do PIS/PASEP (em valor ou em quantidade)
        public static String VL_BC_PIS = "VL_BC_PIS";
        //08 - Alíquota da PIS (em percentual ou em reais)
        public static String ALIQ_PIS = "ALIQ_PIS";
        //09 - Valor do PIS/PASEP
        public static String VL_PIS = "VL_PIS";
        //10 - Código da conta analítica contábil debitada/creditada
        public static String COD_CTA = "COD_CTA";
        //11 - Descrição complementar do Documento/Operação
        public static String DESC_COMPL = "DESC_COMPL";


    
    public Registro1210(){
        setName("Detalhamento da Contribuição Social Extemporânea – PIS/PASEP");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1210"));
        //02        
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //03
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(60);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_PART , f04);
        //05
        addFieldArchetype(DT_OPER, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //06
        FieldDecimalMaximumLengthArchetype f06 = new FieldDecimalMaximumLengthArchetype(15,2);
        f06.setFormat(fw);
        addFieldArchetype(VL_OPER, f06);
        //07
        FieldDecimalMaximumLengthArchetype f07 = new FieldDecimalMaximumLengthArchetype(16,3);
        f07.setFormat(fw3);
        addFieldArchetype(VL_BC_PIS, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(17,4);
        f08.setFormat(fw4);
        addFieldArchetype(ALIQ_PIS , f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_PIS, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(60);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f10);
        //11
        FieldStringMaximumLengthArchetype f11 = new FieldStringMaximumLengthArchetype(255);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(DESC_COMPL, f11);


    }
    
}
