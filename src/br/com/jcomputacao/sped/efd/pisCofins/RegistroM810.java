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
 * 12/11/2011 11:34:51
 * @author rafael.galvao
 */
public class RegistroM810 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Natureza da Receita, conforme relação constante nas
     * Tabelas de Detalhamento da Natureza da Receita por
     * Situação Tributária abaixo: Tabelas 4.3.k, onde k pertence [10,16] 
     * Verificar pagina 236 da documentação
     */
    public static String NAT_REC = "NAT_REC";
    //03 - Valor da receita bruta no período, relativo a natureza da receita (NAT_REC)
    public static String VL_REC = "VL_REC";
    //04 - Código da conta analítica contábil debitada/creditada.
    public static String COD_CTA = "COD_CTA";
    //05 - Descrição Complementar da Natureza da Receita.
    public static String DESC_COMPL = "DESC_COMPL";
    
    public RegistroM810(){
        setName("Detalhamento das receitas isentas, não alcançadas pela incidência da contribuição, sujeitas a alíquota zero ou vendas com suspensão - Cofins");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);

        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M410"));
        //02
        addFieldArchetype(NAT_REC, new FieldStringFixedLengthArchetype(3));
        //03
        addFieldArchetype(VL_REC, fdm);
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
