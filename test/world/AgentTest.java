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
public class AgentTest {
    
    public AgentTest() {
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
     * Test of getRadius method, of class Agent.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Agent fakeAgent = new Agent (new Vec2D(1,1), new Vec2D(2,2),30.5, 2);
        double expResult = 30.5;
        double result = fakeAgent.getRadius();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getPos method, of class Agent.
     */
    @Test
    public void testGetPos() {
        System.out.println("getPos");
        Agent fakeAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        Vec2D expResult = new Vec2D(1.0,1.0);
        Vec2D result = fakeAgent.getPos();
        assertEquals(expResult.getX(), result.getX(), 0.0);
        assertEquals(expResult.getY(), result.getY(), 0.0);

    }

    /**
     * Test of getDir method, of class Agent.
     */
    @Test
    public void testGetDir() {
        System.out.println("getDir");
        Agent fakeAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        Agent expAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        Vec2D expResult = expAgent.getDirToObj();       
        Vec2D result = fakeAgent.getDir();
        assertEquals( expResult.getX(), result.getX(), 0.0);
        assertEquals(expResult.getY(), result.getY(), 0.0);
    
    }

    /**
     * Test of getObj method, of class Agent.
     */
    @Test
    public void testGetObj() {
        System.out.println("getObj");
        Agent fakeAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        Vec2D expResult = new Vec2D(2,2);
        Vec2D result = fakeAgent.getObj();
        assertEquals(expResult.getX(), result.getX(), 0.0);
        assertEquals(expResult.getY(), result.getY(), 0.0);
   
    }

    /**
     * Test of setPos method, of class Agent.
     */
    @Test
    public void testSetPos() {
        System.out.println("setPos");
        Vec2D vector = new Vec2D(3,3);
        Agent fakeAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        fakeAgent.setPos(vector);
        assertEquals(vector, fakeAgent.getPos());
    }

    /**
     * Test of setObj method, of class Agent.
     */
    @Test
    public void testSetObj() {
        System.out.println("setObj");
        Vec2D vector = new Vec2D(3,3);
        Agent fakeAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        fakeAgent.setObj(vector);
        assertEquals(vector, fakeAgent.getObj());
    }

    /**
     * Test of setDir method, of class Agent.
     */
    @Test
    public void testSetDir() {
        System.out.println("setDir");
        Vec2D vector = new Vec2D(3,3);
        Agent fakeAgent = new Agent (new Vec2D(1.0,1.0), new Vec2D(2,2),30.5, 2);
        fakeAgent.setDir(vector);
        assertEquals(vector, fakeAgent.getDir());
    }

    /**
     * Test of getDirToObj method, of class Agent.
     */
    @Test
    public void testGetDirToObj() {
        System.out.println("getDirToObj");
        Agent instance = null;
        Vec2D expResult = null;
        Vec2D result = instance.getDirToObj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of objReached method, of class Agent.
     */
    @Test
    public void testObjReached() {
        System.out.println("objReached");
        Agent instance = null;
        Boolean expResult = null;
        Boolean result = instance.objReached();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Agent.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Agent instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collisionWith method, of class Agent.
     */
    @Test
    public void testCollisionWith() {
        System.out.println("collisionWith");
        Agent a = null;
        Agent instance = null;
        Boolean expResult = null;
        Boolean result = instance.collisionWith(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Agent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Agent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
