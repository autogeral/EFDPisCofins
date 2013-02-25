
package br.com.jcomputacao.sped.efd.pisCofins.geracao;

import br.com.jcomputacao.sped.efd.pisCofins.ContratoImovelEfdPisCofins;
import java.util.Date;

/**
 *
 * @author Jennifer
 */
public class ContratoImovelEfdPisConfinsImpl implements ContratoImovelEfdPisCofins {
    private int contratoImovelCodigo;
    private int contratoCodigo;
    private int imovelCodigo;
    private Date cadastro;

    /**
     * @return the contratoImovelCodigo
     */
    @Override
    public int getContratoImovelCodigo() {
        return contratoImovelCodigo;
    }

    /**
     * @param contratoImovelCodigo the contratoImovelCodigo to set
     */
    public void setContratoImovelCodigo(int contratoImovelCodigo) {
        this.contratoImovelCodigo = contratoImovelCodigo;
    }

    /**
     * @return the contratoCodigo
     */
    @Override
    public int getContratoCodigo() {
        return contratoCodigo;
    }

    /**
     * @param contratoCodigo the contratoCodigo to set
     */
    public void setContratoCodigo(int contratoCodigo) {
        this.contratoCodigo = contratoCodigo;
    }

    /**
     * @return the imovelCodigo
     */
    @Override
    public int getImovelCodigo() {
        return imovelCodigo;
    }

    /**
     * @param imovelCodigo the imovelCodigo to set
     */
    public void setImovelCodigo(int imovelCodigo) {
        this.imovelCodigo = imovelCodigo;
    }

    /**
     * @return the cadastro
     */
    @Override
    public Date getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }
    
}
