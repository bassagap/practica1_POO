/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bassagap
 */
public class WorldTest {
    
    public WorldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getW method, of class World.
     */
    @Test
    public void testGetW() {
        System.out.println("getW");
        World instance = new World(10, 600, 200);
        int expResult = 0;
        int result = instance.getW();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getH method, of class World.
     */
    @Test
    public void testGetH() {
        System.out.println("getH");
        World instance = new World(10, 600, 200);
        int expResult = 0;
        int result = instance.getH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumAgents method, of class World.
     */
    @Test
    public void testGetNumAgents() {
        System.out.println("getNumAgents");
        World instance = new World(10, 600, 200);
        int expResult = 0;
        int result = instance.getNumAgents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgent method, of class World.
     */
    @Test
    public void testGetAgent() {
        System.out.println("getAgent");
        int i = 0;
        World instance = new World(10, 600, 200);
        Agent expResult = null;
        Agent result = instance.getAgent(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processCollisions method, of class World.
     */
    @Test
    public void testProcessCollisions() {
        System.out.println("processCollisions");
        World instance = new World(10, 600, 200);
        instance.processCollisions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class World.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        int steps = 0;
        World instance = new World(10, 600, 200);
        instance.run(steps);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
