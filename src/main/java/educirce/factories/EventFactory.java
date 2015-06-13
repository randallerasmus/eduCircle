/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Demographics;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author RASCAL
 */
public class EventFactory {
    
    public static Demographics createEvent(String EventName,String EventLocation,
            Date EventDate,Time EventTime)
    {
        Demographics occur = new Demographics
                .Builder(EventName)
                .EventLocation(EventLocation)
                .EventDate(EventDate)
                .EventTime(EventTime)
                .build();
        return occur;        
    }
}
