public class TestingStrings
{
	public static void main(String[] args)
	{
		String s1 = new String("Chocolate Cake");
		String s2 = new String("Cookie Dough");
		String s3 = new String("chocolate cake");

		//compares addresses
		if(s1 == s2)
			StdOut.println("The twp strings have the same address");
		else
			StdOut.println("The two strings have different addreses");

		//compare string
		if(s1.equals(s2))
			StdOut.println(s1 + " and " + s2 + " are equal");
		else
			StdOut.println(s1 + " and " + s2 + " are not equal");


		for(int i = 0; i < s1.length(); i++)
			StdOut.println(s1.charAt(i));







	}

}