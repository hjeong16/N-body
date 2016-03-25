package nbody;


import edu.princeton.cs.In;
import edu.princeton.cs.StdDraw;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ****************************************************************************
 * Compilation: javac Universe.java Execution: java Universe dt input.txt
 * Dependencies: Body.java Vector.java StdIn.java StdDraw.java Datafiles:
 * http://www.cs.princeton.edu/introcs/34nbody/2body.txt
 * http://www.cs.princeton.edu/introcs/34nbody/3body.txt
 * http://www.cs.princeton.edu/introcs/34nbody/4body.txt
 * http://www.cs.princeton.edu/introcs/34nbody/2bodyTiny.txt
 *
 * This data-driven program simulates motion in the universe defined by the
 * standard input stream, increasing time at the rate on the command line.
 *
 * % java Universe 15000 4body.txt
 *
 *
 *****************************************************************************
 */
public class Universe extends JComponent  {
    
    private final double radius;     // radius of universe
    private final int N;             // number of bodies
    private final Body[] orbs;       // array of N bodies
   
    
    
    
    // read universe from file

    /**
     * read universe from file
     * @param fileName filename
     */
    public Universe(String fileName) {
      
        // the authors' version reads from standard input
        // our version reads from a file
        In inputStream = new In(fileName);

        // number of bodies
        N = inputStream.readInt();

        // the set scale for drawing on screen
        radius = inputStream.readDouble();
        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);

        // read in the N bodies
        orbs = new Body[N];
        for (int i = 0; i < N; i++) {
            double rx = inputStream.readDouble();
            double ry = inputStream.readDouble();
            double vx = inputStream.readDouble();
            double vy = inputStream.readDouble();
            double mass = inputStream.readDouble();
            double[] position = {rx, ry};
            double[] velocity = {vx, vy};
            String image = inputStream.readString();
            Vector r = new Vector(position);
            Vector v = new Vector(velocity);
            orbs[i] = new Body(r, v, mass, image);
        } // for
        
     
    } // Universe( String )

    // increment time by dt units, assume forces are constant in given interval

    /**
     * increment time by dt units, assume forces are constant in given interval
     * @param dt units
     */
    public void increaseTime(double dt) {

        // initialize the forces to zero
        Vector[] f = new Vector[N];
        for (int i = 0; i < N; i++) {
            f[i] = new Vector(new double[2]);
        } // for

        // compute the forces
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    f[i] = f[i].plus(orbs[i].forceFrom(orbs[j]));
                } // if
            } // for
        } // for

        // move the bodies
        for (int i = 0; i < N; i++) {
            orbs[i].move(f[i], dt);
            orbs[i].Bouncing(radius);

        } // for
    } // increaseTime( double )

   /**
     * draw the N bodies
     */
    public void draw() {
      
      
        StdDraw.clear(StdDraw.LIGHT_GRAY);
         StdDraw.picture(0, 0, "sky.png",this.radius*2.5,this.radius*2.5);
        for (int i = 0; i < N; i++) {
            orbs[i].draw();
        } // for
        
       
    } // draw()
    
  
    
    // client to simulate a universe

    /**
     * client to simulate a universe
     * @param args 4body.txt
     */
    public static void main(String[] args) {
       
//        JFrame f = new JFrame();
//    	try {
//    		f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("sky.png")))));
//    	} catch (IOException e) {
//    		e.printStackTrace();
//    	}
//    	f.pack();
//    	f.setVisible(true);
   

        
        Universe newton = new Universe(args[1]);
        double dt = Double.parseDouble(args[0]);
        
        while(true) {
            StdDraw.clear();
            newton.increaseTime(dt);
            newton.draw();
            StdDraw.show(10);

        }// while
        
//

    }
  
    }// main( String [] )

  
