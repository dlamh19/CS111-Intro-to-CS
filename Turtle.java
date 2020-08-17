``import java.awt.Color;



public class Turtle
{
	//instance variable, are unique to each object
	private double x;
	private double y;

	//the direction the turtle is facing
	private double angle;

	//difines the turtle's path color
	private Color color;

	//static variable is visible and accesible by every Turtle object but there is only one variable
	//that resides in the class
	static int numberOfTurtles = 0;

	//Default Constructor, no argument constructor
	public Turtle()
	{
		x = y = 0.0;
		angle = 90.0;
		color = StdDraw.BLACK;
		Turtle.numberOfTurtles += 1;

	}

	public Turtle(double x, double y, double angle, Color color)
	{
		this.x = x;
		this.y = y;					//this.y means the y instance variable that belongs to this object
		this.angle = angle;
		this.color = color; 
		numberOfTurtles += 1;

	}

	//equals compares two objects of the same type
	public boolean equals(Object other)
	{
		if( !(other instanceof Turtle))
			return false;

		Turtle o = (Turtle)other; //cast other as a Turtle

		return (o.x == x) && (o.y == y) && (o.color == color);         
	}

	//toString metho returns the String description of an object
	public String toString()
	{
		return "Turtle position (" + x + "," + y + ") and angle" + angle;
	}

	//access methods for reading
	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getAngle()
	{
		return angle;
	}

	public double getColor()
	{
		return color;
	}



	public void turnLeft (double delta)
	{
		angle += delta;
	}

	public void moveForward(double d)
	{
		double oldx = x;
		double oldy = y;

		x += d * Math.cos(Math.toRadians(angle));
		y += d * Math.sin(Math.toRadians(angle));


		StdDraw.setPenColor(color);
		StdDraw.line(oldx, oldy, x, y);
	}
	public static void main (String[] args)
	{
		Turtle t1 = new Turtle(0.0,0.0,0.0,StdDraw.BLUE); //instantiating a new turtle
		t1.moveForward(1.0);
		t1.turnLeft(120.0);
		t1.moveForward(1.0);
		t1.turnLeft(120.0);
		t1.moveForward(1.0);

		Turtle t2 = new Turtle(0.0,0.0,45.0,StdDraw.RED);
		t2.moveForward(1.0);

	}
}