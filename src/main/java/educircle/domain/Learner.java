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
    public class Learner implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String LearnerName;
    private int LearnerIdNumber;
    private String LearnerSurname;
 
    public Long getId() {
        return id;
    }

    public String getLearnerName() {
        return LearnerName;
    }

    public int getLearnerIdNumber() {
        return LearnerIdNumber;
    }

    public String getLearnerSurname() {
        return LearnerSurname;
    }

    public Learner ()
    {
    }
    
    @Embedded
    private Parent parent;
    
    @Embedded
    private Demographics demographics;
    
    @Embedded
    private Contact contact;
    
    @OneToOne
    private Registration registration;
               
    public Learner (Builder builder){
        this.id=builder.id;
        this.LearnerIdNumber=builder.LearnerIdNumber;
        this.LearnerSurname=builder.LearnerSurname;
        this.LearnerName=builder.LearnerName;
    }
    public static class Builder
    {
        private Long id;
        private Integer LearnerIdNumber;
        private String LearnerSurname;
        private String LearnerName;
        
     public Builder id(Long value)
    {
        this.id=value;
        return this;
    }   
    
    public Builder (Integer LearnerIdNumber)
    {
        this.LearnerIdNumber=LearnerIdNumber;
    }
    public Builder LearnerName (String LearnerName)
    {
        this.LearnerName=LearnerName;
        return this;
    }
    public Builder LearnerSurname(String LearnerSurname)
    {
        this.LearnerSurname=LearnerSurname;
        return this;
    }
    public Learner build()
    {
        return new Learner(this);
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
        if (!(object instanceof Learner)) {
            return false;
        }
        Learner other = (Learner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Learner[ id=" + id + " ]";
    }
    
}
