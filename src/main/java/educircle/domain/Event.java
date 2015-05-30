/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RASCAL
 */
@Entity
    public class Event implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String EventName;
    private String EventLocation;
    private Date EventDate;
    private Time EventTime;

    public String getEventName() {
        return EventName;
    }

    public String getEventLocation() {
        return EventLocation;
    }

    public Date getEventDate() {
        return EventDate;
    }

    public Time getEventTime() {
        return EventTime;
    }

   
    public Long getId() {
        return id;
    }

    public Event ()
    {
        
    }
    public Event (Builder builder){
        this.id=builder.id;
        this.EventName=builder.EventName;
        this.EventDate=builder.EventDate;
        this.EventLocation=builder.EventLocation;
        this.EventTime=builder.EventTime;
     
        
    }

    public void EventBuilder(String EventName, String EventLocation, Date EventDate, Time EventTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void EventBuilder(String EventName, String EventLocation, Date EventDate, Time EventTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static class Builder
    {
        private String EventName;
        private Long id;
        private Date EventDate;
        private String EventLocation;
        private Time EventTime;
        
    
    
    public Builder (String EventName)
    {
        this.EventName=EventName;
              
    }
    
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Builder EventDate (Date value)
    {
        this.EventDate=value;
        return this;
    }
    public Builder EventLocation(String value)
    {
        this.EventLocation=value;
        return this;
    }
    public Builder EventTime(Time value)
    {
        this.EventTime=value;
        return this;
    }
     public Builder copy (Builder value){
        this.id=value.id;
        this.EventName=value.EventName;
        this.EventTime=value.EventTime;
        this.EventLocation=value.EventLocation;
        this.EventDate=value.EventDate;
     return this;
        
    }
    public Event build()
    {
        return new Event(this);
    }
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Subject[ id=" + id + " ]";
    }
    
}
