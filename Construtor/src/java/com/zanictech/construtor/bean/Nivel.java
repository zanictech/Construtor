package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Nivel extends BaseBean{

    private String cNivel;
    private String cDescricao;

    public Nivel() {
    }

    public Nivel(String cNivel, String cDescricao) {
        this.cNivel = cNivel;
        this.cDescricao = cDescricao;
    }
    
    public Nivel(ResultSet rs) throws SQLException {
        this.cNivel = rs.getString("cNivel");
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
        final Nivel other = (Nivel) obj;
        if ((this.cNivel == null) ? (other.cNivel != null) : !this.cNivel.equals(other.cNivel)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.cNivel != null ? this.cNivel.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cNivel;
    }

    public String getcDescricao() {
        return cDescricao;
    }

    public void setcDescricao(String cDescricao) {
        this.cDescricao = cDescricao;
    }

    public String getcNivel() {
        return cNivel;
    }

    public void setcNivel(String cNivel) {
        this.cNivel = cNivel;
    }
}
