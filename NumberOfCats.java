public class NumberOfCats
{
	//Assume that Ellen's number of cats is the first argument at index 0
	//Assume that Ana's number of cats is the second argument at index 1
	public static void main (String[] args)
	{
		//transform the arg[0] and arg[1] string into an integer
		int ellenCats = Integer.parseInt(args[0]);
		int anaCats = Integer.parseInt(args[1]);

		int totalCats = ellenCats + anaCats;

		System.out.println("Total number of cats is " + totalCats);


	}
}