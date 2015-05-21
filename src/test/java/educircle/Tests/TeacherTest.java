/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Tests;

import educircle.domain.Teacher;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class TeacherTest extends TestCase {
    
    public TeacherTest(String testName) {
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
     * Test of getSubjectTitle method, of class Teacher.
     */
    public void testGetSubjectTitle() {
        System.out.println("getSubjectTitle");
        Teacher instance = null;
        String expResult = "";
        String result = instance.getSubjectTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactNr method, of class Teacher.
     */
    public void testGetContactNr() {
        System.out.println("getContactNr");
        Teacher instance = null;
        Integer expResult = null;
        Integer result = instance.getContactNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectTitle method, of class Teacher.
     */
    public void testSubjectTitle() {
        System.out.println("SubjectTitle");
        String value = "";
        Teacher instance = null;
        Teacher.Builder expResult = null;
        Teacher.Builder result = instance.SubjectTitle(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ContactNr method, of class Teacher.
     */
    public void testContactNr() {
        System.out.println("ContactNr");
        Integer value = null;
        Teacher instance = null;
        Teacher.Builder expResult = null;
        Teacher.Builder result = instance.ContactNr(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class Teacher.
     */
    public void testCopy() {
        System.out.println("copy");
        Teacher value = null;
        Teacher instance = null;
        Teacher expResult = null;
        Teacher result = instance.copy(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class Teacher.
     */
    public void testBuild() {
        System.out.println("build");
        Teacher instance = null;
        Teacher expResult = null;
        Teacher result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
