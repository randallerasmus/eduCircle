/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Registration;

/**
 *
 * @author RASCAL
 */
public class RegistrationFactory 
{
    
   public static Registration createRegistration(String LearnerName,String LearnerSurname,
            String ParentEmail,String grade,int LearnerIdNumber)
    {
        Registration register = new Registration
                .Builder(LearnerIdNumber)
                .LearnerName(LearnerName)
                .LearnerSurname(LearnerSurname)
                .ParentEmail(ParentEmail)
                .grade(grade)
                .build();
        return register;
    }
    
}
