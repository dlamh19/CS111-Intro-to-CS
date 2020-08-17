public class eTriangle
{
	public static void main(String[] args)
	{
		
		double height = (Math.sqrt(3.0))/2.0;

		StdDraw.line(0,0,.5,height);
		StdDraw.line(1,0,.5,height);
		StdDraw.line(0.5,height,0,0);

	}
}