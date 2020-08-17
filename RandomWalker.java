/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker 
{
    public static void main(String[] args) 
    {
    	int numWalk = Integer.parseInt(args[0]);
    	int x = 0;
    	int y = 0;
    	int random = 0;

    	System.out.println("(0,0)");

    	for(int i = 0; i < numWalk; i++)
    	{
    		random = (int)((Math.random() * 4) + 1);
    		if(random == 1)
    			x += 1;
    		else if(random == 2)
    			x -= 1;
    		else if(random == 3)
    			y += 1;
    		else 
    			y -= 1;
    		System.out.println("(" + x + "," + y + ")");
    	}
    	System.out.println("Squared distance = " + (double)((x*x) + (y*y)));
    }
}
