/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.educircle;

import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class ResultTest extends TestCase {
    
    public ResultTest(String testName) {
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
     * Test of getStudentName method, of class Result.
     */
    public void testGetStudentName() {
        System.out.println("getStudentName");
        Result instance = null;
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectName method, of class Result.
     */
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        Result instance = null;
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentMarks method, of class Result.
     */
    public void testGetStudentMarks() {
        System.out.println("getStudentMarks");
        Result instance = null;
        Double expResult = null;
        Double result = instance.getStudentMarks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Builder method, of class Result.
     */
    public void testBuilder() {
        System.out.println("Builder");
        String StudentName = "";
        Result instance = null;
        instance.Builder(StudentName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectName method, of class Result.
     */
    public void testSubjectName() {
        System.out.println("SubjectName");
        String value = "";
        Result instance = null;
        Result.Builder expResult = null;
        Result.Builder result = instance.SubjectName(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StudentMarks method, of class Result.
     */
    public void testStudentMarks() {
        System.out.println("StudentMarks");
        Double value = null;
        Result instance = null;
        Result.Builder expResult = null;
        Result.Builder result = instance.StudentMarks(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class Result.
     */
    public void testCopy() {
        System.out.println("copy");
        Result value = null;
        Result instance = null;
        Result.Builder expResult = null;
        Result.Builder result = instance.copy(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class Result.
     */
    public void testBuild() {
        System.out.println("build");
        Result instance = null;
        Result expResult = null;
        Result result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
