/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Tests;

import educircle.domain.Parent;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class ParentTest extends TestCase {
    
    public ParentTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getEmail method, of class Parent.
     */
    public void testGetEmail() {
        System.out.println("getEmail");
        Parent instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactNr method, of class Parent.
     */
    public void testGetContactNr() {
        System.out.println("getContactNr");
        Parent instance = null;
        Integer expResult = null;
        Integer result = instance.getContactNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentityNr method, of class Parent.
     */
    public void testGetIdentityNr() {
        System.out.println("getIdentityNr");
        Parent instance = null;
        Integer expResult = null;
        Integer result = instance.getIdentityNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
