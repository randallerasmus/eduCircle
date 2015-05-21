/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Tests;

import educircle.domain.TimeTable;
import educircle.domain.Subject;
import java.sql.Time;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class TimeTableTest extends TestCase {
    
    public TimeTableTest(String testName) {
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
     * Test of getSubjectName method, of class TimeTable.
     */
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        TimeTable instance = null;
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectDate method, of class TimeTable.
     */
    public void testGetSubjectDate() {
        System.out.println("getSubjectDate");
        TimeTable instance = null;
        Date expResult = null;
        Date result = instance.getSubjectDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectTime method, of class TimeTable.
     */
    public void testGetSubjectTime() {
        System.out.println("getSubjectTime");
        TimeTable instance = null;
        Time expResult = null;
        Time result = instance.getSubjectTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectVenue method, of class TimeTable.
     */
    public void testGetSubjectVenue() {
        System.out.println("getSubjectVenue");
        TimeTable instance = null;
        String expResult = "";
        String result = instance.getSubjectVenue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectVenue method, of class TimeTable.
     */
    public void testSubjectVenue() {
        System.out.println("SubjectVenue");
        String value = "";
        TimeTable instance = null;
        TimeTable.Builder expResult = null;
        TimeTable.Builder result = instance.SubjectVenue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectDate method, of class TimeTable.
     */
    public void testSubjectDate() {
        System.out.println("SubjectDate");
        Date value = null;
        TimeTable instance = null;
        TimeTable.Builder expResult = null;
        TimeTable.Builder result = instance.SubjectDate(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectName method, of class TimeTable.
     */
    public void testSubjectName() {
        System.out.println("SubjectName");
        String value = "";
        TimeTable instance = null;
        TimeTable.Builder expResult = null;
        TimeTable.Builder result = instance.SubjectName(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubjectTime method, of class TimeTable.
     */
    public void testSubjectTime() {
        System.out.println("SubjectTime");
        Time value = null;
        TimeTable instance = null;
        TimeTable.Builder expResult = null;
        TimeTable.Builder result = instance.SubjectTime(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class TimeTable.
     */
    public void testCopy() {
        System.out.println("copy");
        TimeTable value = null;
        TimeTable instance = null;
        TimeTable expResult = null;
        TimeTable result = instance.copy(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class TimeTable.
     */
    public void testBuild() {
        System.out.println("build");
        TimeTable instance = null;
        Subject expResult = null;
        Subject result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
