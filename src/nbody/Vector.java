package nbody;

/******************************************************************************
 *  Compilation:  javac Vector.java
 *  Execution:    java Vector
 *
 *  Implementation of a vector of real numbers.
 *
 *  This class is implemented to be immutable: once the client program
 *  initialize a Vector, it cannot change any of its fields
 *  (N or data[i]) either directly or indirectly. Immutability is a
 *  very desirable feature of a data type.
 *
 *
 *  % java Vector
 *  x        =  (1.0, 2.0, 3.0, 4.0)
 *  y        =  (5.0, 2.0, 4.0, 1.0)
 *  x + y    =  (6.0, 4.0, 7.0, 5.0)
 *  10x      =  (10.0, 20.0, 30.0, 40.0)
 *  |x|      =  5.477225575051661
 *  <x, y>   =  25.0
 *  |x - y|  =  5.0990195135927845
 *
 *  Note that java.util.Vector is an unrelated Java library class.
 *
 ******************************************************************************/

public class Vector { 
    
    private final int N;         // length of the vector
    
    private final double[] data;       // array of vector's components

    // create the zero vector of length N

    /**
     * create the zero vector of length N
     * @param N length of the vector
     * 
     */
    public Vector(int N) {
        this.N = N;
        this.data = new double[N];
    } // Vector( int )

    /**
     *setting a bouncing function for x
     */
    public void xBouncing() {
        data[0] = data[0]*-0.5;
    } //xBouncing()
    
    /**
     *setting a bouncing function for y
     */
    public void yBouncing() {
        data[1] = data[1]*-0.5;
    } //yBouncing
    
    // create a vector from an array

    /**
     * create a vector from an array
     * @param data array of vector's components
     */
    public Vector(double[] data) {
        N = data.length;

        // defensive copy so that client can't alter our copy of data[]
        this.data = new double[N];
        for (int i = 0; i < N; i++) {
            this.data[i] = data[i];
        } // for
    } // Vector( double [] )

    // create a vector from either an array or a vararg list
    // this constructor uses Java's vararg syntax to support
    // a constructor that takes a variable number of arguments, such as
    // Vector x = new Vector(1.0, 2.0, 3.0, 4.0);
    // Vector y = new Vector(5.0, 2.0, 4.0, 1.0);
/*
    public Vector(double... data) {
        N = data.length;

        // defensive copy so that client can't alter our copy of data[]
        this.data = new double[N];
        for (int i = 0; i < N; i++)
            this.data[i] = data[i];
    }
*/
    // return the length of the vector

    /**
     *
     * @return the length of the vector
     */
    public int length() {
        return N;
    } // length()

    // return the inner product of this Vector a and b

    /**
     *
     * @param that
     * @return the inner product of this Vector a and b
     */
    public double dot(Vector that) {
        if (this.N != that.N) {
            throw new RuntimeException("Dimensions don't agree");
        } // if
        
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum = sum + (this.data[i] * that.data[i]);
        return sum;
    } // dot( Vector )

    // return the Euclidean norm of this Vector

    /**
     * 
     * @return the Euclidean norm of this Vector
     */
    public double magnitude() {
        return Math.sqrt(this.dot(this));
    } // magnitude()

    // return the Euclidean distance between this and that

    /**
     *
     * @param that
     * @return the Euclidean distance between this and that
     */
    public double distanceTo(Vector that) {
        if (this.N != that.N) {
            throw new RuntimeException("Dimensions don't agree");
        } // if
        
        return this.minus(that).magnitude();
    } // distanceTo( Vector )

    // return this + that

    /**
     * 
     * @param that
     * @return this + that
     */
    public Vector plus(Vector that) {
        if (this.N != that.N) {
            throw new RuntimeException("Dimensions don't agree");
        } // if
        
        Vector c = new Vector(N);
        for (int i = 0; i < N; i++)
            c.data[i] = this.data[i] + that.data[i];
        return c;
    } // plus( Vector )

    // return this - that

    /**
     *
     * @param that
     * @return this - that
     */
    public Vector minus(Vector that) {
        if (this.N != that.N) {
            throw new RuntimeException("Dimensions don't agree");
        } // if
        
        Vector c = new Vector(N);
        for (int i = 0; i < N; i++)
            c.data[i] = this.data[i] - that.data[i];
        return c;
    } // minus( Vector )

    // return the corresponding coordinate

    /**
     *
     * @param i
     * @return the corresponding coordinate
     */
    public double cartesian(int i) {
        return data[i];
    } // cartesian( int )

    // create and return a new object whose value is (this * factor)

    /**
     *
     * @param factor
     * @return a new object whose value is (this * factor)
     */
    public Vector times(double factor) {
        Vector c = new Vector(N);
        for (int i = 0; i < N; i++)
            c.data[i] = factor * data[i];
        return c;
    } // times( double )


    // return the corresponding unit vector

    /**
     *
     * @return the corresponding unit vector
     */
    public Vector direction() {
        if (this.magnitude() == 0.0) {
            throw new RuntimeException("Zero-vector has no direction");
        } // if
        
        return this.times(1.0 / this.magnitude());
    } // direction()

    // return a string representation of the vector
     /**
     *
     * @return a string representation of the vector
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("(");
        for (int i = 0; i < N; i++) {
            s.append(data[i]);
            if (i < N-1) s.append(", ");
        } // for
        s.append(")");
        return s.toString();
    } // toString()


    // test client

    /**
     * test client
     * @param args
     */
    public static void main(String[] args) {
        double[] xdata = { 1.0, 2.0, 3.0, 4.0 };
        double[] ydata = { 5.0, 2.0, 4.0, 1.0 };

        Vector x = new Vector(xdata);
        Vector y = new Vector(ydata);

        System.out.println("x        =  " + x);
        System.out.println("y        =  " + y);
        System.out.println("x + y    =  " + x.plus(y));
        System.out.println("10x      =  " + x.times(10.0));
        System.out.println("|x|      =  " + x.magnitude());
        System.out.println("<x, y>   =  " + x.dot(y));
        System.out.println("|x - y|  =  " + x.minus(y).magnitude());
    } // main( String [] )
} // Vector
