package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.sped.efd.pisCofins.geracao.ContratoTipo;
import java.util.Date;

/**
 *
 * @author Jennifer
 */
public interface ContratoEfdPisCofins {
    public Integer getContratoCodigo();
    public ContratoTipo getTipo();
    public Date getData();
    public Date getVencimento();
    public double getValor();
    public int getDiaPagamento();
    public int getParcelas();
    public double getValorEntrada();
    public double getValorSaldo();
}
