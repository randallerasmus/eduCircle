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
    private int contactNumber;
    private String race;
    private String gender;
    private String TeacherName;

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public int getcontactNumber() {
        return contactNumber;
    }
   
    public Long getId() {
        return id;
    }

    public Teacher ()
    {
        
    }
                
    public Teacher (Builder builder){
        this.id=builder.id;
        this.contactNumber=builder.contactNumber;
        this.subjectTitle=builder.subjectTitle;
        this.race=builder.race;
        this.gender=builder.gender;
        this.TeacherName=builder.TeacherName;
    }
    public static class Builder
    {   private Long id;
        private Integer contactNumber;
        private String subjectTitle;
        private String race;
        private String gender;
        private String TeacherName;
        
        public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
         public Builder(String subjectTitle)
    {
        this.subjectTitle=subjectTitle;
        
    }
      public Builder TeacherName(String TeacherName)
      {
          this.TeacherName=TeacherName;
          return this;
      }
    
    public Builder contactNumber(Integer contactNumber)
    {
        this.contactNumber=contactNumber;
        return this;
    }
    public Builder race(String race)
    {
        this.race=race;
        return this;
    }
    public Builder gender(String gender)
    {
       this.gender=gender;
       return this;
    }
    public Teacher build()
    {
        return new Teacher(this);
    }
     public Builder copy (Builder value){
        this.id=value.id;
        this.contactNumber=value.contactNumber;
        this.subjectTitle=value.subjectTitle;
        this.TeacherName=value.TeacherName;
        this.gender=value.gender;
        this.race=value.race;
        return this;
        
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
