/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;


import educircle.domain.TimeTable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author RASCAL
 */
public class TimeTableFactory {
    // check this with your builder class
    public static TimeTable createTimeTable(String SubjectName,Date SubjectDate,
            Time SubjectTime,String SubjectVenue)
    {
        TimeTable asap = new TimeTable
                .Builder(SubjectVenue)
                .SubjectDate(SubjectDate)
                .SubjectTime(SubjectTime)
                .SubjectName(SubjectName)
                .build();
             return asap;
    }
}
