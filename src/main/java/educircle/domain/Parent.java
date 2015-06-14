/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author RASCAL
 */
@Embeddable
public class Parent implements Serializable
{   
    private String PName;
    private String PSurname;
    private String email;
    private int contactNumber;

    public String getPName() {
        return PName;
    }
    public String getPSurname() {
        return PSurname;
    }
    public String getEmail() {
        return email;
    }

    public int getContactNumber() {
        return contactNumber;
    }
    public Parent()
    {
        
    }
    
    public Parent(Builder builder)
    {
        this.PName=builder.PName;
        this.PSurname=builder.PSurname;
        this.contactNumber=builder.contactNumber;
        this.email=builder.email;
        
    }   
    public static class Builder
        {
        private String PName;
        private String PSurname;
        private int contactNumber;
        private String email;
        
        public Builder(String PName)
        {
            this.PName=PName;
        }
        public Builder PSurname(String PSurname)
        {
            this.PSurname=PSurname;
            return this;
        }
        
        public Builder email(String email)
        {
            this.email=email;
            return this;
        }
        public Builder contactNumber(Integer contactNumber)
        {
            this.contactNumber=contactNumber;
            return this;
        } 
        
        public Builder copy(Builder value)
        {
        this.contactNumber=value.contactNumber;
        this.email=value.email;
        this.PName=value.PName;
        this.PSurname=value.PSurname;
        return this;
        } 
        public Parent build()
        {
            return new Parent(this);
        }
        
    }
    
}
