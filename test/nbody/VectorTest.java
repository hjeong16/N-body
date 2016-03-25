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
//        instance.xBouncing();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of yBouncing method, of class Vector.
     */
    @Test
    public void testYBouncing() {
        System.out.println("yBouncing");
        Vector instance = null;
//        instance.yBouncing();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of length method, of class Vector.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector instance = new Vector(5);
        int expResult = 5;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of dot method, of class Vector.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vector that = new Vector(new double[] {1});
        Vector instance = new Vector(new double[] {2});
        double expResult = 2;
        double result = instance.dot(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of magnitude method, of class Vector.
     */
    @Test
    public void testMagnitude() {
        Vector instance = new Vector(new double[] {2.0});
        double expResult = 2.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of distanceTo method, of class Vector.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        Vector that = new Vector(new double[] {2.0});
        Vector instance = new Vector(new double[] {3.0});
        double expResult = 1.0;
        double result = instance.distanceTo(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of plus method, of class Vector.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vector that = new Vector(new double[] {4});
        Vector instance = new Vector(new double[] {3});
        Vector expResult = new Vector(new double[] {7});
        Vector result = instance.plus(that);
        assertEquals(expResult.cartesian(0), result.cartesian(0), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of minus method, of class Vector.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vector that = new Vector(new double[] {4.0});
        Vector instance = new Vector(new double[] {3.0});
        Vector expResult = new Vector(new double[] {-1.0});
        Vector result = instance.minus(that);
        assertEquals(expResult.cartesian(0), result.cartesian(0), 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of cartesian method, of class Vector.
     */
    @Test
    public void testCartesian() {
        System.out.println("cartesian");
        int i = 0;
        Vector instance = new Vector(new double[] {3.0});
        double expResult = 3.0;
        double result = instance.cartesian(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of times method, of class Vector.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        double factor = 1.0;
        Vector instance = new Vector(new double[] {2});
        Vector expResult = new Vector(new double[] {2.0});
        Vector result = instance.times(factor);
        assertEquals(expResult.cartesian(0), result.cartesian(0), 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of direction method, of class Vector.
     */
    @Test
    public void testDirection() {
        System.out.println("direction");
        Vector instance = new Vector(new double[] {2});
        Vector expResult = new Vector(new double[] {1.00});
        Vector result = instance.direction();
        assertEquals(expResult.cartesian(0), result.cartesian(0), 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of toString method, of class Vector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector instance = new Vector(1);
        String expResult = "(0.0)";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
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
       
    }
    
}
