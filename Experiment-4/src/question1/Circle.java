package question1;

public class Circle extends Shapes
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double getPerimeter()
	{
		return this.radius*2*PI;
	}
	public double getArea()
	{
		return this.radius*this.radius*PI;
	}
	
	public String toString()
	{
		return "[Circle: Perimeter = " + this.getPerimeter() 
						  + " Aera = " + this.getArea() + "]";
	}
}
