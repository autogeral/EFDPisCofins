package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2011 21:39:58
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC500 extends LineArchetype{

    //01 - Fixo    
    public final static String REG = "REG";
    //02 - Código do participante do fornecedor (campo 02 do Registro 0150).
    public final static String COD_PART = "COD_PART";
    //03 - Código do modelo do documento fiscal, conforme a Tabela 4.1.1
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
    public final static String COD_MOD = "COD_MOD";
    //04 - Código da situação do documento fiscal, conforme a Tabela 4.1.2
    public final static String COD_SIT = "COD_SIT";
    //05 - Série do documento fiscal
    public final static String SER = "SER";
    //06 - Subsérie do documento fiscal
    public final static String SUB = "SUB";
    //07 - Número do documento fiscal
    public final static String NUM_DOC = "NUM_DOC";
    //08 - Data da emissão do documento fiscal
    public final static String DT_DOC = "DT_DOC";
    //09 - Data da entrada
    public final static String DT_ENT = "DT_ENT";
    //10 - Valor total do documento fiscal
    public final static String VL_DOC = "VL_DOC";
    //11 - Valor acumulado do ICMS
    public final static String VL_ICMS = "VL_ICMS";
    //12 - Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
    public final static String COD_INF = "COD_INF";
    //13 - Valor do PIS/PASEP
    public final static String VL_PIS = "VL_PIS";
    //14 - Valor da COFINS
    public final static String VL_COFINS = "VL_COFINS";

    public RegistroC500() {
        setName("Nota fiscal/conta energia elétrica (código 06), nora fiscal/ conta de fornecimento d'água canalizada (código 29) e nota fiscal consumo fornecimento de gás (código 28) e NF-e (código 55) - documentos de entrada/aquisição com crédito");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C500"));
        //02
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //03
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //04
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        //05
        FieldStringMaximumLengthArchetype f05 = new FieldStringMaximumLengthArchetype(4);
        f05.setNullableRepresentation("");
        f05.setFullFillingNullable(false);
        addFieldArchetype(SER, f05);
        //06
        FieldIntegerMaximumLengthArchetype f06 = new FieldIntegerMaximumLengthArchetype(4);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(SUB, f06);
        //07
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        //08
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //09
        FieldDateFixedLengthArchetype f09 = new FieldDateFixedLengthArchetype("ddMMyyyy");
        f09.setNullableRepresentation("");
        f09.setFullFillingNullable(false);
        addFieldArchetype(DT_ENT, f09);
        //10
        FieldDecimalMaximumLengthArchetype f10 = new FieldDecimalMaximumLengthArchetype(15,2);
        f10.setFormat(fw);
        addFieldArchetype(VL_DOC, f10);
        //11
        FieldDecimalMaximumLengthArchetype f11 = new FieldDecimalMaximumLengthArchetype(15,2);
        f11.setFormat(fw);
        f11.setNullableRepresentation("");
        f11.setFullFillingNullable(false);
        addFieldArchetype(VL_ICMS, f11);
        //12
        FieldStringMaximumLengthArchetype f12 = new FieldStringMaximumLengthArchetype(6);
        f12.setNullableRepresentation("");
        f12.setFullFillingNullable(false);
        addFieldArchetype(COD_INF, f12);
        //13
        FieldDecimalMaximumLengthArchetype f13 = new FieldDecimalMaximumLengthArchetype(15,2);
        f13.setFormat(fw);
        f13.setNullableRepresentation("");
        f13.setFullFillingNullable(false);
        addFieldArchetype(VL_PIS, f13);
        //14
        FieldDecimalMaximumLengthArchetype f14 = new FieldDecimalMaximumLengthArchetype(15,2);
        f14.setFormat(fw);
        f14.setNullableRepresentation("");
        f14.setFullFillingNullable(false);
        addFieldArchetype(VL_COFINS, f14);
    }
}
