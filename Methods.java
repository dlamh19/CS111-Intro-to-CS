	public class Methods
{
	//two arguments n and symbol are the inputs for the method
	//print a square of nxn symbols

	public static void square(int n, String symbol)
	{
		for(int i = 0; i < n; i ++)
		{
			for(int k = 0; k < n; k++)
			{
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	public static void printArray (int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			StdOut.print(array[i] + " - ");
		}
		StdOut.println();
	}

	public static int[] reverseArray (int[] array)
	{
		int[] reverseArray = new int[array.length];

		for(int i = 0; i < array.length; i++)
		{
			int j = array.length - 1 - i;
			reverseArray[j] = array[i];
		}
		return reverseArray;
	}
	public static void main (String[] args)
	{
		/* Print Square
		StdOut.print("Enter the number of lines: ");
		int dimension = StdIn.readInt();

		square(dimension, "*");
		*/

		int[] intArray = {3, 7, 9, 4, 2};
		printArray(intArray);

		int[] reversedIntArray = reverseArray(intArray);
		printArray(reversedIntArray);

	}
	public static void printTable (int n)
	{
			for(int i = 1; i <= n; i++)
			{
				for(int x = 1; x <= n; x++)
					StdOut.print(i * x);
				StdOut.println();
			}
	}
	public static Integer gcf(int x, int y)
	{
		int smaller = x;
		if(x > y)
			smaller = y;
		for(int divisor = smaller; divisor > 1; divisor--)
		{
			if(x%divisor == 0 && y%divisor == 0)
				return divisor;
		}
		return 1;
	}
	public static Boolean has6(int[] a, int index) //sees if the array contains the number 6 where index starts at 0 and isnt given by the
	{
		if(index >= a.length)
			return false; 		//this is base case because if youre at the array length youre out of the array and you have not found 6 yet
		if(a[index] == 6)
			return true; 		//another base that stops the recursion given the index
		return(has6(a,index + 1));

	}
	public static Integer sum(int[] a,int index)
	{	
		/* davids version
		if(index < a.length)
			return a[index] + sum(a,index + 1);
		if(index >= a.length)
			return 0;
		return 0;
		*/
			
		if(index == a.length - 1)
			return a[index];
		return a[index] + sum(a,index + 1);
	}

	public static Integer factorial(int n)
	{
		if(n <= 1)
			return 1;
		else
			return n * factorial(n-1);
	}

	public static Integer fib(int n)
	{
		if(n <= 1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}

	public static void pyramid(int nStars)
	{
		if(nStars == 0)
			return;

		pyramid(nStars -1);
		printRow(nStars);
	}
	public static void upsdideDownPyramid(int nStars)
	{
		if(nStars == 0)
			return;
		printRow(nStars);
		upsdideDownPyramid(nStars - 1);
	}

	public static void printRow(int nStars)
	{
    if(nStars == 0){
        System.out.println(); // Force a new line
        return; // no more recursion
    }
    System.out.print("*");
    printRow(nStars - 1);
	}

	public static String reverseString(String word)
	{
		if(word.isEmpty())
			return word;

		return reverseString(word.substring(1)) + word.charAt(0);
	}

	public static boolean palindrome(String word)
	{
		word = word.toLowerCase();

		if(word.length() == 1 || word.length() == 0)
			return true;
		if(word.charAt(0) != word.charAt(word.length() - 1))
			return false;
		return palindrome(word.substring(1,word.length() - 1));
	}

	//insertion sort
	public static void(int[] array)
	{
		int n = array.length;

		for(int i = 1; i < n; i++)
		{
			int itemToInsert = array[i];
			for(int j = i; j > 0; j--)
			{
				if(itemToInsert < array[j-1])
					exchange(array,j-1,j);
				else
					break;
			}
		}
	}

	public static void exchange(int[] a, int i, int j)
	{
		int temp = a[j];
		a[j] = a[i];
		a[i] = tmep; 
	}		

	public static void SelectionSort(int [] a))
	{
		int n = a.length;
		for(int i = 0; i < n; i++)
		{
			int min = a[i];
			for(int j = i + 1; j < n; j++)
				{
					if(a[j] < a[min])
					min = a[j];
				}
			exchange(a, i, min);
		}
	}

	public static int recursiveBinary(int[] a, int targetm int left, int right)
	{
		if(left > right)
			return -1;
		else
			int middle = (left + right) / 2;
			if(a[middle] == target)
				return temp;
			else if(a[m] > target)
				return recursiveBinary(a, target, left, middle - 1);
			else
				return recursiveBinary(a, target, middle + 1, right);

	}


}











 

























