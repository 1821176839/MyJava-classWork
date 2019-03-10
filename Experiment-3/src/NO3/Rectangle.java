package NO3;

public class Rectangle {
	private double sidelength;
	Rectangle(double sidelength)
	{
		this.sidelength = sidelength;
	}
	public double getSidelength() 
	{
		return sidelength;
	}
	public double getPerimeter(double sidelength)
	{
		return sidelength*4.0;
	}
	public double getArea(double sidelength)
	{
		return sidelength*sidelength;
	}
}
