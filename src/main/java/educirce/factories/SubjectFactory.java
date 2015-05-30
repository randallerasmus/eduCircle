/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Subject;

/**
 *
 * @author RASCAL
 */
public class SubjectFactory 
{   
    public static Subject createSubject(String subjectName,int subjectCode)
    {
        Subject subs = new Subject
                .Builder(subjectName)
                .subjectCode(subjectCode)
                .build();
         return subs;
    }
    
}
