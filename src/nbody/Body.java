package nbody;

import edu.princeton.cs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

/**
 * ****************************************************************************
 * Compilation: javac Body.java Execution: java Body Dependencies: Vector.java
 * StdDraw.java
 *
 * Implementation of a 2D Body with a position, velocity and mass.
 *
 *@see <a href="https://en.wikipedia.org/wiki/N-body_simulation">https://en.wikipedia.org/wiki/N-body_simulation </a>
 *****************************************************************************
 */
public class Body {

    private Vector r;      // position
    private Vector v;      // velocity
    private final double mass;   // mass
    private final String image;
    private final ArrayList<ArrayList> trace = new ArrayList<ArrayList>(); // arraylist
    private final int tracelength = 30;
    
    /**
     *
     * @param r position
     * @param v velocity
     * @param mass mass
     * @param image image
     */
    public Body(Vector r, Vector v, double mass, String image) {
        this.r = r;
        this.v = v;
        this.mass = mass;
        this.image = image;
    } // Body( Vector, Vector, double, String )

    /**
     * adding a trace function by using ArrayList
     * @param f vector
     * @param dt increment time by dt units
     */
    public void move(Vector f, double dt) {
        Vector a = f.times(1 / mass);
        v = v.plus(a.times(dt));
        r = r.plus(v.times(dt));
        ArrayList<Double> tracing = new ArrayList<Double>();
        tracing.add(r.cartesian(0));
        tracing.add(r.cartesian(1));
        trace.add(tracing);
        if (trace.size() > tracelength) {
            trace.remove(0);
        }  // add a trace function
        
        
    } // move( Vector, double )

    /**
     *
     * @param b
     * 
     */
    public Vector forceFrom(Body b) {
        Body a = this;
        double G = 6.67e-11;
        Vector delta = b.r.minus(a.r);
        double dist = delta.magnitude();
        double F = (G * a.mass * b.mass) / (dist * dist);
        return delta.direction().times(F);
    } // forceFrom( Body )
    
  
    /**
     * setting a boundary to bounce the objects back
     * @param boundary edges
     */
      public void Bouncing (double boundary) {
        double x = r.cartesian(0);
        double y = r.cartesian(1);
       
        if(x >= boundary  && v.cartesian(0) > 0) {
            v.xBouncing();   
        }
        if(x <= -boundary  && v.cartesian(0) < 0) {
            v.xBouncing();
        }
        if(y >= boundary  && v.cartesian(1) > 0) {
            v.yBouncing();
        }
        if(y <= -boundary  && v.cartesian(1) < 0) {
            v.yBouncing();
        }
        
    } //Bouncing (double)
    
    
    /**
     * drawing a trail
     * setting pictures instead of dots
     * setting a random color for dots
     */
    public void draw() {
        
        for (int i = 0; i < trace.size() - 1; i++) {

            double a = (double) trace.get(i).get(0);
            double b = (double) trace.get(i).get(1);
            double c = (double) trace.get((i+1)).get(0);
            double d = (double) trace.get((i+1)).get(1);
            StdDraw.setPenRadius(Math.random()*0.02);
            StdDraw.line(a, b, c, d);
        } //draw()

       
        StdDraw.picture(r.cartesian(0), r.cartesian(1), image, .09 * 10e10, .09 * 10e10);

        StdDraw.setPenColor(Color.getHSBColor((float) Math.random(), .8f, .8f));

     
    } // draw()

} // Body{}
