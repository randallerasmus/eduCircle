/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author RASCAL
 */
@Embeddable
public class TimeTable implements Serializable
{
    public String SubjectName;
    public Date SubjectDate;
    public Time SubjectTime;
    public String SubjectVenue;

    public TimeTable() {
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public Date getSubjectDate() {
        return SubjectDate;
    }

    public Time getSubjectTime() {
        return SubjectTime;
    }

    public String getSubjectVenue() {
        return SubjectVenue;
    }
    public TimeTable (Builder builder)
    {
        this.SubjectVenue=builder.SubjectVenue;
        this.SubjectName=builder.SubjectName;
        this.SubjectDate=builder.SubjectDate;
        this.SubjectTime=builder.SubjectTime;    
    }


    public static class Builder
    {
    private String SubjectVenue;
    private Date SubjectDate;
    private String SubjectName;
    private Time SubjectTime;
    
    
    public Builder (String SubjectVenue)
    {
        this.SubjectVenue = SubjectVenue;
        
    }
    
    public Builder SubjectDate( Date value)
    {
        this.SubjectDate = value;
        return this;
    }
    
    public Builder SubjectName(String value){
        this.SubjectName=value;
        return this;
    }
    
    public Builder SubjectTime(Time value)
    {
        this.SubjectTime = value;
        return this;
    }

    public Builder copy (TimeTable value)
    {
         this.SubjectVenue=value.SubjectVenue;
        this.SubjectName=value.SubjectName;
        this.SubjectDate=value.SubjectDate;
        this.SubjectTime=value.SubjectTime;    
         return this;
    }
      
   public TimeTable build()
    {
        return new TimeTable(this);
        
    }
    }
}
