/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Event;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author RASCAL
 */
public class EventFactory {
    
    public static Event createEvent(String EventName,String EventLocation,
            Date EventDate,Time EventTime)
    {
        Event occur = new Event
                .Builder(EventName)
                .EventLocation(EventLocation)
                .EventDate(EventDate)
                .EventTime(EventTime)
                .build();
        return occur;        
    }
}
