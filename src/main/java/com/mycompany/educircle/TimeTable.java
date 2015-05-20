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
public class TimeTable 
{
    public String SubjectName;
    public Date SubjectDate;
    public Time SubjectTime;
    public String SubjectVenue;

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public Date getSubjectDate() {
        return SubjectDate;
    }

    public void setSubjectDate(Date SubjectDate) {
        this.SubjectDate = SubjectDate;
    }

    public Time getSubjectTime() {
        return SubjectTime;
    }

    public void setSubjectTime(Time SubjectTime) {
        this.SubjectTime = SubjectTime;
    }

    public String getSubjectVenue() {
        return SubjectVenue;
    }

    public void setSubjectVenue(String SubjectVenue) {
        this.SubjectVenue = SubjectVenue;
    }
}
