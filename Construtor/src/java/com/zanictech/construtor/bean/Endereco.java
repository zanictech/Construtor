package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Endereco extends BaseBean{

    private String cCidade;
    private String cLogradouro;
    private String cBairro;
    private String cCep;
    private String cTipoLogradouro;
    private long fkEstadoId;
    
    private Estado estado;

    public Endereco() {
    }

    public Endereco(String cCidade, String cLogradouro, String cBairro, String cCep, String cTipoLogradouro, Estado estado) {
        this.cCidade = cCidade;
        this.cLogradouro = cLogradouro;
        this.cBairro = cBairro;
        this.cCep = cCep;
        this.cTipoLogradouro = cTipoLogradouro;
        this.fkEstadoId = estado.getId();
        this.estado = estado;
    }
    
    public Endereco(ResultSet rs) throws SQLException {
        this.cCidade = rs.getString("cCidade");
        this.cLogradouro = rs.getString("cLogradouro");
        this.cBairro = rs.getString("cBairro");
        this.cCep = rs.getString("cCep");
        this.cTipoLogradouro = rs.getString("cTipoLogradouro");
        this.fkEstadoId = rs.getLong("fkEstadoId");
        
        // TODO Implementar locate do estado
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if ((this.cCep == null) ? (other.cCep != null) : !this.cCep.equals(other.cCep)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.cCep != null ? this.cCep.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cTipoLogradouro + ": " + cLogradouro + ", " + cBairro + ", " + cCidade + "/" + estado.getcNome();
    }

    public String getcBairro() {
        return cBairro;
    }

    public void setcBairro(String cBairro) {
        this.cBairro = cBairro;
    }

    public String getcCep() {
        return cCep;
    }

    public void setcCep(String cCep) {
        this.cCep = cCep;
    }

    public String getcCidade() {
        return cCidade;
    }

    public void setcCidade(String cCidade) {
        this.cCidade = cCidade;
    }

    public String getcLogradouro() {
        return cLogradouro;
    }

    public void setcLogradouro(String cLogradouro) {
        this.cLogradouro = cLogradouro;
    }

    public String getcTipoLogradouro() {
        return cTipoLogradouro;
    }

    public void setcTipoLogradouro(String cTipoLogradouro) {
        this.cTipoLogradouro = cTipoLogradouro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public long getFkEstadoId() {
        return fkEstadoId;
    }

    public void setFkEstadoId(long fkEstadoId) {
        this.fkEstadoId = fkEstadoId;
    }
}
