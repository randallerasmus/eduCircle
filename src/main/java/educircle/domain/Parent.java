/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RASCAL
 */
@Entity
    public class Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private int identityNr;
    private int ContactNr;

    public Long getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }

    public int getIdentityNr() {
        return identityNr;
    }

    public int getContactNr() {
        return ContactNr;
    }
    public Parent ()
    {
        
    }
    
            
    public Parent (Builder builder){
        this.id=builder.id;
        this.identityNr=builder.identityNr;
        this.email=builder.email;
        this.ContactNr=builder.ContactNr;
        
    }
    public static class Builder
    {
        private Integer identityNr;
        private String email;
        private Long id;
        private int ContactNr;
        
    public Builder (String email)
    {
        this.email=email;
    }
    
    public Builder identityNr(Integer identityNr)
    {
        this.identityNr=identityNr;
        return this;
     }
      
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Builder ContactNr(Integer ContactNr)
    {
        this.ContactNr=ContactNr;
        return this;
    }
    public Builder copy (Builder value){
        this.id=value.id;
        this.identityNr=value.identityNr;
        this.email=value.email;
        this.ContactNr=value.ContactNr;
        return this;
        
    }
    public Parent build()
    {
        return new Parent(this);
    }
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parent)) {
            return false;
        }
        Parent other = (Parent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Subject[ id=" + id + " ]";
    }
    
}
