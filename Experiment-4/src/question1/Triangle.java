package question1;

public class Triangle extends Shapes
{
	private double lenthOne;
	private double lenthTwo;
	private double lenthThree;
	public Triangle(double lenthOne, double lenthTwo, double lenthThree)
	{
		this.lenthOne = lenthOne;
		this.lenthTwo = lenthTwo;
		this.lenthThree = lenthThree;
	}
	
	public double getPerimeter()
	{
		return (this.lenthOne+this.lenthTwo+this.lenthThree);
	}
	public double getArea()
	{
		double helen;
		helen = ( this.lenthOne + this.lenthTwo + this.lenthThree )/2;
		return Math.sqrt(helen*( helen - this.lenthOne )*( helen - this.lenthTwo )*( helen - this.lenthThree ));
	}
	
	public String toString()
	{
		return "[Triangle: Perimeter = " + this.getPerimeter()
						+ "Aera = " + this.getArea() + "]";
	}
}
