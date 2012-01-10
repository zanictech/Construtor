package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Transportadora extends BaseBean {

    private String cNome;
    private String cTelefone;
    private String cContato;
    private String cObservacao;

    public Transportadora() {
    }

    public Transportadora(String cNome, String cTelefone, String cContato, String cObservacao) {
        this.cNome = cNome;
        this.cTelefone = cTelefone;
        this.cContato = cContato;
        this.cObservacao = cObservacao;
    }
    
    public Transportadora(ResultSet rs) throws SQLException {
        this.cNome = rs.getString("cNome");
        this.cTelefone = rs.getString("cTelefone");
        this.cContato = rs.getString("cContato");
        this.cObservacao = rs.getString("cObservacao");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transportadora other = (Transportadora) obj;
        if ((this.cNome == null) ? (other.cNome != null) : !this.cNome.equals(other.cNome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.cNome != null ? this.cNome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cNome;
    }

    public String getcContato() {
        return cContato;
    }

    public void setcContato(String cContato) {
        this.cContato = cContato;
    }

    public String getcNome() {
        return cNome;
    }

    public void setcNome(String cNome) {
        this.cNome = cNome;
    }

    public String getcObservacao() {
        return cObservacao;
    }

    public void setcObservacao(String cObservacao) {
        this.cObservacao = cObservacao;
    }

    public String getcTelefone() {
        return cTelefone;
    }

    public void setcTelefone(String cTelefone) {
        this.cTelefone = cTelefone;
    }
}
