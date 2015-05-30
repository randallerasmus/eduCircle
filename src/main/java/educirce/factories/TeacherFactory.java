/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Teacher;

/**
 *
 * @author RASCAL
 */
public class TeacherFactory 
{
    public static Teacher createTeacher(String subjectTitle,int ContactNr)
    {
        Teacher educators = new Teacher
                .Builder(subjectTitle)
                .ContactNr(ContactNr)
                .build();
        return educators;
    }
    
}
