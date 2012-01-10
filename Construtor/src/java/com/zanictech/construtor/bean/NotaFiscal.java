package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Anderson Zanichelli
 */
public class NotaFiscal extends BaseBean {

    private long nNumeroSerie;
    private Date dDataEmissao;
    private Date dDataEntrada;
    private long fkFormaPagamentoId;
    private BigDecimal mValorTotalItens;
    private BigDecimal mDespesasAcessorios;
    private BigDecimal mFreteFornecedor;
    
    private FormaPagamento formaPagamento;

    public NotaFiscal() {
    }

    public NotaFiscal(long nNumeroSerie, Date dDataEmissao, Date dDataEntrada, BigDecimal mValorTotalItens, BigDecimal mDespesasAcessorios, BigDecimal mFreteFornecedor, FormaPagamento formaPagamento) {
        this.nNumeroSerie = nNumeroSerie;
        this.dDataEmissao = dDataEmissao;
        this.dDataEntrada = dDataEntrada;
        this.fkFormaPagamentoId = formaPagamento.getId();
        this.mValorTotalItens = mValorTotalItens;
        this.mDespesasAcessorios = mDespesasAcessorios;
        this.mFreteFornecedor = mFreteFornecedor;
        this.formaPagamento = formaPagamento;
    }
    
    public NotaFiscal(ResultSet rs) throws SQLException {
        this.nNumeroSerie = rs.getLong("nNumeroSerie");
        this.dDataEmissao = rs.getDate("dDataEmissao");
        this.dDataEntrada = rs.getDate("dDataEntrada");
        this.fkFormaPagamentoId = rs.getLong("fkFormaPagamentoId");
        this.mValorTotalItens = rs.getBigDecimal("mValorTotalItens");
        this.mDespesasAcessorios = rs.getBigDecimal("mDespesasAcessorios");
        this.mFreteFornecedor = rs.getBigDecimal("mFreteFornecedor");
        
        // TODO: Implementar locate da Forma de pagamento.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NotaFiscal other = (NotaFiscal) obj;
        if (this.nNumeroSerie != other.nNumeroSerie) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.nNumeroSerie ^ (this.nNumeroSerie >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "NotaFiscal: " + nNumeroSerie + ", Valor itens: " + mValorTotalItens;
    }

    public Date getdDataEmissao() {
        return dDataEmissao;
    }

    public void setdDataEmissao(Date dDataEmissao) {
        this.dDataEmissao = dDataEmissao;
    }

    public Date getdDataEntrada() {
        return dDataEntrada;
    }

    public void setdDataEntrada(Date dDataEntrada) {
        this.dDataEntrada = dDataEntrada;
    }

    public long getFkFormaPagamentoId() {
        return fkFormaPagamentoId;
    }

    public void setFkFormaPagamentoId(long fkFormaPagamentoId) {
        this.fkFormaPagamentoId = fkFormaPagamentoId;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getmDespesasAcessorios() {
        return mDespesasAcessorios;
    }

    public void setmDespesasAcessorios(BigDecimal mDespesasAcessorios) {
        this.mDespesasAcessorios = mDespesasAcessorios;
    }

    public BigDecimal getmFreteFornecedor() {
        return mFreteFornecedor;
    }

    public void setmFreteFornecedor(BigDecimal mFreteFornecedor) {
        this.mFreteFornecedor = mFreteFornecedor;
    }

    public BigDecimal getmValorTotalItens() {
        return mValorTotalItens;
    }

    public void setmValorTotalItens(BigDecimal mValorTotalItens) {
        this.mValorTotalItens = mValorTotalItens;
    }

    public long getnNumeroSerie() {
        return nNumeroSerie;
    }

    public void setnNumeroSerie(long nNumeroSerie) {
        this.nNumeroSerie = nNumeroSerie;
    }
}
