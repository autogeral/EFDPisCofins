package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 20:36:46
 * @author rafael.galvao
 */
public class RegistroC180 extends LineArchetype{

    //01 - Fixo
    public static String REG = "REG";
    //02 - Texto fixo contendo "55" (Código da Nota Fiscal Eletrônica, modelo 55, conforme a Tabela 4.1.1)
    public static String COD_MOD = "COD_MOD";
    //03 - Data de Emissão Inicial dos Documentos
    public static String DT_DOC_INI = "DT_DOC_INI";
    //04 - Data de Emissão Final dos Documentos
    public static String DT_DOC_FIN = "DT_DOC_FIN";
    //05 - Código do Item (campo 02 do Registro 0200)
    public static String COD_ITEM = "COD_ITEM";
    //06 - Código da Nomenclatura Comum do Mercosul
    public static String COD_NCM = "OD_NCM";
    //07 - Código EX, conforme a TIPI
    public static String EX_IPI = "EX_IPI";
    //08 - Valor Total do Item
    public static String VL_TOT_ITEM = "VL_TOT_ITEM";
    
    public RegistroC180(){
        setName("OCnsolidação de notas fiscais eletrônicas emitidas pela pessoa jurídica (código 55) - operações de vendas");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C180"));
        //02
        addFieldArchetype(COD_MOD, new FieldDefaultArchetype("55"));
        //03
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //05
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //06
        FieldStringFixedLengthArchetype f06 = new FieldStringFixedLengthArchetype(8);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(COD_NCM, f06);
        //07
        FieldStringMaximumLengthArchetype f07 = new FieldStringMaximumLengthArchetype(3);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(EX_IPI, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        addFieldArchetype(VL_TOT_ITEM, f08);
        
    }
}
