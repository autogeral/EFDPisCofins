package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 09/11/2011 20:14:18
 * @author João Batista Rodrigues Porfirio
 */
public class RegistroC380 extends LineArchetype{

    //01 - Fixo
    public final static String REG = "REG";
    //02
    /**Código do modelo do documento fiscal, conforme a Tabela
     * 4.1.1 (Código 02 – Nota Fiscal de Venda a Consumidor)
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
    public final static String COD_MOD = "COD_MOD";
    //03 - Data de Emissão Inicial dos Documentos
    public final static String DT_DOC_INI = "DT_DOC_INI";
    //04 - Data de Emissão Final dos Documentos
    public final static String DT_DOC_FIN = "DT_DOC_FIN";
    //05 - Número do documento fiscal inicial
    public final static String NUM_DOC_INI = "NUM_DOC_INI";
    //06 - Número do documento fiscal final
    public final static String NUM_DOC_FIN = "NUM_DOC_FIN";
    //07 - Valor total dos documentos emitidos
    public final static String VL_DOC = "VL_DOC";
    //08 - Valor total dos documentos cancelados
    public final static String VL_DOC_CANC = "VL_DOC_CANC";
    
    public RegistroC380() {
        setName("Nota fiscal de venda a consumidor (código 02) - consolidação de documentos emitidos");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("C380"));
        //02
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        //03
        addFieldArchetype(DT_DOC_INI, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //04
        addFieldArchetype(DT_DOC_FIN, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //05
        FieldIntegerMaximumLengthArchetype f06 = new FieldIntegerMaximumLengthArchetype(6);
        f06.setNullableRepresentation("");
        f06.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC_INI, f06);
        FieldIntegerMaximumLengthArchetype f07 = new FieldIntegerMaximumLengthArchetype(6);
        f07.setNullableRepresentation("");
        f07.setFullFillingNullable(false);
        addFieldArchetype(NUM_DOC_FIN, f07);
        //08
        FieldDecimalMaximumLengthArchetype f08 = new FieldDecimalMaximumLengthArchetype(15,2);
        f08.setFormat(fw);
        addFieldArchetype(VL_DOC, f08);
        //09
        FieldDecimalMaximumLengthArchetype f09 = new FieldDecimalMaximumLengthArchetype(15,2);
        f09.setFormat(fw);
        addFieldArchetype(VL_DOC_CANC, f09);
    }    
}
