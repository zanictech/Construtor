package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Anderson Zanichelli
 */
public class VendaBalcao extends BaseBean {

    private String cNomePessoa;
    private String cTelefone;
    private long fkEndereco;
    private String cNumero;
    private Date dDataCadastro;
    
    private Endereco endereco;

    public VendaBalcao() {
    }

    public VendaBalcao(String cNomePessoa, String cTelefone, String cNumero, Date dDataCadastro, Endereco endereco) {
        this.cNomePessoa = cNomePessoa;
        this.cTelefone = cTelefone;
        this.fkEndereco = endereco.getId();
        this.cNumero = cNumero;
        this.dDataCadastro = dDataCadastro;
        this.endereco = endereco;
    }
    
    public VendaBalcao(ResultSet rs) throws SQLException {
        this.cNomePessoa = rs.getString("cNomePessoa");
        this.cTelefone = rs.getString("cTelefone");
        this.fkEndereco = rs.getLong("fkEndereco");
        this.cNumero = rs.getString("cNumero");
        this.dDataCadastro = rs.getDate("dDataCadastro");
        
        // TODO: Implementar locate endereço.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VendaBalcao other = (VendaBalcao) obj;
        if ((this.cNomePessoa == null) ? (other.cNomePessoa != null) : !this.cNomePessoa.equals(other.cNomePessoa)) {
            return false;
        }
        if ((this.cTelefone == null) ? (other.cTelefone != null) : !this.cTelefone.equals(other.cTelefone)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.cNomePessoa != null ? this.cNomePessoa.hashCode() : 0);
        hash = 71 * hash + (this.cTelefone != null ? this.cTelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cNomePessoa + " - " + cTelefone;
    }

    public String getcNomePessoa() {
        return cNomePessoa;
    }

    public void setcNomePessoa(String cNomePessoa) {
        this.cNomePessoa = cNomePessoa;
    }

    public String getcNumero() {
        return cNumero;
    }

    public void setcNumero(String cNumero) {
        this.cNumero = cNumero;
    }

    public String getcTelefone() {
        return cTelefone;
    }

    public void setcTelefone(String cTelefone) {
        this.cTelefone = cTelefone;
    }

    public Date getdDataCadastro() {
        return dDataCadastro;
    }

    public void setdDataCadastro(Date dDataCadastro) {
        this.dDataCadastro = dDataCadastro;
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
