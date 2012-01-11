package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Fornecedor extends BaseBean {

    private String cRazaoSocial;
    private String cCnpj;
    private String cNomeFantasia;
    private String cContato;
    private String cTelefone;
    private String cCelular;
    private String cEmail;
    private long fkEndereco;
    private String cNumero;
    private String cObservacao;
    
    private Endereco endereco;

    public Fornecedor() {
    }

    public Fornecedor(String cRazaoSocial, String cCnpj, String cNomeFantasia, String cContato, String cTelefone, String cCelular, String cEmail, String cNumero, String cObservacao, Endereco endereco) {
        this.cRazaoSocial = cRazaoSocial;
        this.cCnpj = cCnpj;
        this.cNomeFantasia = cNomeFantasia;
        this.cContato = cContato;
        this.cTelefone = cTelefone;
        this.cCelular = cCelular;
        this.cEmail = cEmail;
        this.fkEndereco = endereco.getId();
        this.cNumero = cNumero;
        this.cObservacao = cObservacao;
        this.endereco = endereco;
    }
    
    public Fornecedor(ResultSet rs) throws SQLException {
        this.cRazaoSocial = rs.getString("cRazaoSocial");
        this.cCnpj = rs.getString("cCnpj");
        this.cNomeFantasia = rs.getString("cNomeFantasia");
        this.cContato = rs.getString("cContato");
        this.cTelefone = rs.getString("cTelefone");
        this.cCelular = rs.getString("cCelular");
        this.cEmail = rs.getString("cEmail");
        this.fkEndereco = rs.getLong("fkEndereco");
        this.cNumero = rs.getString("cNumero");
        this.cObservacao = rs.getString("cObservacao");
        
        // TODO: Implementar locate do endereço
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if ((this.cRazaoSocial == null) ? (other.cRazaoSocial != null) : !this.cRazaoSocial.equals(other.cRazaoSocial)) {
            return false;
        }
        if ((this.cCnpj == null) ? (other.cCnpj != null) : !this.cCnpj.equals(other.cCnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.cRazaoSocial != null ? this.cRazaoSocial.hashCode() : 0);
        hash = 71 * hash + (this.cCnpj != null ? this.cCnpj.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cRazaoSocial + " - " + cCnpj;
    }

    public String getcCelular() {
        return cCelular;
    }

    public void setcCelular(String cCelular) {
        this.cCelular = cCelular;
    }

    public String getcCnpj() {
        return cCnpj;
    }

    public void setcCnpj(String cCnpj) {
        this.cCnpj = cCnpj;
    }

    public String getcContato() {
        return cContato;
    }

    public void setcContato(String cContato) {
        this.cContato = cContato;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcNomeFantasia() {
        return cNomeFantasia;
    }

    public void setcNomeFantasia(String cNomeFantasia) {
        this.cNomeFantasia = cNomeFantasia;
    }

    public String getcNumero() {
        return cNumero;
    }

    public void setcNumero(String cNumero) {
        this.cNumero = cNumero;
    }

    public String getcObservacao() {
        return cObservacao;
    }

    public void setcObservacao(String cObservacao) {
        this.cObservacao = cObservacao;
    }

    public String getcRazaoSocial() {
        return cRazaoSocial;
    }

    public void setcRazaoSocial(String cRazaoSocial) {
        this.cRazaoSocial = cRazaoSocial;
    }

    public String getcTelefone() {
        return cTelefone;
    }

    public void setcTelefone(String cTelefone) {
        this.cTelefone = cTelefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public long getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(long fkEndereco) {
        this.fkEndereco = fkEndereco;
    }
}
