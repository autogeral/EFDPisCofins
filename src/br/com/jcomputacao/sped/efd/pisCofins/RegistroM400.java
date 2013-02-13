package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 21:27:17
 * @author rafael.galvao
 */
public class RegistroM400 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Código de Situação Tributária – CST das demais receitas
     * auferidas no período, sem incidência da contribuição, ou
     * sem contribuição apurada a pagar, conforme a Tabela 4.3.3
     */
    public static String CST_PIS = "CST_PIS";
    //03 - Valor total da receita bruta no período.
    public static String VL_TOT_REC = "VL_TOT_REC";
    //04 - Código da conta analítica contábil debitada/creditada.
    public static String COD_CTA = "COD_CTA";
    //05 - Descrição Complementar da Natureza da Receita.
    public static String DESC_COMPL = "DESC_COMPL";
    
    public RegistroM400(){
        setName("");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M400"));
        //02
        addFieldArchetype(CST_PIS, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(VL_TOT_REC, fdm);
        //04
        FieldStringMaximumLengthArchetype f04 = new FieldStringMaximumLengthArchetype(60);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f04);
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(255);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(DESC_COMPL, f05);
    }
}
