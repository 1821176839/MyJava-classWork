package NO5;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA(double a) 
	{
		return a;
	}
	public double getB(double b)
	{
		return b;
	}
	public double getC(double c)
	{
		return c;
	}
	
	public double getDiscriminant(double a,double b,double c)
	{
		return b*b-4.0*a*c;
	}
	public double getroot1(double distinguish,double a,double b)
	{
		if(distinguish >= 0)
		{
			return (Math.sqrt(distinguish)-b)/(2.0*a);
		}else
		{
			return 0;
		}
	}
	public double getroot2(double distinguish,double a,double b)
	{
		if(distinguish >= 0)
		{
			return (Math.sqrt(distinguish)*(-1.0)-b)/(2.0*a);
		}else
		{
			return 0;
		}
	}
}
