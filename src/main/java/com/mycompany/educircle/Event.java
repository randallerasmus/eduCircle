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
public class Event 
{
    public String EventName;
    public Date EventDate;
    public String EventLocation;
    public Time EventTime;

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public Date getEventDate() {
        return EventDate;
    }

    public void setEventDate(Date EventDate) {
        this.EventDate = EventDate;
    }

    public String getEventLocation() {
        return EventLocation;
    }

    public void setEventLocation(String EventLocation) {
        this.EventLocation = EventLocation;
    }

    public Time getEventTime() {
        return EventTime;
    }

    public void setEventTime(Time EventTime) {
        this.EventTime = EventTime;
    }
    
}
