/* Project Name:- Machine Problem3 Interfaces
 * Name:- Nidhi Patel
 * Project description:- Calculates the area of the shapes.
 */
public class Circle implements Shape{
	//private variable
	private double radius; 
	private final double PI = 3.1459; //unchangeable variable, PI
	
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	//this constructor initializes the radius to 1.
	public Circle()
	{
		radius = 1;
	}
	//getters method returns radius
	public double getRadius()
	{
		return radius;
	}
	//setters method sets the radius
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	@Override
	public double calcArea() {
		double Area = (PI)*(radius*radius); //calculates the area of the circle
		return Area; //returns the area of the circle
	}
	
	

}
