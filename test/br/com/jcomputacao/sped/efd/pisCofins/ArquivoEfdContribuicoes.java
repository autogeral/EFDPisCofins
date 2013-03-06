package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.junit.BeforeClass;

/**
 *
 * @author Jennifer
 */
public class ArquivoEfdContribuicoes {
    
    @BeforeClass
    public static void preparaAmbiente() {
        System.getProperties().put("sgbd", "mysql");
        System.getProperties().put("desktop", "true");
        System.getProperties().put("host", "localhost");
        System.getProperties().put("user", "root");
        System.getProperties().put("schema", "convivere");
        System.getProperties().put("password", "root");
        System.getProperties().put("database", "convivere");
    }
    
    //Empresa cuja escrituração é feita
    private final EmpresaEfdPisCofins empresa;
    
    ArrayList <ContabilistaEfdPisCofins> contabilistas = new ArrayList<ContabilistaEfdPisCofins>();
    ArrayList <ContratoEfdPisCofins> contratos = new ArrayList<ContratoEfdPisCofins>();
    ArrayList<ImoveEfdlPisConfins> imoveis = new ArrayList<ImoveEfdlPisConfins>();
    ArrayList<ContratoImovelEfdPisCofins> contratosImoveis = new ArrayList<ContratoImovelEfdPisCofins>();
    
    ImoveEfdlPisConfins imovel;
    
    //Período de apuraçaão
    private final Date inicio;
    private final Date fim;
    
    //Alíquotas
    double aliquotaPis    = 0.65;
    double aliquotaCofins = 3.00;
    
    //Receita bruta
    private double receitaBruta = 0;
    
    //Contadores
    int registro0=0;
    int registroA=0;
    int registroC=0;
    int registroD=0;
    int registroF=0;
    int registroI=0;
    int registroM=0;
    int registroP=0;
    int registro1=0;
    int registro9=0;
    
    //Relação entre o registro e o número de vezes que ele aparece
    private Map<String, Integer> contador = new TreeMap<String, Integer>();
    
    //Relação entre um imóvel (se dá pelo código) e o objeto Imóvel
    private Map<Integer, ImoveEfdlPisConfins> objContratoImovel = new TreeMap<Integer, ImoveEfdlPisConfins>();
    
