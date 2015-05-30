/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Student;

/**
 *
 * @author RASCAL
 */
public class StudentFactory 
{
    public static Student createStudent(String grade,int identityNr,int ContactNr,
            int postalCode)
    {
        Student studs = new Student
                .Builder(identityNr)
                .ContactNr(ContactNr)
                .grade(grade)
                .postalCode(postalCode)
                .build();
        return studs;
    }
    
}
