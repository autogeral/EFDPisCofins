
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.sped.efd.pisCofins.geracao.ImovelStatus;

/**
 *
 * @author Jennifer
 */
public interface ImoveEfdlPisConfins {
    public int getImovelCodigo();
    public ImovelStatus getStatus();
    public Double getAreaTerreno();
    public String getDescricao();
}
