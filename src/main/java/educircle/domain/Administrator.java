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
    public class Administrator implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectName;
    private int subjectCode;

    public String getSubjectName() {
    return subjectName;
    }

    public int getSubjectCode() {
        return subjectCode;
    }
    
    public Long getId() {
        return id;
    }

    public Administrator ()
    {
        
    }
    @Embedded
    private Result result;
            
    @Embedded
    private TimeTable timetable;
    
    @Embedded
    private NonAttendance nonattend;
            
    public Administrator (Builder builder){
        this.id=builder.id;
        this.subjectCode=builder.subjectCode;
        this.subjectName=builder.subjectName;
        
    }
    public static class Builder
    {
        private Integer subjectCode;
        private String subjectName;
        private Long id;
        
    
    
    public Builder subjectCode(Integer subjectCode)
    {
        this.subjectCode=subjectCode;
        return this;
        
    }
     public Builder subjectName(String subjectName)
    {
        this.subjectName=subjectName;
        return this;
    }
   
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Administrator build()
    {
        return new Administrator(this);
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
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
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
