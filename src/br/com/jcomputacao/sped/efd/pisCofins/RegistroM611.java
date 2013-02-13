package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 17/11/2011 19:20:02
 * @author rafael.galvao
 */
public class RegistroM611 extends LineArchetype{
    
    //0 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador do Tipo de Sociedade Cooperativa:
     * 01 – Cooperativa de Produção Agropecuária;
     * 02 – Cooperativa de Consumo;
     * 03 – Cooperativa de Crédito;
     * 04 – Cooperativa de Eletrificação Rural;
     * 05 – Cooperativa de Transporte Rodoviário de Cargas;
     * 06 – Cooperativa de Médicos;
     * 99 – Outras
     */
    public static String IND_TIP_COOP = "IND_TIP_COOP";
    //03
    /**Valor da Base de Cálculo da Contribuição, conforme
     * Registros escriturados nos Blocos A, C, D e F, antes das
     * Exclusões das Sociedades Cooperativas
     */
    public static String VL_BC_CONT_ANT_EXC_COOP = "VL_BC_CONT_ANT_EXC_COOP";
    //04
    /**Valor de Exclusão Especifica das Cooperativas em Geral,
     * decorrente das Sobras Apuradas na DRE, destinadas a
     * constituição do Fundo de Reserva e do FATES
     */
    public static String VL_EXC_COOP_GER = "VL_EXC_COOP_GER";
    //05
    /**Valor das Exclusões da Base de Cálculo Especifica do
     * Tipo da Sociedade Cooperativa, conforme Campo 02
     * (IND_TIP_COOP)
     */
    public static String VL_EXC_ESP_COOP = "VL_EXC_ESP_COOP";
    //06
    /**Valor da Base de Cálculo, Após as Exclusões Especificas
     * da Sociedade Cooperativa (04 – 05 – 06) – Transportar
     * para M610
     */
    public static String VL_BC_CONT = "VL_BC_CONT";
    
    
    public RegistroM611(){
        setName("Sociedades cooperativas - composição da base de cálculo - Cofins");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        FieldDecimalMaximumLengthArchetype fdm1 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm1.setFormat(fw);
        fdm1.setNullableRepresentation("");
        fdm1.setFullFillingNullable(false);
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("M611"));
        //02
        addFieldArchetype(IND_TIP_COOP, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(VL_BC_CONT_ANT_EXC_COOP, fdm);
        //04
        addFieldArchetype(VL_EXC_COOP_GER, fdm1);
        //05
        addFieldArchetype(VL_EXC_ESP_COOP, fdm1);
        //06
        addFieldArchetype(VL_BC_CONT, fdm);
        
    }
    
    
    
}