    public ArquivoEfdContribuicoes(EmpresaEfdPisCofins empresa, Date inicio, Date fim){
        this.empresa = empresa;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    //Contadores responsáveis pelo aquivo
    public void addContator (ContabilistaEfdPisCofins contabilista) throws EfdPisCofinsException{
        
        if (contabilista.getNome() == null)
            throw new EfdPisCofinsException("Contabilista sem nome");
        
        if (contabilista.getCpf() == 0)
            throw new EfdPisCofinsException("Contabilista sem CPF");
        
        if (contabilista.getCrc() == null)
            throw new EfdPisCofinsException("Contabilista sem inscrição no Conselho Regional de Contabilidade");
        
        contabilistas.add(contabilista);
    }
    //Contratos a serem escriturados
    public void addContrato (ContratoEfdPisCofins contrato){
        contratos.add(contrato);
    }
    
    //Imóveis a serem escriturados
    public void addImovel (ImoveEfdlPisConfins imovel){
        imoveis.add(imovel);
    }
    //Relação entre contratos e imóveis
    public void addContratoImovel (ContratoImovelEfdPisCofins contratoImovel){
        contratosImoveis.add(contratoImovel);
    }

    public void criaBloco1(StringBuilder sb) {
        sb.append(criaRegistro1001());
        sb.append(criaRegistro1990());
    }

    public void criaBloco9(StringBuilder sb) {
        sb.append(criaRegistro9001());
        
        //Considerando que estes registros são encontrados no final do arquivo e que são necessários no Registro 9900
        //para serem contabilizados, são adicionados antecipadamente
        adicionar ("9900");
        adicionar ("9990");
        adicionar ("9999");
        
        for(String key:contador.keySet()) {
            Integer registros = contador.get(key);
             sb.append(criaRegistro9900(key, registros));
        }
        sb.append(criaRegistro9990());
        sb.append(criaRegistro9999());
    }

    public void criaBlocoM(StringBuilder sb) {
        sb.append(criaRegistroM001());
        sb.append(criaRegistroM990());
    }

    public void criaBlocoP(StringBuilder sb) {
        sb.append(criaRegistroP001());
        sb.append(criaRegistroP990());
    }
    
    //Para cada contrato relaciona a um imóvel
    public void setObjImovelContrato (ContratoImovelEfdPisCofins contratoImovel){
        for (int i = 0; i<contratos.size(); i++){
           for (int j = 0; j<imoveis.size(); j++){
               if (contratos.get(i).getContratoCodigo().intValue() == contratoImovel.getContratoCodigo()
                       && imoveis.get(j).getImovelCodigo() == contratoImovel.getImovelCodigo()){
                   objContratoImovel.put(i, imoveis.get(j));
                   break;
               }
           }        
        }
    }
    

    public void criaBloco0(StringBuilder sb) {
        sb.append(criaRegistro0000());
        sb.append(criaRegistro0001()); 
        for (int i = 0; i<contabilistas.size(); i++){
            sb.append(criaRegistro0100(contabilistas.get(i)));
        }
        sb.append(criaRegistro0110());
        sb.append(criaRegistro0140());
        sb.append(criaRegistro0990());
    }

    public void criaBlocoA(StringBuilder sb) {
        sb.append(criaRegistroA001());
        sb.append(criaRegistroA990());
    }

    public void criaBlocoC(StringBuilder sb) {
        sb.append(criaRegistroC001());
        sb.append(criaRegistroC990());
    }

    public void criaBlocoD(StringBuilder sb) {
        sb.append(criaRegistroD001());
        sb.append(criaRegistroD990());
    }

    public void criaBlocoF(StringBuilder sb) throws ParseException {
        for (int i = 0; i<contratosImoveis.size(); i++){
            setObjImovelContrato(contratosImoveis.get(i));
        }
        sb.append(criaRegistroF001());
        sb.append(criaRegistroF010());
        for (int i=0; i<contratos.size(); i++){
            if(objContratoImovel.containsKey(i)){
                imovel = objContratoImovel.get(i);
                sb.append(criaRegistroF200(contratos.get(i), imovel));
            }
        }
        sb.append(criaRegistroF990());
    }
    
    //Método que adiciona uma relação entre um registro e a quantidade de vezes que ele aparece
    //Utilizado no Registro 9900
     private void adicionar(String registro) {
        if(contador.containsKey(registro)) {
            
            Integer valor = this.contador.get(registro);
            valor++;
            this.contador.put(registro, valor);
        } else {
            this.contador.put(registro, 1);
        }
    }
    
     //Criação dos blocos
    public StringBuilder getRepresentation() throws ParseException {
        StringBuilder sb = new StringBuilder();
        
        criaBloco0(sb);
        criaBlocoA(sb);
        criaBlocoC(sb);
        criaBlocoD(sb);
        criaBlocoF(sb);
        criaBlocoM(sb);
        criaBlocoP(sb);
        criaBloco1(sb);
        criaBloco9(sb);
        
        return sb.append("\n");
    }
    
    //REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA PESSOA JURÍDICA
    private StringBuffer criaRegistro0000() {
         
        Registro0000 r = new Registro0000();
        LineModel line = r.createModel();
        
        
        //Versão do leiaute
        line.setFieldValue(Registro0000.COD_VER, 003);
        //Tipo de escrituração
        line.setFieldValue(Registro0000.TIPO_ESCRIT, 0);
        //Indicador de situação especial
        line.setFieldValue(Registro0000.IND_SIT_ESP, null);
        //Nº do recibo da escrituração anterior
        if (line.getFieldValueNumber(Registro0000.TIPO_ESCRIT).intValue()==1)
            /**Teste!
             * Verificar onde o número do recebimento da escrituração anterior será armazenado
             */
             line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, "");
        else
             line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, null); 
        line.setFieldValue(Registro0000.DT_INI, inicio);
        line.setFieldValue(Registro0000.DT_FIN, fim);
        line.setFieldValue(Registro0000.NOME, empresa.getNome());
        line.setFieldValue(Registro0000.CNPJ, empresa.getCNPJ());
        line.setFieldValue(Registro0000.UF, empresa.getUf());
        line.setFieldValue(Registro0000.COD_MUN, empresa.getCodigoMunicipio());
        line.setFieldValue(Registro0000.SUFRAMA, null);
        line.setFieldValue(Registro0000.IND_NAT_PJ, 00);
        line.setFieldValue(Registro0000.IND_ATIV, 4);
        
