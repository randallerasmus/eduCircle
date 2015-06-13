/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Contact;

/**
 *
 * @author RASCAL
 */
public class AdministratorFactory 
{
   public static Contact createAdministrator(int Empno)
   {
       Contact admin = new Contact
               .Builder(Empno)
               .build();
       return admin;
   
   }
}
