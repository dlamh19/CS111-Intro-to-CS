public class SimplifyFraction
{
	public static void main(String[] args)
	{
		int frac1 = Integer.parseInt(args[0]);
		int frac2 = Integer.parseInt(args[1]);

		int divide = Methods.gcf(frac1,frac2);

		StdOut.println(frac1/divide + "/" + frac2/divide);



	}

}