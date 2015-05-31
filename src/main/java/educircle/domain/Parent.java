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
    private String email;
    private int ContactNr;
    private int identityNr;

    public String getEmail() {
        return email;
    }

    public int getContactNr() {
        return ContactNr;
    }

    public int getIdentityNr() {
        return identityNr;
    }
    
    public Parent()
    {
        
    }
    
    public Parent(Builder builder)
    {
        this.ContactNr=builder.ContactNr;
        this.email=builder.email;
        this.identityNr=builder.identityNr;
    }   
    public static class Builder
            {
        private int ContactNr;
        private String email;
        private int identityNr;
        
        
        public Builder(Integer idenityNr)
        {
            this.identityNr=identityNr;
        }
        
        public Builder email(String email)
        {
            this.email=email;
            return this;
        }
        public Builder ContactNr(Integer ContactNr)
        {
            this.ContactNr=ContactNr;
            return this;
        } 
        
        public Builder copy(Builder value)
        {
        this.ContactNr=value.ContactNr;
        this.email=value.email;
        this.identityNr=value.identityNr;
        return this;
        } 
        public Parent build()
        {
            return new Parent(this);
        }
        
    }
    
}
