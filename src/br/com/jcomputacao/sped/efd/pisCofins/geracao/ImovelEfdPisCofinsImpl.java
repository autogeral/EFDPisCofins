package br.com.jcomputacao.sped.efd.pisCofins.geracao;

import br.com.jcomputacao.sped.efd.pisCofins.ImoveEfdlPisConfins;

/**
 *
 * @author Jennifer
 */
public class ImovelEfdPisCofinsImpl implements ImoveEfdlPisConfins{
    private int imovelCodigo;
    private ImovelStatus status;
    private Double areaTerreno;
    private String descricao;

    public int getImovelCodigo() {
        return this.imovelCodigo;
    }

    public void setImovelCodigo(int imovelCodigo) {
        this.imovelCodigo = imovelCodigo;
    }

    public ImovelStatus getStatus() {
        return this.status;
    }

    public void setStatus(ImovelStatus status) {
        this.status = status;
    }

    public Double getAreaTerreno() {
        return this.areaTerreno;
    }

    public void setAreaTerreno(Double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
