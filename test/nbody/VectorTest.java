/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernandez
 */
public class VectorTest {
    
    public VectorTest() {
    }

    /**
     * Test of xBouncing method, of class Vector.
     */
    @Test
    public void testXBouncing() {
        System.out.println("xBouncing");
        Vector instance = null;
        instance.xBouncing();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of yBouncing method, of class Vector.
     */
    @Test
    public void testYBouncing() {
        System.out.println("yBouncing");
        Vector instance = null;
        instance.yBouncing();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class Vector.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector instance = null;
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dot method, of class Vector.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vector that = null;
        Vector instance = null;
        double expResult = 0.0;
        double result = instance.dot(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of magnitude method, of class Vector.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector instance = null;
        double expResult = 0.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distanceTo method, of class Vector.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        Vector that = null;
        Vector instance = null;
        double expResult = 0.0;
        double result = instance.distanceTo(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class Vector.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vector that = null;
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.plus(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class Vector.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vector that = null;
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.minus(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cartesian method, of class Vector.
     */
    @Test
    public void testCartesian() {
        System.out.println("cartesian");
        int i = 0;
        Vector instance = null;
        double expResult = 0.0;
        double result = instance.cartesian(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class Vector.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        double factor = 0.0;
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.times(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of direction method, of class Vector.
     */
    @Test
    public void testDirection() {
        System.out.println("direction");
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.direction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Vector.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vector.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}