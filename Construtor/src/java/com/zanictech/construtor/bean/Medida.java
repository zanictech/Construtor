package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Medida extends BaseBean{

    private String cSigla;
    private String cDescricao;

    public Medida() {
    }

    public Medida(String cSigla, String cDescricao) {
        this.cSigla = cSigla;
        this.cDescricao = cDescricao;
    }
    
    public Medida(ResultSet rs) throws SQLException {
        this.cSigla = rs.getString("cSigla");
        this.cDescricao = rs.getString("cDescricao");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medida other = (Medida) obj;
        if ((this.cSigla == null) ? (other.cSigla != null) : !this.cSigla.equals(other.cSigla)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.cSigla != null ? this.cSigla.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cSigla;
    }

    public String getcDescricao() {
        return cDescricao;
    }

    public void setcDescricao(String cDescricao) {
        this.cDescricao = cDescricao;
    }

    public String getcSigla() {
        return cSigla;
    }

    public void setcSigla(String cSigla) {
        this.cSigla = cSigla;
    }
}
