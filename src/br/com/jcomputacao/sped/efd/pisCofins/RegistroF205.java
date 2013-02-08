
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 23/11/2011 10:03:31
 * @author Douglas
 */
public class RegistroF205 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02 - Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês anterior ao da escrituração
    public static String VL_CUS_INC_ACUM_ANT = "VL_CUS_INC_ACUM_ANT";
    //03 - Valor Total do Custo Incorrido da unidade imobiliária no mês da escrituração
    public static String VL_CUS_INC_PER_ESC = "VL_CUS_INC_PER_ESC";
    //04 - Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês da escrituração (Campo 02 + 03)
    public static String VL_CUS_INC_ACUM = "VL_CUS_INC_ACUM";
    //05 - Parcela do Custo Incorrido sem direito ao crédito da atividade imobiliária, acumulado até o período.
    public static String VL_EXC_BC_CUS_INC_ACUM = "VL_EXC_BC_CUS_INC_ACUM";
    //06 - Valor da Base de Cálculo do Crédito sobre o Custo Incorrido, acumulado até o período da escrituração (Campo 04 – 05)
    public static String VL_BC_CUS_INC = "VL_BC_CUS_INC";
    //07 - Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
    public static String CST_PIS = "CST_PIS";
    //08 - Alíquota do PIS/PASEP (em percentual)
    public static String ALIQ_PIS = "ALIQ_PIS";
    //09 - Valor Total do Crédito Acumulado sobre o custo incorrido – PIS/PASEP (Campo 06 x 08)
    public static String VL_CRED_PIS_ACUM = "VL_CRED_PIS_ACUM";
    //10 - Parcela do crédito descontada até o período anterior da escrituração – PIS/PASEP (proporcional à receita recebida até o mês anterior).
    public static String VL_CRED_PIS_DESC_ANT = "VL_CRED_PIS_DESC_ANT";
    //11 - Parcela a descontar no período da escrituração – PIS/PASEP (proporcional à receita recebida no mês).
    public static String VL_CRED_PIS_DESC = "VL_CRED_PIS_DESC";
    //12 - Parcela a descontar em períodos futuros – PIS/PASEP (Campo 09 – 10 – 11).
    public static String VL_CRED_PIS_DESC_FUT = "VL_CRED_PIS_DESC_FUT";
    //13 - Código da Situação Tributária referente ao COFINS, conforme a Tabela indicada no item 4.3.4.
    public static String CST_COFINS = "CST_COFINS";
    //14 - Alíquota do COFINS (em percentual)
    public static String ALIQ_COFINS = "ALIQ_COFINS";
    //15 - Valor Total do Crédito Acumulado sobre o custo incorrido - COFINS (Campo 06 x 14)
    public static String VL_CRED_COFINS_ACUM = "VL_CRED_COFINS_ACUM";
    //16 - Parcela do crédito descontada até o período anterior da escrituração – COFINS (proporcional à receita recebida até o mês anterior).
    public static String VL_CRED_COFINS_DESC_ANT = "VL_CRED_COFINS_DESC_ANT";
    //17 - Parcela a descontar no período da escrituração – COFINS (proporcional à receita recebida no mês).
    public static String VL_CRED_COFINS_DESC = "VL_CRED_COFINS_DESC";
    //18 - Parcela a descontar em períodos futuros – COFINS (Campo 15 – 16 – 17).
    public static String VL_CRED_COFINS_DESC_FUT = "VL_CRED_COFINS_DESC_FUT";
    

    public RegistroF205() {
        setName("Operação de atividade imobiliária - custo incorrido da unidade imobiliária");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F205"));
        addFieldArchetype(VL_CUS_INC_ACUM_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CUS_INC_PER_ESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CUS_INC_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_EXC_BC_CUS_INC_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_BC_CUS_INC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_PIS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_PIS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_PIS_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_PIS_DESC_FUT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(CST_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_COFINS, new FieldDecimalMaximumLengthArchetype(8,4));
        addFieldArchetype(VL_CRED_COFINS_ACUM, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS_DESC_ANT, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS_DESC, new FieldDecimalMaximumLengthArchetype(20,2));
        addFieldArchetype(VL_CRED_COFINS_DESC_FUT, new FieldDecimalMaximumLengthArchetype(20,2));
       
    }
}
