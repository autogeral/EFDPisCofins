package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD500 extends LineArchetype {

    //01 - Fixo
    public static String REG = "REG";
    //02
    /**Indicador do tipo de operação:
     * 0- Aquisição
     */
    public static String IND_OPER = "IND_OPER";
    //03
    /**Indicador do emitente do documento fiscal:
     * 0- Emissão Própria;
     * 1- Emissão por Terceiros
     */
    public static String IND_EMIT = "IND_EMIT";
    
    //04 - Código do participante (campo 02 do Registro 0150).
    public static String COD_PART = "COD_PART";
    
    //05 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
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
    public static String COD_MOD = "COD_MOD";
    
    //06 - Código da situação do documento fiscal, conforme a Tabela 4.1.2
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
    public static String COD_SIT = "COD_SIT";
    
    //07 - Série do documento fiscal
    public static String SER = "SER";
    
    //08 - Subsérie do documento fiscal
    public static String SUB = "SUB";
    
    //09 - Número do documento fiscal
    public static String NUM_DOC = "NUM_DOC";
    
    //10 - Data de referência/emissão dos documentos fiscais
    public static String DT_DOC = "DT_DOC";
    
    //11 - Data da aquisição ou da prestação do serviço
    public static String DT_A_P = "DT_A_P";
    
    //12 - Valor total do documento fiscal
    public static String VL_DOC = "VL_DOC";
    
    //13 - Valor total da prestação de serviço
    public static String VL_DESC = "VL_DESC";
    
    //14 - Valor da prestação de serviços
    public static String VL_SERV = "VL_SERV";
    
    //15 - Valor total da prestação dos serviços não-tributados pelo ICMS
    public static String VL_SERV_NT = "VL_SERV_NT";
    
    //16 - Valores cobrados em nome de terceiros   
    public static String VL_TERC = "VL_TERC";
    
    //17 - Valor de outras despesas indicadas no documento fiscal
    public static String VL_DA = "VL_DA";
    
    //18 - Valor da base de cálculo do ICMS
    public static String VL_BC_ICMS = "VL_BC_ICMS";
    
    //19 - Valor do ICMS
    public static String VL_ICMS = "VL_ICMS";
    
    //20 - Código da informação complementar (campo 02 do Registro 0450)
    public static String COD_INF = "COD_INF";
    
    //21 - Valor do PIS/PASEP
    public static String VL_PIS = "VL_PIS";
    
    //22 - Valor da COFINS
    public static String VL_COFINS = "VL_COFINS";

    public RegistroD500() {
        
        setName("Nota fiscal de serviço de comunicação (código 21) e nota fiscal de serviço de telecomunicação (código 22) - documentos de aquisição com direito a crédito");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
              
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D500"));
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
        FieldStringMaximumLengthArchetype f07 = new FieldStringMaximumLengthArchetype(4);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(SER, f07);
        //08
        FieldIntegerMaximumLengthArchetype f08 = new FieldIntegerMaximumLengthArchetype(3);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(SUB, f08);
        //09
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        //10
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //11
        addFieldArchetype(DT_A_P, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //12
        FieldDecimalMaximumLengthArchetype f12 = new FieldDecimalMaximumLengthArchetype(15,2);
        f12.setFormat(fw);
        addFieldArchetype(VL_DOC, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        addFieldArchetype(VL_SERV, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        f15.setNullableRepresentation("");
        f15.setFullFillingNullable(false);
        addFieldArchetype(VL_SERV_NT, f15);
        //16
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_TERC, f16);
        //17
        FieldDecimalMaximumLengthArchetype f17 = new FieldDecimalMaximumLengthArchetype(15,2);
        f17.setFormat(fw);
        f17.setNullableRepresentation("");
        f17.setFullFillingNullable(false);
        addFieldArchetype(VL_DA, f17);
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        f18.setNullableRepresentation("");
        f18.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS, f18);
        //19
        FieldDecimalMaximumLengthArchetype f19 = new FieldDecimalMaximumLengthArchetype(15,2);
        f19.setFormat(fw);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f19);
        //20
        FieldStringFixedLengthArchetype f20 = new FieldStringFixedLengthArchetype(6);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(COD_INF, f20);
        //21
        FieldDecimalMaximumLengthArchetype f21 = new FieldDecimalMaximumLengthArchetype(15,2);
        f21.setFormat(fw);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f21);
        //22
        FieldDecimalMaximumLengthArchetype f22 = new FieldDecimalMaximumLengthArchetype(15,2);
        f22.setFormat(fw);
        f22.setNullableRepresentation("");
        f22.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f22);
    }
}
