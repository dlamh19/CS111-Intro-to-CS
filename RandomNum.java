public class RandomNum
{
	public static void main(String[] args)
	{
		int randomNum = (int)(Math.random() * 1000) + 1;
		int temp = 0;
		boolean guess = false;

		while(guess == false)
		{
			StdOut.print("Guess a number 1 - 1000: ");
        	temp = StdIn.readInt();

        	if(a == randomNum)
        		guess = true;
        	else if(randomNum > a)
        		StdOut.println("Guess again but higher");
        	else
        		StdOut.println("Guess again but lower");
		}
		StdOut.println("you got it. the random number is: " + randomNum);
	}
}