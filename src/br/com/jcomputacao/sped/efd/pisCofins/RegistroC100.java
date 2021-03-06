package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 20:06:07
 * @author rafael.galvao
 */
public class RegistroC100 extends LineArchetype {
    
    //01 - Fixo
    public static final String REG = "REG";
    //02
    /**Indicador do tipo de operação: 
     * 0 - Entrada
     * 1 - Saída
     */
    public static final String IND_OPER = "IND_OPER";
    //03
    /**Indicador do emitente do documento fiscal: 
     * 0 - Emissão própria
     * 1 - Terceiros
     */
    public static final String IND_EMIT = "IND_EMIT";
    //04
    /**Código do participante (campo 02 do Registro 0150): 
     * - do emitente do documento ou do remetente das mercadorias, no caso de entradas; 
     * - do adquirente, no caso de saídas
     */
    public static final String COD_PART = "COD_PART";
    //05
    /**Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    /**
    * Tabela 4.1.1
    * <table>
    * <tr><th colspan="2">4.1.2- Tabela Situacao do Documento</th></tr>
    * <tr><th>Codigo</th><th>Descricao</th></tr>
    * <tr><td>1</td><td>Nota Fiscal</td></tr>
    * <tr><td>1B</td><td>Nota Fiscal Avulsa</td></tr>
    * <tr><td>2</td><td>Nota Fiscal de Venda a Consumidor</td></tr>
    * <tr><td>2D</td><td>Cupom Fiscal</td></tr>
    * <tr><td>2E</td><td>Cupom Fiscal Bilhete de Passagem</td></tr>
    * <tr><td>4</td><td>Nota Fiscal de Produtor</td></tr>
    * <tr><td>6</td><td>Nota Fiscal/Conta de Energia Eletrica</td></tr>
    * <tr><td>7</td><td>Nota Fiscal de Servico de Transporte</td></tr>
    * <tr><td>8</td><td>Conhecimento de Transporte Rodoviario de Cargas</td></tr>
    * <tr><td>8B</td><td>Conhecimento de Transporte de Cargas Avulso</td></tr>
    * <tr><td>9</td><td>Conhecimento de Transporte Aquaviario de Cargas</td></tr>
    * <tr><td>10</td><td>Conhecimento Aereo</td></tr>
    * <tr><td>11</td><td>Conhecimento de Transporte Ferroviario de Cargas</td></tr>
    * <tr><td>13</td><td>Bilhete de Passagem Rodoviario</td></tr>
    * <tr><td>14</td><td>Bilhete de Passagem Aquaviario</td></tr>
    * <tr><td>15</td><td>Bilhete de Passagem e Nota de Bagagem</td></tr>
    * <tr><td>17</td><td>Despacho de Transporte</td></tr>
    * <tr><td>16</td><td>Bilhete de Passagem Ferroviario</td></tr>
    * <tr><td>18</td><td>Resumo de Movimento Diario</td></tr>
    * <tr><td>20</td><td>Ordem de Coleta de Cargas</td></tr>
    * <tr><td>21</td><td>Nota Fiscal de Servico de Comunicacao</td></tr>
    * <tr><td>22</td><td>Nota Fiscal de Servico de Telecomunicacao</td></tr>
    * <tr><td>23</td><td>GNRE</td></tr>
    * <tr><td>24</td><td>Autorizacao de Carregamento e Transporte</td></tr>
    * <tr><td>25</td><td>Manifesto de Carga</td></tr>
    * <tr><td>26</td><td>Conhecimento de Transporte Multimodal de Cargas</td></tr>
    * <tr><td>27</td><td>Nota Fiscal De Transporte Ferroviario De Carga</td></tr>
    * <tr><td>28</td><td>Nota Fiscal/Conta de Fornecimento de Gas Canalizado</td></tr>
    * <tr><td>29</td><td>Nota Fiscal/Conta De Fornecimento D'agua Canalizada</td></tr>
    * <tr><td>55</td><td>Nota Fiscal Eletronica</td></tr>
    * <tr><td>57</td><td>Conhecimento de Transporte Eletronico - CT-e</td></tr>
    * <tr><td>59</td><td>Cupom Fiscal Eletronico - CF-e</td></tr>
    * </table>
    */
    public static final String COD_MOD = "COD_MOD";
    //06
    /**Código da situação do documento fiscal, conforme a Tabela 4.1.2
     */
    /**
     * Tabela 4.1.2
     * <table>
     * <tr><th colspan="2">4.1.2- Tabela Situacao do Documento</th></tr>
     * <tr><th>Codigo</th><th>Descricao</th></tr>
     * <tr><td>00</td><td>Documento regular</td></tr>
     * <tr><td>01</td><td>Documento regular extemporaneo</td></tr>
     * <tr><td>02</td><td>Documento cancelado</td></tr>
     * <tr><td>03</td><td>Documento cancelado extemporaneo</td></tr>
     * <tr><td>04</td><td>NFe denegada</td></tr>
     * <tr><td>05</td><td>Nfe Numeracao inutilizada</td></tr
     * <tr><td>06</td><td>Documento Fiscal Complementar</td></tr>
     * <tr><td>07</td><td>Documento Fiscal Complementar extemporaneo.</td></tr>
     * <tr><td>08</td><td>Documento Fiscal emitido com base em Regime Especial ou Norma Especifica</td></tr>
     * </table>
     */
    public static final String COD_SIT = "COD_SIT";
    //07 - Série do documento fiscal
    public static final String SER = "SER";
    //08 - Número do documento fiscal
    public static final String NUM_DOC = "NUM_DOC";
    //09 - Chave da Nota Fiscal Eletrônica
    public static final String CHV_NFE = "CHV_NFE";
    //10 - Data da emissão do documento fiscal
    public static final String DT_DOC = "DT_DOC";
    //11 - Data da entrada ou da saída
    public static final String DT_E_S = "DT_E_S";
    //12 - Valor total do documento fiscal
    public static final String VL_DOC = "VL_DOC";
    //13
    /**Indicador do tipo de pagamento: 
     * 0 - À vista
     * 1 - A prazo
     * 9 - Sem pagamento
     */
    public static final String IND_PGTO = "IND_PGTO";
    //14 - Valor total do desconto
    public static final String VL_DESC = "VL_DESC";
    //15 - Abatimento não tributado e não comercial
    public static final String VL_ABAT_NT = "VL_ABAT_NT";
    //16 - Valor total das mercadorias e serviços
    public static final String VL_MERC = "VL_MERC";
    //17
    /**Indicador do tipo do frete: 
     * 0 - Por conta de terceiros
     * 1 - Por conta do emitente
     * 2 - Por conta do destinatário
     * 9 - Sem cobrança de frete
     */
    public static final String IND_FRT = "IND_FRT";
    //18 - Valor do frete indicado no documento fiscal
    public static final String VL_FRT = "VL_FRT";
    //19 - Valor do seguro indicado no documento fiscal
    public static final String VL_SEG = "VL_SEG";
    //20 - Valor de outras despesas acessórias
    public static final String VL_OUT_DA = "VL_OUT_DA";
    //21 - Valor da base de cálculo do ICMS
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    //22 - Valor do ICMS
    public static final String VL_ICMS = "VL_ICMS";
    //23 - Valor da base de cálculo do ICMS substituição tributária
    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    //24 - Valor do ICMS retido por substituição tributária
    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    //25 - Valor total do IPI
    public static final String VL_IPI = "VL_IPI";
    //26 - Valor total do PIS
    public static final String VL_PIS = "VL_PIS";
    //27 - Valor total da COFINS
    public static final String VL_COFINS = "VL_COFINS";
    //28 - Valor total do PIS retido por substituição tributária
    public static final String VL_PIS_ST = "VL_PIS_ST";
    //29 - Valor total da COFINS retido por substituição tributária
    public static final String VL_COFINS_ST = "VL_COFINS_ST";

