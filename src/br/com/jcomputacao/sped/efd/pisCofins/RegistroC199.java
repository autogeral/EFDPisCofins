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
 * 12/11/2011 11:07:34
 * @author rafael.galvao
 */
public class RegistroC199 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Documento de importação:
     * 0 – Declaração de Importação
     * 1 – Declaração Simplificada de Importação
     */
    public static String COD_DOC_IMP = "COD_DOC_IMP";
    //03 - Número do documento de Importação.
    public static String NUM_DOC_IMP = "NUM_DOC_IMP";
    //04 - Valor pago de PIS na importação
    public static String VL_PIS_IMP = "VL_PIS_IMP";
    //05 - Valor pago de COFINS na importação
    public static String VL_COFINS_IMP = "VL_COFINS_IMP";
    //06 - Número do Ato Concessório do regime Drawback
    public static String NUM_ACDRAW = "NUM_ACDRAW";
    
    public RegistroC199(){
        setName("Complemento do documento - operações de importação (código 55)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C199"));
        //02
        addFieldArchetype(COD_DOC_IMP, new FieldStringFixedLengthArchetype(1));
        //03
        addFieldArchetype(NUM_DOC_IMP, new FieldStringMaximumLengthArchetype(10));
        //04
        FieldDecimalMaximumLengthArchetype f04 = new FieldDecimalMaximumLengthArchetype(15,2);
        f04.setFormat(fw);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS_IMP, f04);
        //05
        FieldDecimalMaximumLengthArchetype f05 = new FieldDecimalMaximumLengthArchetype(15,2);
        f05.setFormat(fw);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS_IMP, f05);
        //06
        addFieldArchetype(NUM_ACDRAW, new FieldStringMaximumLengthArchetype(20));
    }
    
    
    
    
}
