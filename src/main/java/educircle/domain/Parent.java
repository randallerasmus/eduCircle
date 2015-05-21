/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

/**
 *
 * @author RASCAL
 */

public class Parent implements Person
{
    public String email;
    public Integer ContactNr;
    public Integer identityNr;

    public String getEmail() {
        return email;
    }

    public Integer getContactNr() {
        return ContactNr;
    }

    public Integer getIdentityNr() {
        return identityNr;
    }
    public Parent(Builder builder) { 
         this.email=builder.email; 
         this.ContactNr=builder.ContactNr; 
        this.identityNr=builder.identityNr; 
     } 
 
 
     public static class Builder{ 
         private String email;
         private Integer ContactNr;
         private Integer identityNr;
       
 
 
         public Builder email(String email) { 
             this.email = email; 
             return this; 
         } 
 
 
         public Builder ContactNr(Integer value){ 
             this.ContactNr=value; 
             return this; 
         } 
 
 
         public Builder identityNr(Integer value){ 
             this.identityNr=value; 
             return this; 
         } 
  
         public Builder copy(Parent value){ 
             this.email=value.email; 
             this.ContactNr=value.ContactNr; 
             this.identityNr=value.identityNr; 
           
             return this; 
         } 
 
 
         public Parent build(){ 
             return new Parent(this); 
         } 
 
 
     } 
 } 

    

