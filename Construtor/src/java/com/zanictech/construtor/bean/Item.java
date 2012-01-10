package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Item extends BaseBean{

    private String cCodigo;
    private String cDescricao;
    private String cClassificacaoFiscal;
    private String cCodigoTributacao;
    private long fkMedidaId;
    private BigDecimal mCusto;
    private Double nEstoqueMinimo;
    
    private Medida medida;

    public Item() {
    }

    public Item(String cCodigo, String cDescricao, String cClassificacaoFiscal, String cCodigoTributacao, BigDecimal mCusto, Double nEstoqueMinimo, Medida medida) {
        this.cCodigo = cCodigo;
        this.cDescricao = cDescricao;
        this.cClassificacaoFiscal = cClassificacaoFiscal;
        this.cCodigoTributacao = cCodigoTributacao;
        this.fkMedidaId = medida.getId();
        this.mCusto = mCusto;
        this.nEstoqueMinimo = nEstoqueMinimo;
        this.medida = medida;
    }
    
    public Item(ResultSet rs) throws SQLException {
        this.cCodigo = rs.getString("cCodigo");
        this.cDescricao = rs.getString("cDescricao");
        this.cClassificacaoFiscal = rs.getString("cClassificacaoFiscal");
        this.cCodigoTributacao = rs.getString("cCodigoTributacao");
        this.fkMedidaId = rs.getLong("fkMedidaId");
        this.mCusto = rs.getBigDecimal("mCusto");
        this.nEstoqueMinimo = rs.getDouble("nEstoqueMinimo");
        
        // TODO: Implementar locate para Medida
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if ((this.cCodigo == null) ? (other.cCodigo != null) : !this.cCodigo.equals(other.cCodigo)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.cCodigo != null ? this.cCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cCodigo + " - " + cDescricao;
    }

    public String getcClassificacaoFiscal() {
        return cClassificacaoFiscal;
    }

    public void setcClassificacaoFiscal(String cClassificacaoFiscal) {
        this.cClassificacaoFiscal = cClassificacaoFiscal;
    }

    public String getcCodigo() {
        return cCodigo;
    }

    public void setcCodigo(String cCodigo) {
        this.cCodigo = cCodigo;
    }

    public String getcCodigoTributacao() {
        return cCodigoTributacao;
    }

    public void setcCodigoTributacao(String cCodigoTributacao) {
        this.cCodigoTributacao = cCodigoTributacao;
    }

    public String getcDescricao() {
        return cDescricao;
    }

    public void setcDescricao(String cDescricao) {
        this.cDescricao = cDescricao;
    }

    public long getFkMedidaId() {
        return fkMedidaId;
    }

    public void setFkMedidaId(long fkMedidaId) {
        this.fkMedidaId = fkMedidaId;
    }

    public BigDecimal getmCusto() {
        return mCusto;
    }

    public void setmCusto(BigDecimal mCusto) {
        this.mCusto = mCusto;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    public Double getnEstoqueMinimo() {
        return nEstoqueMinimo;
    }

    public void setnEstoqueMinimo(Double nEstoqueMinimo) {
        this.nEstoqueMinimo = nEstoqueMinimo;
    }
}
