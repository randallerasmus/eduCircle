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
public abstract class Administrator implements Person
{
    public Integer Empno;

    public Integer getEmpno() {
        return Empno;
    }

    public void setEmpno(Integer Empno) {
        this.Empno = Empno;
    }
    
}
