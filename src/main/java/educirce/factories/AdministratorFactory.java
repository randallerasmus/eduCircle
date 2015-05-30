/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Administrator;

/**
 *
 * @author RASCAL
 */
public class AdministratorFactory 
{
   public static Administrator createAdministrator(int Empno)
   {
       Administrator admin = new Administrator
               .Builder(Empno)
               .build();
       return admin;
   
   }
}
