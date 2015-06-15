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
import javax.persistence.OneToOne;

/**
 *
 * @author RASCAL
 */
@Entity
    public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectName;
    private int subjectCode;
    
    @OneToOne
    private Teacher teacher;

    public String getSubjectName() {
    return subjectName;
    }

    public int getSubjectCode() {
        return subjectCode;
    }
    
    public Long getId() {
        return id;
    }

    public Subject ()
    {
        
    }
    @Embedded
    private TimeTable timetable;
    
    @Embedded 
    private Result resultable;
    
    @Embedded
    private Attendance nonattendable;
              
    public Subject (Builder builder){
        this.id=builder.id;
        this.subjectCode=builder.subjectCode;
        this.subjectName=builder.subjectName;
    }
    public static class Builder
    {   
        private Long id;
        private Integer subjectCode;
        private String subjectName;
        
    public Builder subjectCode(Integer subjectCode)
    {
        this.subjectCode=subjectCode;
        return this;
    }
     public Builder (String subjectName)
    {
        this.subjectName=subjectName;
    }
   
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Subject build()
    {
        return new Subject(this);
    }
    public Builder copy(Builder value){
        this.id=value.id;
        this.subjectCode=value.subjectCode;
        this.subjectName=value.subjectName;
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
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
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
