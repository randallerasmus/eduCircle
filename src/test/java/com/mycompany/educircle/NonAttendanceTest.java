/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.educircle;

import java.sql.Time;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class NonAttendanceTest extends TestCase {
    
    public NonAttendanceTest(String testName) {
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
     * Test of getStudentNr method, of class NonAttendance.
     */
    public void testGetStudentNr() {
        System.out.println("getStudentNr");
        NonAttendance instance = null;
        Integer expResult = null;
        Integer result = instance.getStudentNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentName method, of class NonAttendance.
     */
    public void testGetStudentName() {
        System.out.println("getStudentName");
        NonAttendance instance = null;
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectName method, of class NonAttendance.
     */
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        NonAttendance instance = null;
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbsentDate method, of class NonAttendance.
     */
    public void testGetAbsentDate() {
        System.out.println("getAbsentDate");
        NonAttendance instance = null;
        Date expResult = null;
        Date result = instance.getAbsentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbsentTime method, of class NonAttendance.
     */
    public void testGetAbsentTime() {
        System.out.println("getAbsentTime");
        NonAttendance instance = null;
        Time expResult = null;
        Time result = instance.getAbsentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StudentNr method, of class NonAttendance.
     */
    public void testStudentNr() {
        System.out.println("StudentNr");
        Integer StudentNr = null;
        NonAttendance instance = null;
        NonAttendance.Builder expResult = null;
        NonAttendance.Builder result = instance.StudentNr(StudentNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StudentName method, of class NonAttendance.
     */
    public void testStudentName() {
        System.out.println("StudentName");
        String StudentName = "";
        NonAttendance instance = null;
        NonAttendance.Builder expResult = null;
        NonAttendance.Builder result = instance.StudentName(StudentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectName method, of class NonAttendance.
     */
    public void testSubjectName() {
        System.out.println("SubjectName");
        String SubjectName = "";
        NonAttendance instance = null;
        NonAttendance.Builder expResult = null;
        NonAttendance.Builder result = instance.SubjectName(SubjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AbsentDate method, of class NonAttendance.
     */
    public void testAbsentDate() {
        System.out.println("AbsentDate");
        Date AbsentDate = null;
        NonAttendance instance = null;
        NonAttendance.Builder expResult = null;
        NonAttendance.Builder result = instance.AbsentDate(AbsentDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AbsentTime method, of class NonAttendance.
     */
    public void testAbsentTime() {
        System.out.println("AbsentTime");
        Time AbsentTime = null;
        NonAttendance instance = null;
        NonAttendance.Builder expResult = null;
        NonAttendance.Builder result = instance.AbsentTime(AbsentTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class NonAttendance.
     */
    public void testBuild() {
        System.out.println("build");
        NonAttendance instance = null;
        NonAttendance expResult = null;
        NonAttendance result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
