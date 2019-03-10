package question4;

public class PlainRect extends Rect
{
	private double startX;
	private double startY;
	public PlainRect(double width, double height, double startX, double startY)
	{
		super(width, height);
		this.startX = startX;
		this.startY = startY;
	}
	
	public void InitializeToZero()
	{
		this.startX = 0;
		this.startY = 0;
		this.width = 0;
		this.height = 0;
	}
	
	public boolean isInside(double x, double y) 
	{
		if( (x >= this.startX) && (x <= (this.startX + this.width))  &&
			(y >= this.startY) && (y <= (this.startY + this.height)) )
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void print()
	{
		System.out.printf("startX = %.1f---startY = %.1f\n"
						+ "width  = %.1f---height = %.1f\n\n",this.startX,this.startY,this.width,this.height);
	}
}
