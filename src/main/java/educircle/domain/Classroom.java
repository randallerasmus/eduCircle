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
    public class Classroom implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String LearnerName;
    private String LearnerSurname;
    private String TeacherName;
  
    
    public Long getId() {
        return id;
    }
    public String getLearnerName() {
        return LearnerName;
    }

    public String getLearnerSurname() {
        return LearnerSurname;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public Classroom ()
    {
        
    }
               
    public Classroom (Builder builder){
        this.id=builder.id;
        this.LearnerName=builder.LearnerName;
        this.LearnerSurname=builder.LearnerSurname;
        this.TeacherName=builder.TeacherName;
          
    }
    public static class Builder
    {
        private String LearnerName;
        private Long id;
        private String LearnerSurname;
        private String TeacherName;
        
        public Builder id(Long value)
        {
        this.id=value;
        return this;
        }
        public Builder (String LearnerName)
        {
        this.LearnerName=LearnerName;
        }
       public Builder LearnerSurname(String LearnerSurname) 
        {
            this.LearnerSurname = LearnerSurname;
            return this;
        }
        public Builder TeacherName(String TeacherName) 
        {
            this.TeacherName = TeacherName;
            return this;
        }
   
     public Builder copy (Builder value){
        this.id=value.id;
        this.LearnerName=value.LearnerName;
        this.LearnerSurname=value.LearnerSurname;
        this.TeacherName=value.TeacherName;
        return this;
    }
   
    public Classroom build()
    {
        return new Classroom(this);
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
        if (!(object instanceof Classroom)) {
            return false;
        }
        Classroom other = (Classroom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Classroom[ id=" + id + " ]";
    }
    
}
