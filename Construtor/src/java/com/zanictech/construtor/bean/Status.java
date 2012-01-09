package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class Status extends BaseBean{

    private String cStatus;
    private String cDescricao;

    public Status() {
    }

    public Status(String cStatus, String cDescricao) {
        this.cStatus = cStatus;
        this.cDescricao = cDescricao;
    }
    
    public Status(ResultSet rs) throws SQLException {
        this.cStatus = rs.getString("cStatus");
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
        final Status other = (Status) obj;
        if ((this.cStatus == null) ? (other.cStatus != null) : !this.cStatus.equals(other.cStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (this.cStatus != null ? this.cStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cStatus;
    }

    public String getcDescricao() {
        return cDescricao;
    }

    public void setcDescricao(String cDescricao) {
        this.cDescricao = cDescricao;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }
}
