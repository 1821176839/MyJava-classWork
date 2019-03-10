package NO3;

public class Triangle {
	private double sidelength;
	Triangle(double sidelength)
	{
		this.sidelength = sidelength;
	}
	public double getSidelength() 
	{
		return sidelength;
	}
	public double getPerimeter(double sidelength)
	{
		return sidelength*3.0;
	}
	public double getArea(double sidelength)
	{
		return sidelength*sidelength*0.5*Math.sqrt(3);
	}
}
