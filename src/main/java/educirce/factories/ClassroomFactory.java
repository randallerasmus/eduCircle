/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Classroom;

/**
 *
 * @author RASCAL
 */
public class ClassroomFactory 
{
   
   public static Classroom createClassroom(String LearnerName,String LearnerSurname,String TeacherName)
   {
       Classroom admin = new Classroom
               .Builder(LearnerName)
               .LearnerSurname(LearnerSurname)
               .TeacherName(TeacherName)
               .build();
       return admin;
   
   }
}
