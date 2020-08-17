public class Factorial
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);  
		int factorial = 1;

		for(int i = a; i > 0; i--)
		{
			factorial = factorial * a;
			a -= 1;
		}
		System.out.println(factorial);

		/*
		while( a > 1)
		{
			factorial *= a;
			a -= 1;
		}
		*/
	}
}	