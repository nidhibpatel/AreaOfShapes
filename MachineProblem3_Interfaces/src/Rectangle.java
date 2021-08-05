/* Project Name:- Machine Problem3 Interfaces
 * Name:- Nidhi Patel
 * Project description:- Calculates the area of the shapes.
 */
public class Rectangle implements Shape{
	//private variables
	private double height;
	private double width;
	
	//this constructor sets the height and width
	public  Rectangle (double height, double width)
	{
		this.height= height;
		this.width = width;
	}
	//this constructor sets height and width equal to 1
	public Rectangle()
	{
		height =1;
		width=1;
		
	}
	//getters methods returns height and width
	public double getheight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	
	//setters methods
	//sets the height
	public void setHeight(double height)
	{
		this.height = height;
	}
	//sets the width
	public void setWidth(double width)
	{
		this.width= width;
	}
	@Override
	public double calcArea() {
		double Area = width*height; //calculates the area of the rectangle
		return Area; //returns the area
	}
	
	
}
