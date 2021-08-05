/* Project Name:- Machine Problem3 Interfaces
 * Name:- Nidhi Patel
 * Project description:- Calculates the area of the shapes.
 */
import java.util.ArrayList;

public class ShapeDemo {

	public static void main(String[] args) {
		//creates circles
		Circle c1 = new Circle(5.0);
		Circle c2 = new Circle(10.0);
		//creates rectangles
		Rectangle r1 = new Rectangle(5.0, 10.0);
		Rectangle r2 = new Rectangle(10.0, 20.0);
		Rectangle r3 = new Rectangle(5.0, 5.0);
		//creates array of shapes which consists of circles and rectangles.
		ArrayList<Shape> shapes = new ArrayList<Shape>(5);
		//adds the c1 and c2 to the array
		shapes.add(c1);
		shapes.add(c2);
		//adds the r1, r2, and r3 to the array
		shapes.add(r1);
		shapes.add(r2);
		shapes.add(r3);
		//displays the area of all the shapes in the array list
		for(Shape s: shapes)
		{
			displayArea(s); //calls the method displayArea
		}
	}
	//this method prints the area of the shapes.
	public static void displayArea(Shape s)
	{
		System.out.println("The area of the shape is: " + s.calcArea());
	}
	

}
