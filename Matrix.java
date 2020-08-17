import java.lang.Math;
public class Matrix

{
	public static void main(String[] args)
	{
		int x = 25;
		int row = (int)Math.round(1 + Math.random() + x);
		int column = (int)Math.round(1 + Math.random() + x);
		int[][] array = new int[row][column];
		int count1 = 0;
		int count2 = 0;


		for(int i = 0; i < array.length; i++)
		{
			for(int s = 0; s < array[i].length; s++)
			{
				array[i][s] = (int)Math.round(Math.random());
				if(array[i][s] == 0)
					count1++;
				else
					count2++;
				
			}
		}

		System.out.println("# of 0's " + count1 + " and " + "# of 1's " + count2);
		System.out.println(row + " and  " + column);
	}
}