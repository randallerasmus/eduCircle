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
    public Integer LearnerNumber;
    public String SubjectName;
    public Date AbsentDate;
   

    public Attendance() {
    }

    public Integer getLearnerNumber() 
    {
        return LearnerNumber;
    }

    public String getSubjectName() 
    {
        return SubjectName;
    }

    public Date getAbsentDate() {
        return AbsentDate;
    }

   
    public Attendance (Builder builder){
        this.LearnerNumber=builder.LearnerNumber;
        this.SubjectName=builder.SubjectName;
        this.AbsentDate=builder.AbsentDate;
     
    }
    public static class Builder
    {
        private Integer LearnerNumber;
        private String SubjectName;
        private Date AbsentDate;
      
    
    
    public Builder (Integer LearnerNumber)
    {
        this.LearnerNumber=LearnerNumber;
       
        
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
   
    public Builder copy (Builder value){
        this.LearnerNumber=value.LearnerNumber;
        this.SubjectName=value.SubjectName;
        this.AbsentDate=value.AbsentDate;
        return this;
    }
    public Attendance build()
    {
        return new Attendance(this);
    }
    }
}
