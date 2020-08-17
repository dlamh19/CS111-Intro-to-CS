/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) 
    {
        return length * (Math.sqrt(3.0))/2.0;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) 
    {
        double temp = height(length/2);

        if(y > 0)
        {
            double[] l = { x, x - (length/4), x + (length/4)}; 
            double[] m = { y, temp + y, temp + y}; 
            StdDraw.filledPolygon(l,m);
        }
        else
        {
            double[] p = { x, x - (length/4), x + (length/4)}; 
            double[] q = { 0, temp, temp}; 
            StdDraw.filledPolygon(p,q);
        }
    }
    //
    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    // n, .5 , 0 , 1
    public static void sierpinski(int n, double x, double y, double length) 
    {
        double temp = length/2;

        if(n == 1  )
            filledTriangle(x,y,length);
        else
        {
            filledTriangle(x,y,length);

            sierpinski(n-1, x - (temp/2), y, temp);

            sierpinski(n-1, x + (temp/2), y, temp);

            sierpinski(n-1, x, height(temp)+y, temp);
        }
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args)  
    {   
        //draw basic traingle to be filled with Sierpinski Triangles
        double height = height(1);
        StdDraw.line(0,0,.5,height);
        StdDraw.line(1,0,.5,height);
        StdDraw.line(0,0,1,0);

        int n = Integer.parseInt(args[0]);
        sierpinski(n,.5,0,1);
    }
}
