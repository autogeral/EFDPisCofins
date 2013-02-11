package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class RegistroF525 extends LineArchetype {
    
    //01 - Fixo
    public static String REG = "REG";
    //02 - Valor total da receita recebida, correspondente ao indicador informado no campo 03 (IND_REC)
    public static String VL_REC = "VL_REC";
    //03
    /**Indicador da composição da receita recebida no período (Campo 02), por:
     * 01- Clientes
     * 02- Administradora de cartão de débito/crédito
     * 03- Título de crédito - Duplicata, nota promissória, cheque, etc
     * 04- Documento fiscal
     * 05- Item vendido (produtos e serviços)
     * 99- Outros (Detalhar no campo 10 – Informação Complementar)
     */
    public static String IND_REC = "IND_REC";
    //04
    /**CNPJ/CPF do participante (cliente/pessoa física ou jurídica
     * pagadora) ou da administradora de cartões (vendas por
     * cartão de débito ou de crédito), no caso de detalhamento da
     * receita recebida conforme os indicadores “01” ou “02”, respectivamente
     */
    public static String CNPJ_CPF = "CNPJ_CPF";
    //05
    /**Número do título de crédito ou do documento fiscal, no
     * caso de detalhamento da receita recebida conforme os
     * indicadores “03” ou “04”, respectivamente
     */
    public static String NUM_DOC = "NUM_DOC";          
    //06
    /**Código do item (campo 02 do Registro 0200), no caso de
     * detalhamento da receita recebida por item vendido,
     * conforme o indicador “05”
     */
    public static String COD_ITEM = "COD_ITEM";
    //07
    /**Valor da receita detalhada, correspondente ao conteúdo
     * informado no campo 04, 05, 06 ou 10
     */
    public static String VL_REC_DET = "VL_REC_DET";
    //08 - Código da Situação Tributária do PIS/Pasep
    public static String CST_PIS = "CST_PIS";
    //09 - Código da Situação Tributária da Cofins
    public static String CST_COFINS = "CST_COFINS";
    //10 - Informação complementar
    public static String INFO_COMPL = "INFO_COMPL";
    //11 - Código da conta analítica contábil representativa da receita recebida
    public static String COD_CTA = "COD_CTA";
    
    public RegistroF525 (){
        setName("Composição da receira escriturada no período - detalhamento da receira recebida pelo regime de caixa");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("F525"));
        //02
        addFieldArchetype(VL_REC, fdm);
        //03
        addFieldArchetype(IND_REC, new FieldStringFixedLengthArchetype(2));
        //04
        FieldStringFixedLengthArchetype f04 = new FieldStringFixedLengthArchetype(14);
        f04.setNullableRepresentation("");
        f04.setFullFillingNullable(false);
        addFieldArchetype(CNPJ_CPF, f04);
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(60);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC, f05);
        //06
        FieldStringMaximumLengthArchetype f06 = new FieldStringMaximumLengthArchetype(60);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(COD_ITEM, f06);
        //07
        addFieldArchetype(VL_REC_DET, fdm);
        //08
        FieldIntegerFixedLengthArchetype f08 = new FieldIntegerFixedLengthArchetype(2);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(CST_PIS, f08);
        //09
        FieldIntegerFixedLengthArchetype f09 = new FieldIntegerFixedLengthArchetype(2);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CST_COFINS, f09);
        //10
        FieldStringMaximumLengthArchetype f10 = new FieldStringMaximumLengthArchetype(255);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(INFO_COMPL, f10);
        //11
        FieldStringMaximumLengthArchetype f11 = new FieldStringMaximumLengthArchetype(60);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f11);
    }
    
}
