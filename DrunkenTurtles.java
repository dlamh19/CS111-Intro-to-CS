public class DrunkenTurtles
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);							//number of turtles
		int steps = Integer.parseInt(args[1]);						//number of steps each turtle is going to take
		double stepSize = Double.parseDouble(args[2]);

		Turtle[] turtles = new Turtle[n];							//creates a turtle datatype array, enouhg space of n Turtle
																	//But the turtles have not been instantiated yet
		//instantiate each Turtle object
		for(int i = 0; i < n; i++)
		{
			double x = StdRandom.uniform(0.0,1.0);
			double y = StdRandom.uniform(0.0,1.0);
			turtles[i] = new Turtle(x,y,0.0, StdDraw.MAGENTA);

			System.out.println(turtles[i]); 							//print the instance i of the class turtle
		}

		for(int s = 0; 0 < steps; s++)
		{
			for(int i = 0; i < n; i++)
			{
				double angle = StdRandom.uniform(0.0, 360.0);
				turtles[i].turnLeft(angle);
				turtles[i].moveForward(stepSize);


				/*
				turtles[i].x = 0.0; // the turtle will not move, only will move y 
				*/

				// System.out.println(i + " position (" + turtles[i].getX() +  "," + turtles[i].getY() + ")");\
				//Prints x and y values of each turtle position4
			}
		}






	}
}	