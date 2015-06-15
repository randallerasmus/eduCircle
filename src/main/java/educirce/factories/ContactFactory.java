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
public class ContactFactory 
{   
    
    public static Contact createContact(String cellNumber,String homeNumber)
    {
        Contact subs = new Contact
                .Builder(cellNumber)
                .homeNumber(homeNumber)
                .build();
         return subs;
    }
    
}
