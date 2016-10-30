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
public class Vec2DTest {
    
    public Vec2DTest() {
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
     * Test of setX method, of class Vec2D.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        double x_ = 0.0;
        Vec2D instance = new Vec2D();
        instance.setX(x_);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Vec2D.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        double y_ = 0.0;
        Vec2D instance = new Vec2D();
        instance.setY(y_);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Vec2D.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Vec2D instance = new Vec2D();
        double expResult = 0.0;
        double result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Vec2D.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Vec2D instance = new Vec2D();
        double expResult = 0.0;
        double result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Vec2D.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Vec2D v = null;
        Vec2D instance = new Vec2D();
        instance.sum(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class Vec2D.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vec2D v = null;
        Vec2D instance = new Vec2D();
        instance.minus(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dist method, of class Vec2D.
     */
    @Test
    public void testDist() {
        System.out.println("dist");
        Vec2D v = null;
        Vec2D instance = new Vec2D();
        double expResult = 0.0;
        double result = instance.dist(v);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of normalize method, of class Vec2D.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        Vec2D instance = new Vec2D();
        instance.normalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class Vec2D.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        double angle = 0.0;
        Vec2D instance = new Vec2D();
        instance.rotate(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of angle method, of class Vec2D.
     */
    @Test
    public void testAngle() {
        System.out.println("angle");
        Vec2D v = null;
        Vec2D instance = new Vec2D();
        double expResult = 0.0;
        double result = instance.angle(v);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotateInDirectionOf method, of class Vec2D.
     */
    @Test
    public void testRotateInDirectionOf() {
        System.out.println("rotateInDirectionOf");
        Vec2D v = null;
        Vec2D instance = new Vec2D();
        instance.rotateInDirectionOf(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vec2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vec2D instance = new Vec2D();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
