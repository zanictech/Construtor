package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class PessoaFisica extends BaseBean {

    private String cCpf;
    private String cRg;
    private String cNome;
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

    public PessoaFisica() {
    }

    public PessoaFisica(String cCpf, String cRg, String cNome, String cTelefone, String cCelular, String cEmail, String cNumero, String cNumeroEntrega, String cObservacao, Endereco endereco, Endereco enderecoEntrega) {
        this.cCpf = cCpf;
        this.cRg = cRg;
        this.cNome = cNome;
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
    
    public PessoaFisica(ResultSet rs) throws SQLException {
        this.cCpf = rs.getString("");
        this.cRg = rs.getString("");
        this.cNome = rs.getString("");
        this.cTelefone = rs.getString("");
        this.cCelular = rs.getString("");
        this.cEmail = rs.getString("");
        this.fkEndereco = rs.getLong("fkEndereco");
        this.cNumero = rs.getString("");
        this.fkEnderecoEntrega = rs.getLong("fkEnderecoEntrega");
        this.cNumeroEntrega = rs.getString("");
        this.cObservacao = rs.getString("");
        
        // TODO: Implementar locate da entidade endereço
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaFisica other = (PessoaFisica) obj;
        if ((this.cCpf == null) ? (other.cCpf != null) : !this.cCpf.equals(other.cCpf)) {
            return false;
        }
        if ((this.cNome == null) ? (other.cNome != null) : !this.cNome.equals(other.cNome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.cCpf != null ? this.cCpf.hashCode() : 0);
        hash = 83 * hash + (this.cNome != null ? this.cNome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cNome + " - " + cCpf;
    }

    public String getcCelular() {
        return cCelular;
    }

    public void setcCelular(String cCelular) {
        this.cCelular = cCelular;
    }

    public String getcCpf() {
        return cCpf;
    }

    public void setcCpf(String cCpf) {
        this.cCpf = cCpf;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcNome() {
        return cNome;
    }

    public void setcNome(String cNome) {
        this.cNome = cNome;
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

    public String getcRg() {
        return cRg;
    }

    public void setcRg(String cRg) {
        this.cRg = cRg;
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
