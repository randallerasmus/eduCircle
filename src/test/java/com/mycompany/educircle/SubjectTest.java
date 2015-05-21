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
public class SubjectTest extends TestCase {
    
    public SubjectTest(String testName) {
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
     * Test of getSubjectName method, of class Subject.
     */
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        Subject instance = null;
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectCode method, of class Subject.
     */
    public void testGetSubjectCode() {
        System.out.println("getSubjectCode");
        Subject instance = null;
        Integer expResult = null;
        Integer result = instance.getSubjectCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectName method, of class Subject.
     */
    public void testSubjectName() {
        System.out.println("SubjectName");
        String SubjectName = "";
        Subject instance = null;
        Subject.Builder expResult = null;
        Subject.Builder result = instance.SubjectName(SubjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectCode method, of class Subject.
     */
    public void testSubjectCode() {
        System.out.println("SubjectCode");
        Integer value = null;
        Subject instance = null;
        Subject.Builder expResult = null;
        Subject.Builder result = instance.SubjectCode(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class Subject.
     */
    public void testCopy() {
        System.out.println("copy");
        Subject value = null;
        Subject instance = null;
        Subject expResult = null;
        Subject result = instance.copy(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class Subject.
     */
    public void testBuild() {
        System.out.println("build");
        Subject instance = null;
        Subject expResult = null;
        Subject result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
