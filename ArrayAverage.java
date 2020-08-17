public class ArrayAverage
{
	public static void main(String[] args)
	{
		double[] array = new double[args.length];
		double sum = 0;

		for(int i = 0; i<array.length; i++)
		{
			array[i] = Integer.parseInt(args[i]);
		}
		for(int i = 0; i<array.length; i++)
		{
			sum = sum + array[i];
		}
		System.out.println(sum/array.length);

	}
}