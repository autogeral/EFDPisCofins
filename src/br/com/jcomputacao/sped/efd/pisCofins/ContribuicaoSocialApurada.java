package br.com.jcomputacao.sped.efd.pisCofins;

/**
 * Site: http://www1.receita.fazenda.gov.br/sistemas/efd-contribuicoes/tabela-codigos/tabelas-de-codigos_PIS_Pasep_Cofins.htm
 * Tabela 4.3.5 - Tabela Código de Contribuição Social Apurada - Versão 1.0.0 
 * @author Jennifer
 */
public enum ContribuicaoSocialApurada {
    
Contribuicao_nao_cumulativa_apurada_a_aliquota_basica(1),
Contribuicao_nao_cumulativa_apurada_a_aliquotas_diferenciadas(2),
Contribuicao_nao_cumulativa_apurada_a_aliquota_por_unidade_de_medida_de_produto(3),
Contribuicao_nao_cumulativa_apurada_a_aliquota_basica_Atividade_Imobiliaria(4),
Contribuicao_apurada_por_substituicao_tributaria(31),
Contribuicao_apurada_por_substituicao_tributaria_Vendas_a_Zona_Franca_de_Manaus(32),
Contribuicao_cumulativa_apurada_a_aliquota_basica(51),
Contribuicao_cumulativa_apurada_a_aliquotas_diferenciadas(52),
Contribuicao_cumulativa_apurada_a_aliquota_por_unidade_de_medida_de_produto(53),
Contribuicao_cumulativa_apurada_a_aliquota_basica_Atividade_Imobiliaria(54),
Contribuicao_apurada_da_Atividade_Imobiliária_RET(70),
Contribuicao_apurada_de_SCP_Incidencia_nao_Cumulativa(71),
Contribuicao_apurada_de_SCP_Incidência_Cumulativa(72),
Contribuicao_para_o_PIS_Pasep_Folha_de_Salarios(99);

    private int codigo;

    private ContribuicaoSocialApurada(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
