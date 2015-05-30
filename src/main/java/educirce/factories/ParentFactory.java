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
    public static Parent creatParent(String email,int identityNr,int ContactNr)
    {
        Parent par = new Parent
                .Builder(email)
                .ContactNr(ContactNr)
                .identityNr(identityNr)
                .build();
           return par;
                }
    }
