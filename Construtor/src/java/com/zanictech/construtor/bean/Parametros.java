package com.zanictech.construtor.bean;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Parametros {

    private boolean bUsaCustoMedio;
    private BigDecimal pValorVenda;
    private BigDecimal pValorVendaIndividual;
    private BigDecimal pLucratividadeMinima;

    public Parametros() {
    }

    public Parametros(boolean bUsaCustoMedio, BigDecimal pValorVenda, BigDecimal pValorVendaIndividual, BigDecimal pLucratividadeMinima) {
        this.bUsaCustoMedio = bUsaCustoMedio;
        this.pValorVenda = pValorVenda;
        this.pValorVendaIndividual = pValorVendaIndividual;
        this.pLucratividadeMinima = pLucratividadeMinima;
    }
    
    public Parametros(ResultSet rs) throws SQLException {
        this.bUsaCustoMedio = rs.getBoolean("bUsaCustoMedio");
        this.pValorVenda = rs.getBigDecimal("pValorVenda");
        this.pValorVendaIndividual = rs.getBigDecimal("pValorVendaIndividual");
        this.pLucratividadeMinima = rs.getBigDecimal("pLucratividadeMinima");
    }

    public boolean isbUsaCustoMedio() {
        return bUsaCustoMedio;
    }

    public void setbUsaCustoMedio(boolean bUsaCustoMedio) {
        this.bUsaCustoMedio = bUsaCustoMedio;
    }

    public BigDecimal getpLucratividadeMinima() {
        return pLucratividadeMinima;
    }

    public void setpLucratividadeMinima(BigDecimal pLucratividadeMinima) {
        this.pLucratividadeMinima = pLucratividadeMinima;
    }

    public BigDecimal getpValorVenda() {
        return pValorVenda;
    }

    public void setpValorVenda(BigDecimal pValorVenda) {
        this.pValorVenda = pValorVenda;
    }

    public BigDecimal getpValorVendaIndividual() {
        return pValorVendaIndividual;
    }

    public void setpValorVendaIndividual(BigDecimal pValorVendaIndividual) {
        this.pValorVendaIndividual = pValorVendaIndividual;
    }
}
