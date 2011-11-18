package br.com.jcomputacao.sped.efd.pisCofins;

/**
 * Tabela 4.3.4 em http://www1.receita.fazenda.gov.br/sistemas/efd-pis-cofins/tabela-codigos/tabelas-de-codigos.htm
 * 17/11/2011 22:03:53
 * @author Murilo
 */
public enum SituacaoTributariaCofins {
    
    Operacao_tributavel_Base_de_Calculo_Valor_da_Operacao_Aliquota_Normal_Cumulativo_Nao_cumulativo(1),
    Operacao_tributavel_Base_de_Calculo_Valor_da_Operacao_Aliquota_Diferenciada(2),
    Operacao_tributavel_Base_de_Calculo_Quantidade_Vendida_x_Aliquota_por_Unidade_de_Produto(3),
    Operacao_tributavel_Tributacao_Monofasica_Aliquota_Zero(4),
    Operacao_tributavel_Aliquota_Zero(6),
    Operacao_isenta_da_contribuicao(7),
    Operacao_sem_incidencia_da_contribuicao(8),
    Operacao_com_suspensao_da_constribuicao(9),
    Outras_operacoes_de_saida(49),
    Operacao_com_direito_a_credito_Vinculada_Exclusivamente_a_receita_tributada_no_mercado_interno(50),
    Operacao_com_direito_a_credito_Vinculada_Exclusivamente_a_receita_nao_tributaa_no_mercado_interno(51),
    Operacao_com_direito_a_credito_Vinculada_Exclusivamente_vinculada_exclusivamente_a_receita_de_exportacao(52),
    Operacao_com_direito_a_credito_Vinculada_a_Receitas_tributadas_e_nao_tributadas_no_mercado_interno(53),
    Operacao_com_direito_a_credito_Vinculada_a_Receitas_tributadasno_mercado_interno_e_de_exportacao(54),
    Operacao_com_direito_a_credito_Vinculada_a_Receitas_nao_tributadas_no_mercado_interno_e_de_exportacao(55),
    Operacao_com_direito_a_credito_Vinculada_a_Receitas_tributadas_e_nao_tributadas_no_meracdo_interno_e_de_exportacao(56),
    Credito_presumido_Operacao_de_aquisicao_vinculada_exclusivamente_a_receita_tributada_no_mercado_interno(60),
    Credito_presumido_Operacao_de_aquisicao_vinculada_exclusivamente_a_receita_nao_tributada_no_mercado_interno(61),
    Credito_presumido_Operacao_de_aquisicao_vinculada_exclusivamente_a_receita_de_exportacao(62),
    Credito_presumido_Operacao_de_aquisicao_vinculada_a_receitas_tributadas_e_nao_tributadas_no_mercado_interno(63),
    Credito_presumido_Operacao_de_aquisicao_vinculada_a_receitas_tributadas_no_mercado_interno_e_de_exportacao(64),
    Credito_presumido_Operacao_de_aquisicao_vinculada_a_receitas_nao_tributadas_no_mercado_interno_e_de_exportacao(65),
    Credito_presumido_Operacao_de_aquisicao_vinculada_a_receitas_tributadas_e_nao_tributadas_no_mercado_interno_e_de_exportacao(66),
    Credito_presumido_Outras_operacoes(67),
    Operacao_de_aquisicao_sem_direito_a_credito(70),
    Operacao_de_aquisicao_com_isencao(71),
    Operacao_de_aquisicao_com_suspensao(72),
    Operacao_de_aquisicao_e_aliquota_zero(73),
    Operacao_de_aquisicao_sem_a_incidencia_da_contribuicao(74),
    Operacao_de_aquisicao_por_substituicao_tributaria(75),
    Outras_operacoes_de_entrada(98),
    Outras_operacoes(99);
    
    
    private int codigo;

    private SituacaoTributariaCofins(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
