package br.com.jcomputacao.sped.efd.pisCofins.geracao;

import br.com.jcomputacao.sped.efd.pisCofins.ContratoEfdPisCofins;
import java.util.Date;

/**
 *
 * @author Jennifer
 */
public class ContratoEfdPisCofinsImpl implements ContratoEfdPisCofins{
    private Integer contratoCodigo;
    private ContratoTipo tipo = ContratoTipo.VENDA;
    private Date data;
    private Date vencimento;
    private double valor;
    private int diaPagamento;
    private int parcelas;
    private double valorEntrada;
    private double valorSaldo;

    public Integer getContratoCodigo() {
        return this.contratoCodigo;
    }

    public void setContratoCodigo(Integer contratoCodigo) {
        this.contratoCodigo = contratoCodigo;
    }

    public ContratoTipo getTipo() {
        return this.tipo;
    }

    public void setTipo(ContratoTipo tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getVencimento() {
        return this.vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDiaPagamento() {
        return this.diaPagamento;
    }

    public void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

    public int getParcelas() {
        return this.parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }
    
    public double getValorSaldo() {
        return valorSaldo;
    }
    
    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }
}
