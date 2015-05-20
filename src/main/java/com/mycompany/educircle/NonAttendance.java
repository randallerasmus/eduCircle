/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.educircle;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author RASCAL
 */
public class NonAttendance 
{
    public Integer StudentNr;
    public String StudentName;
    public String SubjectName;
    public Date AbsentDate;
    public Time AbsentTime;

    public Integer getStudentNr() {
        return StudentNr;
    }

    public void setStudentNr(Integer StudentNr) {
        this.StudentNr = StudentNr;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public Date getAbsentDate() {
        return AbsentDate;
    }

    public void setAbsentDate(Date AbsentDate) {
        this.AbsentDate = AbsentDate;
    }

    public Time getAbsentTime() {
        return AbsentTime;
    }

    public void setAbsentTime(Time AbsentTime) {
        this.AbsentTime = AbsentTime;
    }
    
}
