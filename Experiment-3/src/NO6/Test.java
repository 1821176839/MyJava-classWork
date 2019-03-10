package NO6;

public class Test {
	public static void main(String []args)
	{
		Complex Random1 = new Complex(5,5);
		Complex Random2 = new Complex(2,2);
		Random1=Random1.add(Random2);
		System.out.println(Random1.toString());
		Random1=Random1.minus(Random2);
		System.out.println(Random1.toString());
		Random1=Random1.multiple(Random2);
		System.out.println(Random1.toString());
		Random1=Random1.divide(Random2);
		System.out.println(Random1.toString());
	}
}
