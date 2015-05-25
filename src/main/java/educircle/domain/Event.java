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

public class Event implements Serializable
{
    private String EventName;
    private Date EventDate;
    private String EventLocation;
    private Time EventTime;
    
    private Event()
    {
    }
       
    public String getEventName() {
        return EventName;
    }

    public Date getEventDate() {
        return EventDate;
    }

    public String getEventLocation() {
        return EventLocation;
    }

    public Time getEventTime() {
        return EventTime;
    }
     public Event (Builder builder)
    {
        this.EventName=builder.EventName;
        this.EventDate=builder.EventDate;
        this.EventLocation=builder.EventLocation;
        this.EventTime=builder.EventTime;    
    }


    public static class Builder
    {
    private String EventName;
    private Date EventDate;
    private String EventLocation;
    private Time EventTime;
    
    
    public Builder (String EventName)
    {
        this.EventName = EventName;
        //return this;
    }
    
    public Builder EventDate( Date value)
    {
        this.EventDate = value;
        return this;
    }
    
    public Builder EventLocation(String value){
        this.EventLocation=value;
        return this;
    }
    
    public Builder EventTime(Time value)
    {
        this.EventTime = value;
        return this;
    }
    
    public Event copy (Event value)
    {
         this.EventName=value.EventName;
         this.EventLocation=value.EventLocation;
         this.EventDate=value.EventDate;
         this.EventTime=value.EventTime;   
         return this;
    }
      
   public Event build()
    {
        return new Event(this);
        
    }
    }
}

