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
    public class Registration implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String LearnerName;
    private String LearnerSurname;
    private String ParentEmail;
    private String grade;
    private int LearnerIdNumber;
    
    public Long getId() {
        return id;
    }
    public String getLearnerName() {
        return LearnerName;
    }

    public String getLearnerSurname() {
        return LearnerSurname;
    }

    public String getParentEmail() {
        return ParentEmail;
    }
    public int getLearnerIdNumber()
    {
        return LearnerIdNumber;
    }

     public String getGrade() {
        return grade;
    }
    
    public Registration ()
    {
        
    }
               
    public Registration (Builder builder){
        this.id=builder.id;
        this.LearnerIdNumber=builder.LearnerIdNumber;
        this.LearnerName=builder.LearnerName;
        this.LearnerSurname=builder.LearnerSurname;
        this.ParentEmail=builder.ParentEmail;
       
        this.grade=builder.grade;
        
    }
    public static class Builder
    {
        private Integer LearnerIdNumber;
        private String LearnerName;
        private Long id;
        private String LearnerSurname;
        private String ParentEmail;
     
        private String grade;
        
         public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
         public Builder (Integer LearnerIdNumber)
    {
        this.LearnerIdNumber=LearnerIdNumber;
    }
        public Builder LearnerSurname(String LearnerSurname) {
            this.LearnerSurname = LearnerSurname;
            return this;
        }
        public Builder ParentEmail(String ParentEmail) {
            this.ParentEmail = ParentEmail;
            return this;
        }
     public Builder LearnerName(String LearnerName)
    {
        this.LearnerName=LearnerName;
        return this;
    }
     public Builder grade(String grade)
    {
        this.grade=grade;
        return this;
    }
     public Builder copy (Builder value){
        this.id=value.id;
        this.LearnerIdNumber=value.LearnerIdNumber;
        this.LearnerName=value.LearnerName;
        this.LearnerSurname=value.LearnerSurname;
        this.ParentEmail=value.ParentEmail;
        this.grade=value.grade;
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
        return "educircle.domain.Registration[ id=" + id + " ]";
    }
    
}
