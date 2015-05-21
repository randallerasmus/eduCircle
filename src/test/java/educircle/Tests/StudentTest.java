/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Tests;

import educircle.domain.Student;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
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
     * Test of getidentityNr method, of class Student.
     */
    public void testGetidentityNr() {
        System.out.println("getidentityNr");
        Student instance = null;
        Integer expResult = null;
        Integer result = instance.getidentityNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrade method, of class Student.
     */
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = null;
        Integer expResult = null;
        Integer result = instance.getGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StudentImpl extends Student {

        public StudentImpl() {
            super(null);
        }
    }
    
}
