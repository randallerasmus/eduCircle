/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;
import educircle.domain.Attendance;
import java.sql.Time;
import java.util.Date;

/**                             
 *
 * @author RASCAL
 */
public class AttentdanceFactory {
   
    public static Attendance createNonAttendance(String LearnerName,String LearnerSurname,String SubjectName,
            Date AbsentDate)
    {       
            Attendance nonattend = new Attendance
                    .Builder(LearnerName)
                    .LearnerSurname(LearnerSurname)
                    .SubjectName(SubjectName)
                    .AbsentDate(AbsentDate)
                    .build();
                    return nonattend;
      }
}