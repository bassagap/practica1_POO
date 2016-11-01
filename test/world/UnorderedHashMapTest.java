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
 * @author ivo
 */
public class UnorderedHashMapTest {
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
    
    
    @Test
    public void testIntPairs() {
        System.out.println("Check some int pairs");
        UnorderedHashMap<Integer,Integer> map = new UnorderedHashMap<>();
        map.put(12, 2);
        map.put(2, 8);
        assertTrue(map.containsPair(2,12));
        assertTrue(map.containsPair(12,2));
        map.removePair(2, 12);
        assertFalse(map.containsPair(12,2));
        assertFalse(map.containsPair(2,12));
        
    }
}
