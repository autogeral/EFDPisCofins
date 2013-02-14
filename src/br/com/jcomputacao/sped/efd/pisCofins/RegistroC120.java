package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 22:04:31
 * @author rafael.galvao
 */
public class RegistroC120 extends LineArchetype {
    
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
    
    public RegistroC120(){
        
            
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(15,2);
        fdf.setFormat(fw);
        fdf.setNullableRepresentation("");
        fdf.setFullFillingNullable(false);
        
        setName("Complemento do documento - operações de importação (código 01)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C120"));
        //02
        addFieldArchetype(COD_DOC_IMP, new FieldStringFixedLengthArchetype(1));
        //03
        addFieldArchetype(NUM_DOC_IMP, new FieldStringMaximumLengthArchetype(10));
        //04
        addFieldArchetype(VL_PIS_IMP, fdf);
        //05
        addFieldArchetype(VL_COFINS_IMP, fdf);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(20);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(NUM_ACDRAW, f06);
    }
}
