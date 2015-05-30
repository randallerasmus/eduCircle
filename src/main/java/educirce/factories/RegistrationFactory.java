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
   public static Registration createRegistration(String name,String surname,
            String race,String gender,String grade,int studentNr)
    {
        Registration register = new Registration
                .Builder(studentNr)
                .gender(gender)
                .name(name)
                .race(race)
                .surname(surname)
                .grade(grade)
                .build();
        return register;
    }
    
}
