package com.zanictech.construtor.bean;

import com.zanictech.construtor.bean.basebean.BaseBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Zanichelli
 */
public class FormaPagamento extends BaseBean{

    private String cForma;

    public FormaPagamento() {
    }

    public FormaPagamento(String cForma) {
        this.cForma = cForma;
    }
    
    public FormaPagamento(ResultSet rs) throws SQLException {
        this.cForma = rs.getString("cForma");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FormaPagamento other = (FormaPagamento) obj;
        if ((this.cForma == null) ? (other.cForma != null) : !this.cForma.equals(other.cForma)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.cForma != null ? this.cForma.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return cForma;
    }

    public String getcForma() {
        return cForma;
    }

    public void setcForma(String cForma) {
        this.cForma = cForma;
    }
}
