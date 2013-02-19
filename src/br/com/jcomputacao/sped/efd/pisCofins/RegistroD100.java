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
public class RegistroD100 extends LineArchetype {

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
    public static String COD_SIT = "COD_SIT";
    //07 - Série do documento fiscal
    public static String SER = "SER";
    //08 - Subsérie do documento fiscal
    public static String SUB = "SUB";
    //09 - Número do documento fiscal
    public static String NUM_DOC = "NUM_DOC";
    //10 - Chave do Conhecimento de Transporte Eletrônico
    public static String CHV_CTE = "CHV_CTE";
    //11 - Data de referência/emissão dos documentos fiscais
    public static String DT_DOC = "DT_DOC";
    //12 - Data da aquisição ou da prestação do serviço
    public static String DT_A_P = "DT_A_P";
    //13 - Tipo de Conhecimento de Transporte Eletrônico conforme definido no Manual de Integração do CT-e
    public static String TP_CTe = "TP_CTe";
    //14
    /**Chave do CT-e de referência cujos valores foram
     * complementados (opção “1” do campo anterior) ou cujo
     * débito foi anulado (opção “2” do campo anterior)
     */
    public static String CHV_CTE_REF = "CHV_CTE_REF";
    //15 - Valor total do documento fiscal
    public static String VL_DOC = "VL_DOC";
    //16 - Valor total da prestação de serviço
    public static String VL_DESC = "VL_DESC";
     //17
    /**Indicador do tipo do frete:
     * 0- Por conta de terceiros
     * 1- Por conta do emitente
     * 2- Por conta do destinatário
     * 9- Sem cobrança de frete
     */
    /**Obs.: A partir de 01/07/2012 passará a ser:
     * Indicador do tipo do frete
     * 0- Por conta do emitente
     * 1- Por conta do destinatário/remetente
     * 2- Por conta de terceiros
     * 9- Sem cobrança de frete
     */
    public static String IND_FRT = "IND_FRT";
    //18 - Valor total da prestação de serviço
    public static String VL_SERV = "VL_SERV";
    //19 - Valor da base de cálculo do ICMS
    public static String VL_BC_ICMS = "VL_BC_ICMS";
    //20 - Valor do ICMS
    public static String VL_ICMS = "VL_ICMS";
    //21 - Valor não-tributado do ICMS
    public static String VL_NT = "VL_NT";
    //22 - Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
    public static String COD_INF = "COD_INF";
    //23 - Código da conta analítica contábil debitada/creditada
    public static String COD_CTA = "COD_CTA";

    public RegistroD100() {
        setName("Aquisição de serviçoes de transporte - nota fiscal de serviço de transporte (código 07) e conhecimentos de transporte rodoviário de cargas (código 08), conhecimento de transporte de cargas (código 08), conhecimento de transporte de cargas avulso (código 8B), aquaviário de cargas (código 09), aéreo (código 10), ferroviário de cargas (código 11), multimodal de cargas (código 26), nota fiscal de transporte ferroviário de carga (código 27) e conhecimento de transporte eletrônico - ct-e (código 57)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("D100"));
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
        FieldStringMaximumLengthArchetype f08 = new FieldStringMaximumLengthArchetype(3);
        f08.setNullableRepresentation("");
        f08.setFullFillingNullable(false);
        addFieldArchetype(SUB, f08);
        //09
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        //10
        FieldStringFixedLengthArchetype f10 = new FieldStringFixedLengthArchetype(44);
        f10.setNullableRepresentation("");
        f10.setFullFillingNullable(false);
        addFieldArchetype(CHV_CTE, f10);
        //11
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //12
        FieldDateFixedLengthArchetype f12 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(DT_A_P, f12);
        //13
        FieldIntegerFixedLengthArchetype f13 = new FieldIntegerFixedLengthArchetype(1);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(TP_CTe, f13);
        //14
        FieldStringFixedLengthArchetype f14 = new FieldStringFixedLengthArchetype(44);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(CHV_CTE_REF, f14);
        //15
        FieldDecimalMaximumLengthArchetype f15 = new FieldDecimalMaximumLengthArchetype(15,2);
        f15.setFormat(fw);
        addFieldArchetype(VL_DOC, f15);
        //06
        FieldDecimalMaximumLengthArchetype f16 = new FieldDecimalMaximumLengthArchetype(15,2);
        f16.setFormat(fw);
        f16.setNullableRepresentation("");
        f16.setFullFillingNullable(false);
        addFieldArchetype(VL_DESC, f16);
        //17
        addFieldArchetype(IND_FRT, new FieldStringFixedLengthArchetype(1));
        //18
        FieldDecimalMaximumLengthArchetype f18 = new FieldDecimalMaximumLengthArchetype(15,2);
        f18.setFormat(fw);
        addFieldArchetype(VL_SERV, f18);
        //19
        FieldDecimalMaximumLengthArchetype f19 = new FieldDecimalMaximumLengthArchetype(15,2);
        f19.setFormat(fw);
        f19.setNullableRepresentation("");
        f19.setFullFillingNullable(false);
        addFieldArchetype(VL_BC_ICMS, f19);
        //20
        FieldDecimalMaximumLengthArchetype f20 = new FieldDecimalMaximumLengthArchetype(15,2);
        f20.setFormat(fw);
        f20.setNullableRepresentation("");
        f20.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f20);
        //21
        FieldDecimalMaximumLengthArchetype f21 = new FieldDecimalMaximumLengthArchetype(15,2);
        f21.setFormat(fw);
        f21.setNullableRepresentation("");
        f21.setFullFillingNullable(false);
        addFieldArchetype(VL_NT, f21);
        //22
        FieldStringMaximumLengthArchetype f22 = new FieldStringMaximumLengthArchetype(6);
        f22.setNullableRepresentation("");
        f22.setFullFillingNullable(false);
        addFieldArchetype(COD_INF, f22);
        //23
        FieldStringMaximumLengthArchetype f23 = new FieldStringMaximumLengthArchetype(60);
        f23.setNullableRepresentation("");
        f23.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, f23);
    }
}
