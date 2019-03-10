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
	public double getArea()
	{
		return (this.width*this.lenth);
	}
	public String toString()
	{
		return  "[Rantangle: Area = " + this.getArea() + "]";
	}
	public int compareTo(Shapes getIn)
	{
		if(this.getArea()>getIn.getArea())
		{
			return 1;
		}else if(this.getArea() == getIn.getArea())
		{
			return 0;
		}else
		{
			return -1;
		}
	}
}
