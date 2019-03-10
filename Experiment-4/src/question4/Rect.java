package question4;

public class Rect 
{	
	protected double width;
	protected double height;
	
	public Rect(double width, double height) 
	{
		super();
		this.width = width;
		this.height = height;
	}
	
	protected void InitializeToTen()
	{
		this.width = 10;
		this.height = 10;
	}
	protected double getArea()
	{
		return (this.width)*(this.height);
	}
	protected double getPerimeter()
	{
		return (this.width)*2.0+(this.height)*2.0;
	}

	public boolean isInside(double x,double y) 
	{
		return false;
	}
	public void print()
	{
		
	}
	public void InitializeToZero()
	{

	}
}
