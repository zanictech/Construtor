package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class PessoaJuridica extends BaseBean{

    private String cCnpj;
    private String cInscMunicipal;
    private String cInscEstadual;
    private String cRazaoSocial;
    private String cNomeFantasia;
    private String cContato;
    private String cTelefone;
    private String cCelular;
    private String cEmail;
    private long fkEndereco;
    private String cNumero;
    private long fkEnderecoEntrega;
    private String cNumeroEntrega;
    private String cObservacao;
    
    private Endereco endereco;
    private Endereco enderecoEntrega;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cCnpj, String cInscMunicipal, String cInscEstadual, String cRazaoSocial, String cNomeFantasia, String cContato, String cTelefone, String cCelular, String cEmail, String cNumero, String cNumeroEntrega, String cObservacao, Endereco endereco, Endereco enderecoEntrega) {
        this.cCnpj = cCnpj;
        this.cInscMunicipal = cInscMunicipal;
        this.cInscEstadual = cInscEstadual;
        this.cRazaoSocial = cRazaoSocial;
        this.cNomeFantasia = cNomeFantasia;
        this.cContato = cContato;
        this.cTelefone = cTelefone;
        this.cCelular = cCelular;
        this.cEmail = cEmail;
        this.fkEndereco = endereco.getId();
        this.cNumero = cNumero;
        this.fkEnderecoEntrega = enderecoEntrega.getId();
        this.cNumeroEntrega = cNumeroEntrega;
        this.cObservacao = cObservacao;
        this.endereco = endereco;
        this.enderecoEntrega = enderecoEntrega;
    }
    
    public PessoaJuridica(ResultSet rs) throws SQLException {
        this.cCnpj = rs.getString("cCnpj");
        this.cInscMunicipal = rs.getString("cInscMunicipal");
        this.cInscEstadual = rs.getString("cInscEstadual");
        this.cRazaoSocial = rs.getString("cRazaoSocial");
        this.cNomeFantasia = rs.getString("cNomeFantasia");
        this.cContato = rs.getString("cContato");
        this.cTelefone = rs.getString("cTelefone");
        this.cCelular = rs.getString("cCelular");
        this.cEmail = rs.getString("cEmail");
        this.fkEndereco = rs.getLong("fkEndereco");
        this.cNumero = rs.getString("cNumero");
        this.fkEnderecoEntrega = rs.getLong("fkEnderecoEntrega");
        this.cNumeroEntrega = rs.getString("cNumeroEntrega");
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
        final PessoaJuridica other = (PessoaJuridica) obj;
        if ((this.cCnpj == null) ? (other.cCnpj != null) : !this.cCnpj.equals(other.cCnpj)) {
            return false;
        }
        if ((this.cRazaoSocial == null) ? (other.cRazaoSocial != null) : !this.cRazaoSocial.equals(other.cRazaoSocial)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.cCnpj != null ? this.cCnpj.hashCode() : 0);
        hash = 53 * hash + (this.cRazaoSocial != null ? this.cRazaoSocial.hashCode() : 0);
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

    public String getcInscEstadual() {
        return cInscEstadual;
    }

    public void setcInscEstadual(String cInscEstadual) {
        this.cInscEstadual = cInscEstadual;
    }

    public String getcInscMunicipal() {
        return cInscMunicipal;
    }

    public void setcInscMunicipal(String cInscMunicipal) {
        this.cInscMunicipal = cInscMunicipal;
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

    public String getcNumeroEntrega() {
        return cNumeroEntrega;
    }

    public void setcNumeroEntrega(String cNumeroEntrega) {
        this.cNumeroEntrega = cNumeroEntrega;
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

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public long getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(long fkEndereco) {
        this.fkEndereco = fkEndereco;
    }

    public long getFkEnderecoEntrega() {
        return fkEnderecoEntrega;
    }

    public void setFkEnderecoEntrega(long fkEnderecoEntrega) {
        this.fkEnderecoEntrega = fkEnderecoEntrega;
    }
}
