package com.zanictech.construtor.bean;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Anderson Zanichelli
 */
public class ContasAPagar {

    private String cNumeroNota;
    private int nQtdeParcelas;
    private Date dDataVencimento;
    private BigDecimal mValor;
    private String cStatusPagamento; //(para receber os valores "AGUARDANDO, PAGO, VENCIDO")
    private Date dDataPagamento;
    private long fkFormaPagamento;
    
    private FormaPagamento formaPagamento;

    public ContasAPagar() {
    }

    public ContasAPagar(String cNumeroNota, int nQtdeParcelas, Date dDataVencimento, BigDecimal mValor, String cStatusPagamento, Date dDataPagamento, FormaPagamento formaPagamento) {
        this.cNumeroNota = cNumeroNota;
        this.nQtdeParcelas = nQtdeParcelas;
        this.dDataVencimento = dDataVencimento;
        this.mValor = mValor;
        this.cStatusPagamento = cStatusPagamento;
        this.dDataPagamento = dDataPagamento;
        this.fkFormaPagamento = formaPagamento.getId();
        this.formaPagamento = formaPagamento;
    }
    
    public ContasAPagar(ResultSet rs) throws SQLException {
        this.cNumeroNota = rs.getString("cNumeroNota");
        this.nQtdeParcelas = rs.getInt("nQtdeParcelas");
        this.dDataVencimento = rs.getDate("dDataVencimento");
        this.mValor = rs.getBigDecimal("mValor");
        this.cStatusPagamento = rs.getString("cStatusPagamento");
        this.dDataPagamento = rs.getDate("dDataPagamento");
        this.fkFormaPagamento = rs.getLong("fkFormaPagamento");
        
        // TODO: Implementar locate da forma de pagamento.
    }

    public String getcNumeroNota() {
        return cNumeroNota;
    }

    public void setcNumeroNota(String cNumeroNota) {
        this.cNumeroNota = cNumeroNota;
    }

    public String getcStatusPagamento() {
        return cStatusPagamento;
    }

    public void setcStatusPagamento(String cStatusPagamento) {
        this.cStatusPagamento = cStatusPagamento;
    }

    public Date getdDataPagamento() {
        return dDataPagamento;
    }

    public void setdDataPagamento(Date dDataPagamento) {
        this.dDataPagamento = dDataPagamento;
    }

    public Date getdDataVencimento() {
        return dDataVencimento;
    }

    public void setdDataVencimento(Date dDataVencimento) {
        this.dDataVencimento = dDataVencimento;
    }

    public long getFkFormaPagamento() {
        return fkFormaPagamento;
    }

    public void setFkFormaPagamento(long fkFormaPagamento) {
        this.fkFormaPagamento = fkFormaPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getmValor() {
        return mValor;
    }

    public void setmValor(BigDecimal mValor) {
        this.mValor = mValor;
    }

    public int getnQtdeParcelas() {
        return nQtdeParcelas;
    }

    public void setnQtdeParcelas(int nQtdeParcelas) {
        this.nQtdeParcelas = nQtdeParcelas;
    }
}
