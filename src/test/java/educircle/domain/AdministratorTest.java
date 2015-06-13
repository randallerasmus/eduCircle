/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

import educirce.factories.AdministratorFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RASCAL
 */
public class AdministratorTest {
    private Object adminster;    
   @Test
    public void testCreate() throws Exception
    {
        Administrator administer = AdministratorFactory
        .createAdministrator("70291021");
        Assert.assertEquals("70291021",adminster.getEmpNo());
    }

    /**
     * Test of getId method, of class Administrator.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Administrator instance = new Administrator();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Administrator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Administrator instance = new Administrator();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Administrator.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Administrator instance = new Administrator();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Administrator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Administrator instance = new Administrator();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
