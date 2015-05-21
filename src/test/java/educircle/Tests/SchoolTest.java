/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Tests;

import educircle.domain.School;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class SchoolTest extends TestCase {
    
    public SchoolTest(String testName) {
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
     * Test of getName method, of class School.
     */
    public void testGetName() {
        System.out.println("getName");
        School instance = new School();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class School.
     */
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        School instance = new School();
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class School.
     */
    public void testGetSurname() {
        System.out.println("getSurname");
        School instance = new School();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class School.
     */
    public void testSetSurname() {
        System.out.println("setSurname");
        String Surname = "";
        School instance = new School();
        instance.setSurname(Surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRace method, of class School.
     */
    public void testGetRace() {
        System.out.println("getRace");
        School instance = new School();
        String expResult = "";
        String result = instance.getRace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRace method, of class School.
     */
    public void testSetRace() {
        System.out.println("setRace");
        String Race = "";
        School instance = new School();
        instance.setRace(Race);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class School.
     */
    public void testGetGender() {
        System.out.println("getGender");
        School instance = new School();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class School.
     */
    public void testSetGender() {
        System.out.println("setGender");
        String Gender = "";
        School instance = new School();
        instance.setGender(Gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrade method, of class School.
     */
    public void testGetGrade() {
        System.out.println("getGrade");
        School instance = new School();
        String expResult = "";
        String result = instance.getGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrade method, of class School.
     */
    public void testSetGrade() {
        System.out.println("setGrade");
        String Grade = "";
        School instance = new School();
        instance.setGrade(Grade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentNr method, of class School.
     */
    public void testGetStudentNr() {
        System.out.println("getStudentNr");
        School instance = new School();
        Integer expResult = null;
        Integer result = instance.getStudentNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentNr method, of class School.
     */
    public void testSetStudentNr() {
        System.out.println("setStudentNr");
        Integer StudentNr = null;
        School instance = new School();
        instance.setStudentNr(StudentNr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
