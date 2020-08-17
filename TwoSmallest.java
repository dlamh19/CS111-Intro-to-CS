/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 1
 */

public class TwoSmallest 
{

    public static void main(String[] args) 
    {
        double[] array = new double[args.length];
        double small1 = 0;
        double small2 = 0;
        double temp = 0;
        
        for(int i = 0; i < array.length; i++)
        {   
            array[i] = Double.parseDouble(args[i]);
        }
        small1 = array[0];
        small2 = array[1];

        if(small2 < small1)
        {
            temp = small1;
            small1 = small2;
            small2 = temp;
        }

        for(int i = 2; i < array.length; i++)
        {
            if(array[i] <= small1)
            {
                small2 = small1;
                small1 a= array[i];
            }            
            else if(array[i] <= small2)
                small2 = array[i];
        }
        System.out.println(small1);
        System.out.println(small2);

        
    }

}