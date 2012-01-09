/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Estado extends BaseBean{

    private String cSigla;
    private String cNome;
    private long fkPaisId;
    
    private Pais pais;

    public Estado() {
    }

    public Estado(String cSigla, String cNome, Pais pais) {
        this.cSigla = cSigla;
        this.cNome = cNome;
        this.fkPaisId = pais.getId();
        this.pais = pais;
    }
    
    public Estado(ResultSet rs) throws SQLException {
        this.cSigla = rs.getString("cSigla");
        this.cNome = rs.getString("cNome");;
        this.fkPaisId = rs.getLong("fkPaisId");;
        
        // TODO - Locate Pais
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if ((this.cSigla == null) ? (other.cSigla != null) : !this.cSigla.equals(other.cSigla)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.cSigla != null ? this.cSigla.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cSigla + " - " + cNome;
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

    public long getFkPaisId() {
        return fkPaisId;
    }

    public void setFkPaisId(long fkPaisId) {
        this.fkPaisId = fkPaisId;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
