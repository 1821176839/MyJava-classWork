package question1;

public class Rectangle extends Shapes
{
	private double  lenth,width;
	
	public Rectangle(double lenth, double width)
	{
		super();
		this.lenth = lenth;
		this.width = width;
	}
	public double getPerimeter()
	{
		return (this.width+this.lenth)*4.0;
	}
	public double getArea()
	{
		return (this.width*this.lenth);
	}
	public String toString()
	{
		return  "[Rantangle: Perimeter = " + this.getPerimeter() 
						     + "  Area = " + this.getArea() + "]";
	}
}
