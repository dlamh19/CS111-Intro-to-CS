/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) 
    {
    	if(original.length() == 0)
    		return original;
    	else if(n >= 1)
    		return original + appendNTimes(original, n-1);
    	return original;
    }

    public static void main (String[] args) 
    {
    	String test = "Bop";
    	StdOut.println(appendNTimes(test, 1));
    }
}
