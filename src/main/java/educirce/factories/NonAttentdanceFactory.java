/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;
import educircle.domain.NonAttendance;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author RASCAL
 */
public class NonAttentdanceFactory {
    
    public static NonAttendance createNonAttendance(int StudentNr,String StudentName,String SubjectName,
            Date AbsentDate,Time AbsentTime)
    {       
            NonAttendance nonattend = new NonAttendance
                    .Builder(StudentNr)
                    .StudentName(StudentName)
                    .SubjectName(SubjectName)
                    .AbsentDate(AbsentDate)
                    .AbsentTime(AbsentTime)
                    .build();
                    return nonattend;
  
    }
    
}
