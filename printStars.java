public class printStars
{
	public static void main (String[] args)
	{
		int rows = Integer.parseInt(args[0]);
		int count = 1;

		for(int i = 0; i < rows; i++)
		{
			for(int x = 0; x < count; x++)
				System.out.print("*");
			System.out.println();
			count++;
		}

		for(int x = 0; x < rows; x++)
		{
			count--;
			for(int n = 1; n < count ; n++)
				System.out.print("*");
			System.out.println();
		}	

	}
}