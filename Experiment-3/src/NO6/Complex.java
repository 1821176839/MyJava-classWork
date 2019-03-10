package NO6;

public class Complex {
	private double x;
	private double y;
	
	Complex(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX() 
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public Complex add(Complex c)
	{
		Complex addComplex = new Complex( c.x + x , c.y + y);
		return addComplex;
	}
	public Complex minus(Complex c) 
	{
		Complex minusComplex = new Complex( c.x - x , c.y + y );
		return minusComplex;
	}
	public Complex multiple(Complex c)
	{
		double A = x;
		double B = y;
		double C = c.x;
		double D = c.y;
		Complex multipleComplex = new Complex( A*C-B*D , B*C-A*D );
		return multipleComplex;
	}
	public Complex divide(Complex c)
	{
		double A = x;
		double B = y;
		double C = c.x;
		double D = c.y;
		if( B*C - A*D == 0)
		{
			return null;
		}
		Complex divideComplex = new Complex((A*C+B*D)/(C*C+D*D),(B*C-A*D)/(C*C+D*D));
		return divideComplex;
	}
	public String toString()
	{
		return "[Complex = "+ x + " + " + y + "i]";
	}
}
