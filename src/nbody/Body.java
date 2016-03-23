package nbody;

import edu.princeton.cs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

/******************************************************************************
 *  Compilation:  javac Body.java
 *  Execution:    java Body
 *  Dependencies: Vector.java StdDraw.java
 *
 *  Implementation of a 2D Body with a position, velocity and mass.
 *
 *
 ******************************************************************************/

public class Body {
    private Vector r;      // position
    private Vector v;      // velocity
    private final double mass;   // mass
    private final String image;
    private final ArrayList<ArrayList> trace = new ArrayList<ArrayList>(); // arraylist
    private final int tracelength = 150;
    
    public Body(Vector r, Vector v, double mass, String image) {
        this.r = r;
        this.v = v;
        this.mass = mass;
        this.image = image;
    } // Body( Vector, Vector, double )

    public void move(Vector f, double dt) {
        Vector a = f.times(1/mass);
        v = v.plus(a.times(dt));
        r = r.plus(v.times(dt));
        ArrayList<Double> tracing = new ArrayList<Double>();
        tracing.add(r.cartesian(0));
        tracing.add(r.cartesian(1));
        trace.add(tracing);
        if (trace.size() > tracelength) {trace.remove(0);
        }
    } // move( Vector, double )

    public Vector forceFrom(Body b) {
        Body a = this;
        double G = 6.67e-11;
        Vector delta = b.r.minus(a.r);
        double dist = delta.magnitude();
        double F = (G * a.mass * b.mass) / (dist * dist);
        return delta.direction().times(F);
    } // forceFrom( Body )
    
//    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        for (int i = 0; i < N; i++)
//        {
//            double x = StdRandom.gaussian(.5, .2);
//            double y = StdRandom.gaussian(.5, .2);
//            StdDraw.point(x,y);
//        }
//    }

    public void draw() {
      for (int i =0; i< trace.size(); i++ ){
            
         double a = (double) trace.get(i).get(0);
         double b = (double) trace.get(i).get(1);
         StdDraw.setPenRadius(0.015);
         StdDraw.point(a, b); 
         
         
        }
        
        StdDraw.setPenRadius(0.03);
//        
//          StdDraw.point(r.cartesian(0), r.cartesian(0));
        StdDraw.point(r.cartesian(0), r.cartesian(1));
//        StdDraw.point(r.cartesian(1), r.cartesian(0));
//        StdDraw.point(r.cartesian(1), r.cartesian(1));
       
        StdDraw.picture(r.cartesian(0), r.cartesian(1), image,.3*10e10,.3*10e10);

        StdDraw.setPenColor(Color.getHSBColor((float) Math.random(), .8f, .8f));
       
        
    } // draw()

//     this method is only needed if you want to change the size of the bodies
//    public void draw(double penRadius) {
//        StdDraw.setPenRadius(0.005);
////  
////         StdDraw.point(r.cartesian(0), r.cartesian(0));
//        StdDraw.point(r.cartesian(0), r.cartesian(1));
////        StdDraw.point(r.cartesian(1), r.cartesian(0));
////        StdDraw.point(r.cartesian(1), r.cartesian(1));
//       
//    }// draw( double )

} 

