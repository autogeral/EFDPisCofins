package br.com.jcomputacao.sped.efd.pisCofins.geracao;

import br.com.jcomputacao.sped.efd.pisCofins.EmpresaEfdPisCofins;

/**
 * 17/11/2011 20:27:19
 * @author Murilo
 */
public class EmpresaEfdPisCofinsImpl implements EmpresaEfdPisCofins {
    private final String cnpj;
    private final String nome;
    private final int codigoMunicipio;
    private final String uf;

    public EmpresaEfdPisCofinsImpl(String cnpj, String nome, int codigoMunicipio, String uf) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.codigoMunicipio = codigoMunicipio;
        this.uf = uf;
    }

    public String getCNPJ() {
        return this.cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    public String getUf() {
        return this.uf;
    }
}
