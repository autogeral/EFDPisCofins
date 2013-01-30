package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 19:06:03
 * @author rafael.galvao
 */
public class RegistroC170 extends LineArchetype{

    //01 - Fixo
    public static final String REG = "REG";
    //02
    public static final String NUM_ITEM = "NUM_ITEM";
    //03
    public static final String COD_ITEM = "COD_ITEM";
    //04
    public static final String DESCR_COMPL = "DESCR_COMPL";
    //05
    public static final String QTD = "QTD";
    //06
    public static final String UNID = "UNID";
    //07
    public static final String VL_ITEM = "VL_ITEM";
    //08
    public static final String VL_DESC = "VL_DESC";
    //09
    /**Movimentação física do ITEM/PRODUTO: 
     * 0 - SIM 
     * 1 - NÃO
     */
    public static final String IND_MOV = "IND_MOV";
    //10
    public static final String CST_ICMS = "CST_ICMS";
    //11
    public static final String CFOP = "CFOP";
    //12
    public static final String COD_NAT = "COD_NAT";
    //13
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    //14
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    //15
    public static final String VL_ICMS = "VL_ICMS";
    //16
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    //17
    public static final String ALIQ_ST = "ALIQ_ST";
    //18
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    //19
    public static final String IND_APUR = "IND_APUR";
    //20
    public static final String CST_IPI = "CST_IPI";
    //21
    public static final String COD_ENQ = "COD_ENQ";
    //22
    public static final String VL_BC_IPI = "VL_BC_IPI";
    //23
    public static final String ALIQ_IPI = "ALIQ_IPI";
    //24
    public static final String VL_IPI = "VL_IPI";
    //25
    public static final String CST_PIS = "CST_PIS";
    //26
    public static final String VL_BC_PIS = "VL_BC_PIS";
    //27
    public static final String ALIQ_PIS = "ALIQ_PIS";
    //28
    public static final String QUANT_BC_PIS = "QUANT_BC_PIS";
    //29
    public static final String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //30
    public static final String VL_PIS = "VL_PIS";
    //31
    public static final String CST_COFINS = "CST_COFINS";
    //32
    public static final String VL_BC_COFINS = "VL_BC_COFINS";
    //33
    public static final String ALIQ_COFINS = "ALIQ_COFINS";
    //34
    public static final String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //35
    public static final String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //36
    public static final String VL_COFINS = "VL_COFINS";
    //37
    public static final String COD_CTA = "COD_CTA";

    public RegistroC170() {
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
                
        setName("Complemento do documento - itens do documento (códigos 01, 1B e 55)");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C170"));
        //02
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        //03
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //04
        addFieldArchetype(DESCR_COMPL, new FieldStringMaximumLengthArchetype(255));
        //05
        FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(15,5);
        fdf.setFormat(fw);
        addFieldArchetype(QTD, fdf);
        //06
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        //07
        FieldDecimalMaximumLengthArchetype fdf2 = new FieldDecimalMaximumLengthArchetype(15,5);
        fdf2.setFormat(fw);
        addFieldArchetype(VL_ITEM, fdf2);
        //08
        addFieldArchetype(VL_DESC, fdf2);
        //09
        addFieldArchetype(IND_MOV, new FieldStringMaximumLengthArchetype(1));
        //10
        addFieldArchetype(CST_ICMS, new FieldIntegerMaximumLengthArchetype(3));
        //11
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        addFieldArchetype(COD_NAT, new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(VL_BC_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_ICMS, new FieldDecimalMaximumLengthArchetype(6, 2));
        addFieldArchetype(VL_ICMS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(VL_BC_ICMS_ST, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_ST, new FieldDecimalMaximumLengthArchetype(6, 2));
        addFieldArchetype(VL_ICMS_ST, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(IND_APUR, new FieldStringMaximumLengthArchetype(1));
        addFieldArchetype(CST_IPI, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_ENQ, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(VL_BC_IPI, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_IPI, new FieldDecimalMaximumLengthArchetype(6, 2));
        addFieldArchetype(VL_IPI, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_PIS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_PIS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_PIS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_PIS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(CST_COFINS, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(VL_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8, 4));
        addFieldArchetype(QUANT_BC_COFINS, new FieldDecimalMaximumLengthArchetype(20, 3));
        addFieldArchetype(ALIQ_COFINS_QUANT, new FieldDecimalMaximumLengthArchetype(20, 4));
        addFieldArchetype(VL_COFINS, new FieldDecimalMaximumLengthArchetype(20, 2));
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(60));

    }

  
}
