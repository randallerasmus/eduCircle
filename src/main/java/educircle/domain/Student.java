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
    public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String grade;
    private int identityNr;
    private int ContactNr;
    private int postalCode;

    public Long getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public int getIdentityNr() {
        return identityNr;
    }

    public int getContactNr() {
        return ContactNr;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public Student ()
    {
        
    }

            
    public Student (Builder builder){
        this.id=builder.id;
        this.identityNr=builder.identityNr;
        this.ContactNr=builder.ContactNr;
        this.grade=builder.grade;
        this.postalCode=builder.postalCode;
    }
    
    public static class Builder
    {
        private Long id;
        private Integer identityNr;
        private int ContactNr;
        private String grade;
        private int postalCode;
       
        
        
     public Builder id(Long value)
    {
        this.id=value;
        return this;
    }   
    
    public Builder (Integer identityNr)
    {
        this.identityNr=identityNr;
        
    }
    public Builder grade (String grade)
    {
        this.grade=grade;
        return this;
    }
    public Builder ContactNr(int ContactNr)
    {
        this.ContactNr=ContactNr;
        return this;
    }
    public Builder postalCode(int postalCode)
    {
        this.postalCode=postalCode;
        return this;
    }
    
    public Student build()
    {
        return new Student(this);
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
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
