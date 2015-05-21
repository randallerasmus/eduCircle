/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Tests;

import educircle.domain.Event;
import java.sql.Time;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author RASCAL
 */
public class EventTest extends TestCase {
    
    public EventTest(String testName) {
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
     * Test of getEventName method, of class Event.
     */
    public void testGetEventName() {
        System.out.println("getEventName");
        Event instance = null;
        String expResult = "";
        String result = instance.getEventName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventDate method, of class Event.
     */
    public void testGetEventDate() {
        System.out.println("getEventDate");
        Event instance = null;
        Date expResult = null;
        Date result = instance.getEventDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventLocation method, of class Event.
     */
    public void testGetEventLocation() {
        System.out.println("getEventLocation");
        Event instance = null;
        String expResult = "";
        String result = instance.getEventLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventTime method, of class Event.
     */
    public void testGetEventTime() {
        System.out.println("getEventTime");
        Event instance = null;
        Time expResult = null;
        Time result = instance.getEventTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EventBuilder method, of class Event.
     */
    public void testEventBuilder() {
        System.out.println("EventBuilder");
        String EventName = "";
        String EventLocation = "";
        Date EventDate = null;
        Time EventTime = null;
        Event instance = null;
        instance.EventBuilder(EventName, EventLocation, EventDate, EventTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
