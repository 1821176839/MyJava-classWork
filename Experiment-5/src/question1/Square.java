package question1;

public class Square extends Shapes
{
	private double sidelenth;
	
	public Square(double sidelenth) {
		super();
		this.sidelenth = sidelenth;
	}
	public double getArea()
	{
		return sidelenth*sidelenth;
	}
	public String toString()
	{
		return  "[Square: Area = " + this.getArea() + "]";
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
