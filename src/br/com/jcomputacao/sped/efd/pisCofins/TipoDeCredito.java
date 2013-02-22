package br.com.jcomputacao.sped.efd.pisCofins;

/**
 *
 * @author Jennifer
 */
public enum TipoDeCredito {
    
//CÓDIGOS VINCULADOS À RECEITA TRIBUTADA NO MERCADO INTERNO – Grupo 100
Credito_vinculado_a_receita_tributada_no_mercado_interno_Aliquota_Basica(101),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Aliquotas_Diferenciadas(102),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Aliquota_por_Unidade_de_Produto(103),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Estoque_de_Abertura(104),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Aquisição_Embalagens_para_revenda(105),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Presumido_da_Agroindustria(106),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Outros_Creditos_Presumidos(107),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Importacao(108),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Atividade_Imobiliaria(109),
Credito_vinculado_a_receita_tributada_no_mercado_interno_Outros(199),

//CÓDIGOS VINCULADOS À RECEITA NÃO TRIBUTADA NO MERCADO INTERNO – Grupo 200
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Aliquota_Basica(201),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Aliquotas_Diferenciadas(202),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Aliquota_por_Unidade_de_Produto(303),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Estoque_de_Abertura(204),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Aquisicao_de_Embalagens_para_revenda(205),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Presumido_da_Agroindustria(206),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Outros_Creditos_Presumidos(207),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Importacao(208),
Credito_vinculado_a_receita_nao_tributada_no_mercado_interno_Outros(299),

//CÓDIGOS VINCULADOS À RECEITA DE EXPORTAÇÃO – Grupo 300
Credito_vinculado_a_receita_de_exportacao_Aliquota_Basica(301),
Credito_vinculado_a_receita_de_exportacao_Aliquotas_Diferenciadas(302),
Credito_vinculado_a_receita_de_exportacao_Aliquota_por_Unidade_de_Produto(303),
Credito_vinculado_a_receita_de_exportacao_Estoque_de_Abertura(304),
Credito_vinculado_a_receita_de_exportacao_Aquisicao_de_Embalagens_para_revenda(305),
Credito_vinculado_a_receita_de_exportacao_Presumido_da_Agroindustria(306),
Credito_vinculado_a_receita_de_exportacao_Outros_Creditos_Presumidos(307),
Credito_vinculado_a_receita_de_exportacao_Importacao(308),
Credito_vinculado_a_receita_de_exportacao_Outros(399); 
    
   private int codigo;

    private TipoDeCredito(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    } 
}
