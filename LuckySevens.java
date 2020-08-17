/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author:
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) 
    {
    		int number = Integer.parseInt(args[0]);
    		String temp = String.valueOf(number);
    		int count = 0;
            
    		for(int i = 0; i < temp.length(); i++)
    		{
    			if(temp.charAt(i) == '7')
    				count++;
    		}
            
    		System.out.println(count);
    }

}
