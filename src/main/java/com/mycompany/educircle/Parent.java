/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.educircle;

/**
 *
 * @author RASCAL
 */
public abstract class Parent implements Person
{
    public String email;
    public Integer ContactNr;
    public Integer identityNr;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContactNr() {
        return ContactNr;
    }

    public void setContactNr(Integer ContactNr) {
        this.ContactNr = ContactNr;
    }

    public Integer getIdentityNr() {
        return identityNr;
    }

    public void setIdentityNr(Integer identityNr) {
        this.identityNr = identityNr;
    }
    
}
