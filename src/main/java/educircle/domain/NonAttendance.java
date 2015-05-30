/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.sql.Time;
import java.util.Date;
import java.io.Serializable;
/**
 *
 * @author RASCAL
 */
public class NonAttendance implements Serializable
{
    public Integer StudentNr;
    public String StudentName;
    public String SubjectName;
    public Date AbsentDate;
    public Time AbsentTime;

    public Integer getStudentNr() 
    {
        return StudentNr;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getSubjectName() 
    {
        return SubjectName;
    }

    public Date getAbsentDate() {
        return AbsentDate;
    }

    public Time getAbsentTime() {
        return AbsentTime;
    }
    public NonAttendance (Builder builder){
        this.StudentNr=builder.StudentNr;
        this.StudentName=builder.StudentName;
        this.SubjectName=builder.SubjectName;
        this.AbsentDate=builder.AbsentDate;
        this.AbsentTime=builder.AbsentTime;
    }
    public static class Builder
    {
        private Integer StudentNr;
        private String StudentName;
        private String SubjectName;
        private Date AbsentDate;
        private Time AbsentTime;
    
    
    public Builder StudentNr(Integer StudentNr)
    {
        this.StudentNr=StudentNr;
        return this;
        
    }
     public Builder StudentName(String StudentName)
    {
        this.StudentName=StudentName;
        return this;
    }
    public Builder SubjectName (String SubjectName)
    {
        this.SubjectName=SubjectName;
        return this;
    }
   
    public Builder AbsentDate (Date AbsentDate)
    {
        this.AbsentDate=AbsentDate;
        return this;
    }
    public Builder AbsentTime(Time AbsentTime)
    {
        this.AbsentTime=AbsentTime;
        return this;
    }
    public NonAttendance build()
    {
        return new NonAttendance(this);
    }
    }
}
