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
public abstract class Student implements Person
{
    public Integer IdentityNr;
    public Integer Grade;

    public Integer getIdentityNr() {
        return IdentityNr;
    }

    public void setIdentityNr(Integer IdentityNr) {
        this.IdentityNr = IdentityNr;
    }

    public Integer getGrade() {
        return Grade;
    }

    public void setGrade(Integer Grade) {
        this.Grade = Grade;
    }
    
}
