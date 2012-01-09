package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Pais extends BaseBean{

    private String cSigla;
    private String cNome;

    public Pais() {
    }

    public Pais(String cSigla, String cNome) {
        this.cSigla = cSigla;
        this.cNome = cNome;
    }
    
    public Pais(ResultSet rs) throws SQLException {
        this.cSigla = rs.getString("cSigla");
        this.cNome = rs.getString("cNome");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if ((this.cSigla == null) ? (other.cSigla != null) : !this.cSigla.equals(other.cSigla)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.cSigla != null ? this.cSigla.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cSigla;
    }

    public String getcNome() {
        return cNome;
    }

    public void setcNome(String cNome) {
        this.cNome = cNome;
    }

    public String getcSigla() {
        return cSigla;
    }

    public void setcSigla(String cSigla) {
        this.cSigla = cSigla;
    }
}