    public RegistroC100() {
        setName("Nota Fiscal (Codigo 01), Nota fiscal Avulsa (Código 1B), Nota Fiscal de Produtos (Código 04) e NF-e (Código 55)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdf = new FieldDecimalMaximumLengthArchetype(15,2);
        fdf.setNullableRepresentation("");
        fdf.setFullFillingNullable(false);
        fdf.setFormat(fw);
        FieldDecimalMaximumLengthArchetype fdf2 = new FieldDecimalMaximumLengthArchetype(15,2);
        fdf2.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C100"));
        //02
        addFieldArchetype(IND_OPER, new FieldStringFixedLengthArchetype(1));
        //03
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        //04
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //05
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //06
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        //07
        FieldStringFixedLengthArchetype f03 = new FieldStringFixedLengthArchetype(3);
        f03.setNullableRepresentation("");
        f03.setFullFillingNullable(false);
        addFieldArchetype(SER, f03);
        //08
        addFieldArchetype(NUM_DOC, new FieldIntegerFixedLengthArchetype(9));
        //09
        FieldStringFixedLengthArchetype f09 = new FieldStringFixedLengthArchetype(44);
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(CHV_NFE, f09);
        //10
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //11
        FieldDateFixedLengthArchetype f11 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(DT_E_S, f11);
        //12
        addFieldArchetype(VL_DOC, fdf2);
        //13
        addFieldArchetype(IND_PGTO, new FieldStringFixedLengthArchetype(1));
        //14
        addFieldArchetype(VL_DESC, fdf);
        //15
        addFieldArchetype(VL_ABAT_NT, fdf);
        //16
        addFieldArchetype(VL_MERC, fdf);
        //17
        addFieldArchetype(IND_FRT, new FieldStringFixedLengthArchetype(1));
        //18
        addFieldArchetype(VL_FRT, fdf);
        //19
        addFieldArchetype(VL_SEG, fdf);
        //20
        addFieldArchetype(VL_OUT_DA, fdf);
        //21
        addFieldArchetype(VL_BC_ICMS, fdf);
        //22
        addFieldArchetype(VL_ICMS, fdf);
        //23
        addFieldArchetype(VL_BC_ICMS_ST, fdf);
        //24
        addFieldArchetype(VL_ICMS_ST, fdf);
        //25
        addFieldArchetype(VL_IPI, fdf);
        //26
        addFieldArchetype(VL_PIS, fdf);
        //27
        addFieldArchetype(VL_COFINS, fdf);
        //28
        addFieldArchetype(VL_PIS_ST, fdf);
        //29
        addFieldArchetype(VL_COFINS_ST, fdf);
    }
}
