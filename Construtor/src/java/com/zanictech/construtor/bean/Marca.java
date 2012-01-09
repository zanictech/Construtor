package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Marca extends BaseBean{

    private String cNome;
    private String cDescricao;

    public Marca() {
    }

    public Marca(String cNome, String cDescricao) {
        this.cNome = cNome;
        this.cDescricao = cDescricao;
    }

    public Marca(ResultSet rs) throws SQLException {
        this.cNome = rs.getString("cNome");
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
        final Marca other = (Marca) obj;
        if ((this.cNome == null) ? (other.cNome != null) : !this.cNome.equals(other.cNome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.cNome != null ? this.cNome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cNome;
    }

    public String getcDescricao() {
        return cDescricao;
    }

    public void setcDescricao(String cDescricao) {
        this.cDescricao = cDescricao;
    }

    public String getcNome() {
        return cNome;
    }

    public void setcNome(String cNome) {
        this.cNome = cNome;
    }
}
