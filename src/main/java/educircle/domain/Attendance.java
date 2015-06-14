/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.sql.Time;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.Embeddable;
/**
 *
 * @author RASCAL
 */
@Embeddable
public class Attendance implements Serializable
{
    public String LearnerName;
    public String LearnerSurname;
    public String SubjectName;
    public Date AbsentDate;

    public Attendance() {
    }

    public String getLearnerName() {
        return LearnerName;
    }

    public String getLearnerSurname() {
        return LearnerSurname;
    }
    public String getSubjectName() 
    {
        return SubjectName;
    }

    public Date getAbsentDate() {
        return AbsentDate;
    }

   
    public Attendance (Builder builder){
       this.LearnerName=builder.LearnerName;
       this.LearnerSurname=builder.LearnerSurname;
        this.SubjectName=builder.SubjectName;
        this.AbsentDate=builder.AbsentDate;
     
    }
    public static class Builder
    {
        private String SubjectName;
        private Date AbsentDate;
        private String LearnerName;
        private String LearnerSurname;
      
    
    
    public Builder (String LearnerName)
    {
        this.LearnerName=LearnerName;
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
    public Builder LearnerSurname(String LearnerSurname)
    {
        this.LearnerSurname=LearnerSurname;
        return this;
    }
   
    public Builder copy (Builder value){
        this.SubjectName=value.SubjectName;
        this.AbsentDate=value.AbsentDate;
        this.LearnerName=value.LearnerName;
        this.LearnerSurname=value.LearnerSurname;
        return this;
    }
    public Attendance build()
    {
        return new Attendance(this);
    }
    }
}
