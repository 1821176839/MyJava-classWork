package NO3;

public class Circle {
	private double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	public double getRadius() 
	{
		return radius;
	}
	public double getPerimeter(double radius)
	{
		return radius*2*Math.PI;
	}
	public double getArea(double radius)
	{
		return radius*radius*Math.PI;
	}
}