        StringBuffer sb = line.getRepresentation();
        registro0++;
        adicionar("0000");
        return sb.append("\n");
    }
    //REGISTRO 0001: ABERTURA DO BLOCO 0
    private StringBuffer criaRegistro0001() {
        //Restistro ocorre uma única vez
        Registro0001 reg = new Registro0001();
        LineModel line = reg.createModel();
        
        /* 
         * 0 - Bloco com dados informados;
         * 1 – Bloco sem dados informados.
         */
        line.setFieldValue(Registro0001.IND_MOV, 0);
        
        StringBuffer sb = line.getRepresentation();
        registro0++;
        adicionar("0001");
        return sb.append("\n");
    }
    //REGISTRO 0100: DADOS DO CONTABILISTA
    private StringBuffer criaRegistro0100(ContabilistaEfdPisCofins contabilista){
        
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(Registro0100.NOME, contabilista.getNome());
        //03
        line.setFieldValue(Registro0100.CPF, contabilista.getCpf());
        //04
        line.setFieldValue(Registro0100.CRC, contabilista.getCrc());
        //05
        if (contabilista.getCnpj()==0)
            line.setFieldValue(Registro0100.CNPJ, null);
        else
            line.setFieldValue(Registro0100.CNPJ, contabilista.getCnpj());
        //06
        line.setFieldValue(Registro0100.CEP, contabilista.getCep());
        //07
        line.setFieldValue(Registro0100.END, contabilista.getEndereco());
        //08
        line.setFieldValue(Registro0100.NUM, contabilista.getNumero());
        //09
        line.setFieldValue(Registro0100.COMPL, contabilista.getComplemento());
        //10
        line.setFieldValue(Registro0100.BAIRRO, contabilista.getBairro());
        //11
        line.setFieldValue(Registro0100.FONE, contabilista.getTelefone());
        //12
        line.setFieldValue(Registro0100.FAX, contabilista.getFax());
        //13
        line.setFieldValue(Registro0100.EMAIL, contabilista.getEmail());
        //14
        line.setFieldValue(Registro0100.COD_MUN, contabilista.getCodigoMunicipio());

        StringBuffer sb = line.getRepresentation();
        registro0++;
        adicionar("0100");
        return sb.append("\n");
    }
    //REGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO
    private StringBuffer criaRegistro0110() {
        //Restistro ocorre uma única vez
        Registro0110 reg = new Registro0110();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(Registro0110.COD_INC_TRIB, 2);
        //03
        line.setFieldValue(Registro0110.IND_APRO_CRED, null);
        //04
        line.setFieldValue(Registro0110.COD_TIPO_CONT, 1);
        //05
        line.setFieldValue(Registro0110.IND_REG_CUM, 1);
        
        StringBuffer sb = line.getRepresentation();
        registro0++;
        adicionar("0110");
        return sb.append("\n");
    }
    //REGISTRO 0140: TABELA DE CADASTRO DE ESTABELECIMENTO
    private StringBuffer criaRegistro0140(){
        Registro0140 reg = new Registro0140();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0140.COD_EST, null);
        //03
        line.setFieldValue(Registro0140.NOME, empresa.getNome());
        //04
        line.setFieldValue(Registro0140.CNPJ, empresa.getCNPJ());
        //05
        line.setFieldValue(Registro0140.UF, empresa.getUf());
        //06
        /**
         * VERIFICAR A EXISTÊNCIA DESTA IMPORMAÇÃO NO BANCO
         */
        line.setFieldValue(Registro0140.IE, null);
        //07
        line.setFieldValue(Registro0140.COD_MUN, empresa.getCodigoMunicipio());
        //08
        /**
         * VERIFICAR A EXISTÊNCIA DESTA IMPORMAÇÃO NO BANCO
         */
        line.setFieldValue(Registro0140.IM, null);
        //09
        line.setFieldValue(Registro0140.SUFRAMA, null);

        StringBuffer sb = line.getRepresentation();
        registro0++;
        adicionar("0140");
        return sb.append("\n");
    }
    //REGISTRO 0990: ENCERRAMENTO DO BLOCO 0
    private StringBuffer criaRegistro0990 (){
        Registro0990 reg = new Registro0990();
        LineModel line = reg.createModel();
        registro0++;
        //02
        line.setFieldValue(Registro0990.QTD_LIN_0, registro0);
        StringBuffer sb = line.getRepresentation();
        adicionar("0990");
        return sb.append("\n");
    }
    
    //REGISTRO A001: ABERTURA DO BLOCO A
    private StringBuffer criaRegistroA001(){
        RegistroA001 reg = new RegistroA001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroA001.IND_MOV, "1");
        
        StringBuffer sb = line.getRepresentation();
        registroA++;
        adicionar("A001");
        return sb.append("\n");
    }
    //REGISTRO A990: ENCERRAMENTO DO BLOCO A
    private StringBuffer criaRegistroA990(){
        RegistroA990 reg = new RegistroA990();
        LineModel line = reg.createModel();
        
        registroA++;
        //02
        line.setFieldValue(RegistroA990.QTD_LIN_A, registroA);
        
        StringBuffer sb = line.getRepresentation();
        adicionar("A990");
        return sb.append("\n");
    }
   
    //REGISTRO C001: ABERTURA DO BLOCO C
    private StringBuffer criaRegistroC001 (){
        RegistroC001 reg = new RegistroC001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC001.IND_MOV, "1");
        
        StringBuffer sb = line.getRepresentation();
        registroC++;
        adicionar("C001");
        return sb.append("\n");
    }
    //REGISTRO C990: ENCERRAMENTO DO BLOCO C
    private StringBuffer criaRegistroC990(){
        RegistroC990 reg = new RegistroC990();
        LineModel line = reg.createModel();
        registroC++;
        //02
        line.setFieldValue(RegistroC990.QTD_LIN_C, registroC);
    
        StringBuffer sb = line.getRepresentation();
        adicionar("C990");
        return sb.append("\n");
    }
    
    //REGISTRO D001: ABERTURA DO BLOCO D
    private StringBuffer criaRegistroD001(){
        RegistroD001 reg = new RegistroD001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD001.IND_MOV, "1");

        StringBuffer sb = line.getRepresentation();
        registroD++;
        adicionar("D001");
        return sb.append("\n");
    }
    //REGISTRO D990: ENCERRAMENTO DO BLOCO D
    private StringBuffer criaRegistroD990(){
        RegistroD990 reg = new RegistroD990();
        LineModel line = reg.createModel();

        registroD++;
        //02
        line.setFieldValue(RegistroD990.QTD_LIN_D, registroD);
    
        StringBuffer sb = line.getRepresentation();
        adicionar("D990");
        return sb.append("\n");
    }
    
    //REGISTRO F001: ABERTURA DO BLOCO F
    private StringBuffer criaRegistroF001(){
        RegistroF001 reg = new RegistroF001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
        registroF++;
        adicionar("F001");
        return sb.append("\n");
    }
    //REGISTRO F010: IDENTIFICAÇÃO DO ESTABELECIMENTO
    private StringBuffer criaRegistroF010(){
        RegistroF010 reg = new RegistroF010();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF010.CNPJ, empresa.getCNPJ());
        
        StringBuffer sb = line.getRepresentation();
        registroF++;
        adicionar("F010");
        return sb.append("\n");
    }
    //REGISTRO F200: OPERAÇÕES DA ATIVIDADE IMOBILIÁRIA - UNIDADE IMOBILIÁRIA VENDIDA
    
    private StringBuffer criaRegistroF200(ContratoEfdPisCofins contrato, ImoveEfdlPisConfins imovel) throws ParseException{
        RegistroF200 reg = new RegistroF200();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("24012013");
   
        double valorRecebido;
        
        //02
        line.setFieldValue(RegistroF200.IND_OPER, 02);
        //03
        line.setFieldValue(RegistroF200.UNID_IMOB, 02);
        //04
        line.setFieldValue(RegistroF200.IDENT_EMP, "CONVÍVIO DO SANTO");
        //05
        line.setFieldValue(RegistroF200.DESC_UNID_IMOB, imovel.getDescricao()+" - "+String.valueOf(imovel.getAreaTerreno()+"M2"));
        //06
        line.setFieldValue(RegistroF200.NUM_CONT, contrato.getContratoCodigo().toString());
        //07
        /**
         * Proveniente da tabela de Cadastros
         */
        line.setFieldValue(RegistroF200.CPF_CNPJ_ADQU, "10276553000125");
        //08
        line.setFieldValue(RegistroF200.DT_OPER, contrato.getData());
        //09
        /**Este valor dever ser reajustado - verificar a periodicidade e o percentual de reajuste
         */
        line.setFieldValue(RegistroF200.VL_TOT_VEND, contrato.getValor());
        //10
        /**Não creio q sejam somente para os contratos assinados no período, mas sim para os recebimentos no período apurado
         */
        line.setFieldValue(RegistroF200.VL_REC_ACUM, 0.00);
        //11
        valorRecebido = contrato.getValorEntrada();
        receitaBruta = receitaBruta + valorRecebido;
        line.setFieldValue(RegistroF200.VL_TOT_REC, valorRecebido);
        //12
        line.setFieldValue(RegistroF200.CST_PIS, 01);
        //13
        line.setFieldValue(RegistroF200.VL_BC_PIS, contrato.getValorEntrada());
        //14
        line.setFieldValue(RegistroF200.ALIQ_PIS, aliquotaPis);
        //15
        /**Não creio q sejam somente para os contratos assinados no período, mas sim para os recebimentos no período apurado
         */
        line.setFieldValue(RegistroF200.VL_PIS, aliquotaPis*contrato.getValorEntrada()/100);
        //16
        line.setFieldValue(RegistroF200.CST_COFINS, 01);
        //17
        /**
         * Creio que aqui entre o valor recebido no período/mês da escrituração
         */
        line.setFieldValue(RegistroF200.VL_BC_COFINS, contrato.getValorEntrada());
        //18
        line.setFieldValue(RegistroF200.ALIQ_COFINS, aliquotaCofins);
        //19
        /**Não creio q sejam somente para os contratos assinados no período, mas sim para os recebimentos no período apurado
         */
        line.setFieldValue(RegistroF200.VL_COFINS, aliquotaCofins*contrato.getValorEntrada()/100);
        //20
        /**Não creio q sejam somente para os contratos assinados no período, mas sim para os recebimentos no período apurado
         */
        line.setFieldValue(RegistroF200.PERC_REC_RECEB, (contrato.getValorEntrada()+0)/contrato.getValor()*100);
        //21
        line.setFieldValue(RegistroF200.IND_NAT_EMP, 3);
        //21
        line.setFieldValue(RegistroF200.INF_COMP, null);

        receitaBruta = 0;
        StringBuffer sb = line.getRepresentation();
        registroF++;
        adicionar("F200");
        return sb.append("\n");
    }
    
    //REGISTRO F990: ENCERRAMENTO DO BLOCO F
    private StringBuffer criaRegistroF990(){
        RegistroF990 reg = new RegistroF990();
        LineModel line = reg.createModel();
        
        registroF++;
        //02
        line.setFieldValue(RegistroF990.QTD_LIN_F, registroF);
        
        StringBuffer sb = line.getRepresentation();
        adicionar("F990");
        return sb.append("\n");
    }
    
    //REGISTRO M001: ABERTURA DO BLOCO M
    private StringBuffer criaRegistroM001(){
        RegistroM001 reg = new RegistroM001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM001.IND_MOV, "1");
            
        StringBuffer sb = line.getRepresentation();
        registroM++;
        adicionar("M001");
        return sb.append("\n");
    }
    
    //REGISTRO M990: ENCERRAMENTO DO BLOCO M
    private StringBuffer criaRegistroM990(){
        RegistroM990 reg = new RegistroM990();
        LineModel line = reg.createModel();
        
        registroM++;
        //02
        line.setFieldValue(RegistroM990.QTD_LIN_M, registroM);
        
        StringBuffer sb = line.getRepresentation();
        adicionar("M990");
        return sb.append("\n");
    }
    
    //REGISTRO P001: ABERTURA DO BLOCO P
    private StringBuffer criaRegistroP001(){
        RegistroP001 reg = new RegistroP001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroP001.IND_MOV, "1");
            
        StringBuffer sb = line.getRepresentation();
        registroP++;
        adicionar("P001");
        return sb.append("\n");
    }
    //REGISTRO P990: ENCERRAMENTO DO BLOCO P
    private StringBuffer criaRegistroP990(){
        RegistroP990 reg = new RegistroP990();
        LineModel line = reg.createModel();
        
        registroP++;
        //02
        line.setFieldValue(RegistroP990.QTD_LIN_P, registroP);
        
        StringBuffer sb = line.getRepresentation();
        adicionar("P990");
        return sb.append("\n");
    }
    //REGISTRO 1001: ABERTURA DO BLOCO 1
    private StringBuffer criaRegistro1001 (){
        Registro1001 reg = new Registro1001();
        LineModel line = reg.createModel();    
        
        //02
        line.setFieldValue(Registro1001.IND_MOV, 1);
        
        StringBuffer sb = line.getRepresentation();
        registro1++;
        adicionar("1001");
        return sb.append("\n");
    }
    //REGISTRO 1990: ENCERRAMENTO DO BLOCO 1
    private StringBuffer criaRegistro1990 (){
        Registro1990 reg = new Registro1990();
        LineModel line = reg.createModel();
        
        registro1++;
        //02
        line.setFieldValue(Registro1990.QTD_LIN_1, registro1);
        StringBuffer sb = line.getRepresentation();
        adicionar("1990");
        return sb.append("\n");
    }
    //REGISTRO 9001: ABERTURA DO BLOCO 9
    private StringBuffer criaRegistro9001 (){
        Registro9001 reg = new Registro9001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro9001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
        registro9++;
        adicionar("9001");
        return sb.append("\n");
    }
    //REGISTRO 9900: REGISTROS DO ARQUIVO
    private StringBuffer criaRegistro9900(String key, Integer registros){
               
        Registro9900 reg = new Registro9900();
        LineModel line = reg.createModel();
                
        registro9++;
                //02
                line.setFieldValue(Registro9900.REG_BLC, key);
                //03
                line.setFieldValue(Registro9900.QTD_REG_BLC, registros);

                StringBuffer sb = line.getRepresentation();
                
        return sb.append("\n");
    }
    
    //REGISTRO 9990: ENCERRAMENTO DO BLOCO 9
    private StringBuffer criaRegistro9990(){
        Registro9990 reg = new Registro9990();
        LineModel line = reg.createModel();
        
        registro9++;
        //02
        line.setFieldValue(Registro9990.QTD_LIN_9, registro9+1);

        StringBuffer sb = line.getRepresentation();
        return sb.append("\n");
    }
    
    //REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL
    private StringBuffer criaRegistro9999(){
        Registro9999 reg = new Registro9999();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue
        (Registro9999.QTD_LIN, registro0+registroA+registroC+registroD+registroF+registroI+registroM+registroP+registro1+registro9+1);
     
        StringBuffer sb = line.getRepresentation();
        
        return sb.append("\n");
    }
    
}
