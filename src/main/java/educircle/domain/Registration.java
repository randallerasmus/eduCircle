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
    public class Registration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    private String name;
    private String surname;
    private String race;
    private String gender;
    private String grade;
    private int studentNr;
    
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getrace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }
    
    public Registration ()
    {
        
    }
               
    public Registration (Builder builder){
        this.id=builder.id;
        this.studentNr=builder.studentNr;
        this.name=builder.name;
        this.surname=builder.surname;
        this.race=builder.race;
        this.gender=builder.gender;
        
    }
    public static class Builder
    {
        private Integer studentNr;
        private String name;
        private Long id;
        private String surname;
        private String race;
        private String gender;
        
         public Builder id(Long value)
    {
        this.id=value;
        return this;
    }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder race(String race) {
            this.race = race;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        
    
    
    public Builder studentNr(Integer studentNr)
    {
        this.studentNr=studentNr;
        return this;
        
    }
     public Builder name(String name)
    {
        this.name=name;
        return this;
    }
   
   
    public Registration build()
    {
        return new Registration(this);
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
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
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
