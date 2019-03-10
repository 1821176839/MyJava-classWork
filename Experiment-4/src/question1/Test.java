package question1;

import java.util.ArrayList;

public class Test 
{
	private ArrayList<Shapes> listShapes = new ArrayList<Shapes>();
	
	public void add(Shapes shapes)
	{
		listShapes.add(shapes);
	}
	public void print()
	{
		for(Shapes shapes : listShapes)
		{
			System.out.println(shapes.toString());
		}
	}
	public double addAllarea()
	{
		double sum = 0;
		for(Shapes shapes : listShapes)
		{
			sum += shapes.getArea();
		}
		return sum;
	}
	public double addAllperimeter()
	{
		double sum = 0;
		for(Shapes shapes : listShapes)
		{
			sum += shapes.getPerimeter();
		}
		return sum;
	}
	public static void main(String []args)
	{
		Test test = new Test();
		test.add(new Circle(8.1));
		test.add(new Triangle(5.2,5.1,5.3));
		test.add(new Rectangle(6.2,6.5));
		test.print();
		System.out.printf("The Area is %.2f\n", test.addAllarea());
		System.out.printf("The Perimeter is %.2f\n", test.addAllperimeter());
	}
}
