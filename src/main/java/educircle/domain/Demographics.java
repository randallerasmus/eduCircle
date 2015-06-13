/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RASCAL
 */
@Entity
    public class Demographics implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String race;
    private String gender;
    private Date dateOfBirth;
  

    public String getrace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public Demographics ()
    {
        
    }
    public Demographics (Builder builder){
        this.id=builder.id;
        this.race=builder.race;
        this.dateOfBirth=builder.dateOfBirth;
        this.gender=builder.gender;
    }

    public static class Builder
    {
        private String race;
        private Long id;
        private Date dateOfBirth;
        private String gender;
    
    public Builder (String race)
    {
        this.race=race;
    }
    
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Builder dateOfBirth (Date value)
    {
        this.dateOfBirth=value;
        return this;
    }
    public Builder gender(String value)
    {
        this.gender=value;
        return this;
    }
   
     public Builder copy (Builder value){
        this.id=value.id;
        this.race=value.race;
        this.gender=value.gender;
        this.dateOfBirth=value.dateOfBirth;
     return this;
        
    }
    public Demographics build()
    {
        return new Demographics(this);
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
        if (!(object instanceof Demographics)) {
            return false;
        }
        Demographics other = (Demographics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Demographics[ id=" + id + " ]";
    }
    
}
