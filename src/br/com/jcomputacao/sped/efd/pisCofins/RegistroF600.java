
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 24/11/2011 08:53:40
 * @author Douglas
 */
public class RegistroF600 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador de Natureza da Retenção na Fonte:
     * 01 - Retenção por Órgãos, Autarquias e Fundações Federais
     * 02 - Retenção por outras Entidades da Administração Pública Federal
     * 03 - Retenção por Pessoas Jurídicas de Direito Privado
     * 04 - Recolhimento por Sociedade Cooperativa
     * 05 - Retenção por Fabricante de Máquinas e Veículos
     * 99 - Outras Retenções
     */
    public static String IND_NAT_RET = "IND_NAT_RET";
    //03 - Data da Retenção
    public static String DT_RET = "DT_RET";
    //04 - Base de calculo da retenção ou do recolhimento (sociedade cooperativa)
    public static String VL_BC_RET = "VL_BC_RET";
    //05 - Valor Total Retido na Fonte / Recolhido (sociedade cooperativa)
    public static String VL_RET = "VL_RET";
    //06 - Código da Receita
    public static String COD_REC = "COD_REC";
    //07
    /**Indicador da Natureza da Receita:
     * 0 – Receita de Natureza Não Cumulativa
     * 1 – Receita de Natureza Cumulativa
     */
    public static String IND_NAT_REC = "IND_NAT_REC";
    //08
    /**CNPJ referente a:
     * - Fonte Pagadora Responsável pela Retenção/Recolhimento 
     * (no caso de o registro ser escriturado
     * pela pessoa jurídica beneficiária da retenção); ou
     * - Pessoa Jurídica Beneficiária da Retenção/Recolhimento 
     * (no caso de o registro ser escriturado
     * pela pessoa jurídica responsável pela retenção)
     */
    public static String CNPJ = "CNPJ";
    //09 - Valor Retido na Fonte – Parcela Referente ao PIS/Pasep
    public static String VL_RET_PIS = "VL_RET_PIS";
    //10 - Valor Retido na Fonte – Parcela Referente a COFINS
    public static String VL_RET_COFINS = "VL_RET_COFINS";
    //11
    /**Indicador da condição da pessoa jurídica declarante:
     * 0 – Beneficiária da Retenção / Recolhimento
     * 1- Responsável pelo Recolhimento
     */
    public static String IND_DEC = "IND_DEC";

    public RegistroF600() {
        setName("");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FormatWrapper fw4 = FormatFactory.getDecimalFormatWithPrecision(4);
        fw4.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        FieldDecimalMaximumLengthArchetype fdm4 = new FieldDecimalMaximumLengthArchetype(17,4);
        fdm4.setFormat(fw4);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F600"));
        //02
        addFieldArchetype(IND_NAT_RET, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(DT_RET, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(VL_BC_RET, fdm4);
        //05
        addFieldArchetype(VL_RET, fdm);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(4);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(COD_REC, f06);
        //07
        FieldIntegerFixedLengthArchetype f07 = new FieldIntegerFixedLengthArchetype(1);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(IND_NAT_REC, f07);
        //08
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        //09
        addFieldArchetype(VL_RET_PIS, fdm);
        //10
        addFieldArchetype(VL_RET_COFINS, fdm);
        //11
        addFieldArchetype(IND_DEC, new FieldIntegerFixedLengthArchetype(1));

    }
}
