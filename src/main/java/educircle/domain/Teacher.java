/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RASCAL
 */
@Entity
    public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectTitle;
    private int ContactNr;

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public int getContactNr() {
        return ContactNr;
    }
   
    public Long getId() {
        return id;
    }

    public Teacher ()
    {
        
    }
                
    public Teacher (Builder builder){
        this.id=builder.id;
        this.ContactNr=builder.ContactNr;
        this.subjectTitle=builder.subjectTitle;
        
    }
    public static class Builder
    {
        private Integer ContactNr;
        private String subjectTitle;
        private Long id;
        
    
    
    public Builder ContactNr(Integer ContactNr)
    {
        this.ContactNr=ContactNr;
        return this;
        
    }
     public Builder subjectTitle(String subjectTitle)
    {
        this.subjectTitle=subjectTitle;
        return this;
    }
   
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Teacher build()
    {
        return new Teacher(this);
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
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
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
