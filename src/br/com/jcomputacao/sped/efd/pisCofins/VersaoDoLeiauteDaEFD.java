package br.com.jcomputacao.sped.efd.pisCofins;

/**
 * 3 - REFERÊNCIAS PARA O ARQUIVO DIGITAL 
 * 3.1 - VERSÃO DO LEIAUTE DA EFD
 * 3.1.1- Tabela Versão do Leiaute
 * @author Jennifer
 */
public enum VersaoDoLeiauteDaEFD {
    
        versao_1_00(001),
        versao_1_01(002),
        versao_2_00(002),
        versao_2_01A(003);

        private int codigo;

    private VersaoDoLeiauteDaEFD(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
