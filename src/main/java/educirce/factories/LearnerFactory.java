/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Learner;

/**
 *
 * @author RASCAL
 */
public class LearnerFactory 
{
    public static Learner createLearner(String LearnerName,int LearnerIdNumber,String LearnerSurname)
            
    {
        Learner studs = new Learner
                .Builder(LearnerIdNumber)
                .LearnerName(LearnerName)
                .LearnerSurname(LearnerSurname)
                .build();
        return studs;
    }
    
}
