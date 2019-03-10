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
	public static void main(String []args)
	{
		Test test = new Test();
		test.add(new Rectangle(6,7));
		test.add(new Rectangle(5,8));
		test.add(new Square(6));
		test.add(new Square(7));
		java.util.Collections.sort(test.listShapes);
		test.print();
	}
}
