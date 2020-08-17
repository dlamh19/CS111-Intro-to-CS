public class Variables
{
	//Main method is the entry point of the program
	public static void main (String[] Args)
	{
		int x = 3;
		int y = 20;
		int z = 15;

		int divZbyX = z / x;

		System.out.println(" z / x = " + divZbyX);

		int divYbyX = y / x;
		System.out.println(" y / x = " + divYbyX);

		double divYbyXReal = (y * 1.0)/ x;	
		System.out.println(" y / x = " + divYbyXReal);

		int remainder = y % x;
		System.out.println(" y % x = " + remainder);

		double ceil = Math.ceil(divYbyXReal);
		System.out.println(" ceiling of divYbyXReal " + ceil);

		System.out.println("Sqrt of " + x " is " + Math.sqrt(x));
		System.out.println("Pow(" + x + ", 2) is " + Math.power(x,2));

		boolean a = false;
		boolean notA = !a;
		System.out.println("a: " + a + " notA: " + notA);
		


	}
}