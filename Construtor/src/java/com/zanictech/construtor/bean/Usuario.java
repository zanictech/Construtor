package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Usuario extends BaseBean{

    private String cNome;
    private String cLogin;
    private String cPassword;
    private String cEmail;
    private long fkStatusId;
    private long fkNivelId;
    
    private Status status;
    private Nivel nivel;

    public Usuario() {
    }

    public Usuario(String cNome, String cLogin, String cPassword, String cEmail, Status status, Nivel nivel) {
        this.cNome = cNome;
        this.cLogin = cLogin;
        this.cPassword = cPassword;
        this.cEmail = cEmail;
        this.fkStatusId = status.getId();
        this.fkNivelId = nivel.getId();
        this.status = status;
        this.nivel = nivel;
    }
    
    public Usuario(ResultSet rs) throws SQLException {
        this.cNome = rs.getString("cEmail");
        this.cLogin = rs.getString("cLogin");
        this.cPassword = rs.getString("cPassword");
        this.cEmail = rs.getString("cEmail");
        this.fkStatusId = rs.getLong("fkStatusId");
        this.fkNivelId = rs.getLong("fkNivelId");
        
        //TODO - Locate do status e do nivel
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if ((this.cLogin == null) ? (other.cLogin != null) : !this.cLogin.equals(other.cLogin)) {
            return false;
        }
        if ((this.cPassword == null) ? (other.cPassword != null) : !this.cPassword.equals(other.cPassword)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.cLogin != null ? this.cLogin.hashCode() : 0);
        hash = 47 * hash + (this.cPassword != null ? this.cPassword.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cNome + " - " + cLogin + " - " + cEmail + " - " + status + " - " + nivel;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcLogin() {
        return cLogin;
    }

    public void setcLogin(String cLogin) {
        this.cLogin = cLogin;
    }

    public String getcNome() {
        return cNome;
    }

    public void setcNome(String cNome) {
        this.cNome = cNome;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public long getFkNivelId() {
        return fkNivelId;
    }

    public void setFkNivelId(long fkNivelId) {
        this.fkNivelId = fkNivelId;
    }

    public long getFkStatusId() {
        return fkStatusId;
    }

    public void setFkStatusId(long fkStatusId) {
        this.fkStatusId = fkStatusId;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
