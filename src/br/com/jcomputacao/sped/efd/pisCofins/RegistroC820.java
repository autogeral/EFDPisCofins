package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Cesário
 */
public class RegistroC820 extends LineArchetype{
    //01 - Fixo 
    public static String REG = "REG";
    //02 - Código fiscal de operação e prestação
    public static String CFOP = "CFOP";
    //03 - Valor total dos itens
    public static String VL_ITEM = "VL_ITEM";
    //04 - Código do item (campo 02 do Registro 0200)
    public static String COD_ITEM = "COD_ITEM";
    //05 - Código da Situação Tributária referente ao PIS/PASEP
    public static String CST_PIS = "CST_PIS";
    //06 - Base de cálculo em quantidade - PIS/PASEP
    public static String QUANT_BC_PIS = "QUANT_BC_PIS";
    //07 - Alíquota do PIS/PASEP (em reais)
    public static String ALIQ_PIS_QUANT = "ALIQ_PIS_QUANT";
    //08 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    //09 - Código da Situação Tributária referente a COFINS
    public static String CST_COFINS = "CST_COFINS";
    //10 - Base de cálculo em quantidade – COFINS
    public static String QUANT_BC_COFINS = "QUANT_BC_COFINS";
    //11 - Alíquota da COFINS (em reais)
    public static String ALIQ_COFINS_QUANT = "ALIQ_COFINS_QUANT";
    //12 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";
    //13 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";
    
    public RegistroC820 (){
        setName("Detalhamento do cupom fiscal eletrônico (código 59) - Pis/Pasep e Cofins apurado por unidade de medida de produto");
        setDelimiter("|");
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C820"));
        //02
        
    }
}
