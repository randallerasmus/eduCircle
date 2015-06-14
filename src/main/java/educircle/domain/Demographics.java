/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author RASCAL
 */
@Embeddable
public class Demographics implements Serializable
{   
    private String race;
    private String gender;
    private Date dateOfBirth;

    public String getRace() {
        return race;
    }
    public String getGender() {
        return gender;
    }
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public Demographics()
    {
        
    }
    
    public Demographics(Builder builder)
    {
        this.race=builder.race;
        this.gender=builder.gender;
        this.dateOfBirth=builder.dateOfBirth;
    }   
    public static class Builder
        {
        private String race;
        private String gender;
        private Date dateOfBirth;
        
        public Builder(String race)
        {
            this.race=race;
        }
        public Builder gender(String gender)
        {
            this.gender=gender;
            return this;
        }
        public Builder dateOfBirth(Date dateOfBirth)
        {
            this.dateOfBirth=dateOfBirth;
            return this;
        }
        public Builder copy(Builder value)
        {
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
    
}
