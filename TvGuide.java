public class TvGuide
{
	public static void main(String[] args)
	{
		StdOut.print("Enter the number of channels: ");
		int numChannels = StdIn.readInt();

		while(numChannels < 1)
		{
			StdOut.print("Enter a value > 1: ")
			nbr channels = StdInt.readInt();
		}
		String[] tvGuide = new String[numChannels];
		boolean quit = false;

		do{

			StdOut.print("Option [1]-add channel, [2] exit, [3] look up channel name")
			int option = StdIn.readInt();
			if(option == 1)
			{
				StdOut.print("Enter channel number to add: ");
				int x = StdIn.readInt;
				StdOut.print("Enter channel name to add: ");
				String name = StdIn.readString();

				add(tvGuide, x, name);
			}
			else if(option == 2)
				quit = true;	
			else if(option == 3)
			{
				StdOut.print("Enter channel name: ")
				String name = StdIn.readString();
				int channelNbr = lookupByName(tvGuide, name);
				StdOut.println("Channel " + name + " is at " + channelNbr);
			}
			else 
				StdOut.println(option + " not available");

		}while(quit == false)
	}
	public static void add(String[] guide, int channelNum, String channelName)
	{
		if(channelNum < guide.length && channelNum >= 0)
			guide[channelNum] = channelName;

	}
	public static int lookupByName (String[] guide, String name)
	{
		for(int i = 0; i < guide.length; i++)
		{
			if(name.equals(guide[i]))
			{
				return i;
			}	
		}
	}
}