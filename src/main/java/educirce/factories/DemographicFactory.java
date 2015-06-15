/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Demographics;
import java.util.Date;

/**
 *
 * @author RASCAL
 */
public class DemographicFactory 
{  
    public static Demographics createDemographic(String race,Date dateOfBirth,String gender)
    {
        Demographics demo = new Demographics
                .Builder(race)
                .dateOfBirth(dateOfBirth)
                .gender(gender)
                .build();
         return demo;
    }
    
}
