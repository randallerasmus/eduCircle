/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;
import educircle.domain.Parent;
/**
 *
 * @author RASCAL
 */
public class ParentFactory 
{
    public static Parent createParent(String email,String PName,String PSurname,int contactNumber)
    {
        Parent par = new Parent
                .Builder(PName)
                .PSurname(PSurname)
                .contactNumber(contactNumber)
                .email(email)
                .build();
           return par;
                }
    }
