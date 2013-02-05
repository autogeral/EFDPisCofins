package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Feb 5, 2013 3:45:58 PM
 * @author Jennifer
 */
public class RegistroC800 extends LineArchetype{
    //01 - Fixo
    public static String REG = "REG";
    //02 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
    public static String COD_MOD = "COD_MOD";
    //03 - Código da situação do documento fiscal, conforme a Tabela 4.1.2
    public static String COD_SIT = "COD_SIT";
    //04 - Número do Cupom Fiscal Eletrônico
    public static String NUM_CFE = "NUM_CFE";
    //05 - Data da emissão do Cupom Fiscal Eletrônico
    public static String DT_DOC = "DT_DOC";
    //06 - Valor total do Cupom Fiscal Eletrônico
    public static String VL_CFE = "VL_CFE";
    //07 - Valor total do PIS
    public static String VL_PIS = "VL_PIS";
    //08 - Valor total da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //09 - CNPJ ou CPF do destinatário
    public static String CNPJ_CPF = "CNPJ_CPF";
    //10 - Número de Série do equipamento SAT
    public static String NR_SAT = "NR_SAT";
    //11 - Chave do Cupom Fiscal Eletrônico
    public static String CHV_CFE = "CHV_CFE";
    //12 - Valor total do desconto/exclusão sobre item
    public static String VL_DESC = "VL_DESC";
    //13 - Valor total das mercadorias e serviços
    public static String VL_MERC = "VL_MERC";
    //14 - Valor de outras desp. Acessórias (acréscimo)
    public static String VL_OUT_DA = "VL_OUT_DA";
    //15 - Valor do ICMS
    public static String VL_ICMS = "VL_ICMS";
    //16 - Valor total do PIS retido por subst. trib.
    public static String VL_PIS_ST = "VL_PIS_ST";
    //17 - Valor total da COFINS retido por subst. trib.
    public static String VL_COFINS_ST = "VL_COFINS_ST";

    public RegistroC800(){
        setName("Cupom fiscal eletrônico (código 59)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C800"));
        //02
        addFieldArchetype(COD_MOD, new FieldIntegerMaximumLengthArchetype(2));
        //03
        addFieldArchetype(NUM_CFE, new FieldIntegerMaximumLengthArchetype(2));
        //04
        
    }
}
