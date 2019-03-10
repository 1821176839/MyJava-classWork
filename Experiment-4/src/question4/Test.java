package question4;

import java.util.ArrayList;

public class Test 
{
	private ArrayList<Rect> listRect = new ArrayList<Rect>();
	
	public void add(Rect rect)
	{
		listRect.add(rect);
	}
	private void print()
	{
		for(Rect rect : listRect)
		{
			rect.print();
		}
	}
	private void InitializeToTen()
	{
		for(Rect rect : listRect)
		{
			rect.InitializeToTen();
		}
	}
	private void InitializeToZero()
	{
		for(Rect rect : listRect)
		{
			rect.InitializeToZero();
		}
	}
	public static void main(String []args)
	{
		Test test =new Test();
		test.add(new PlainRect(3,8,9,4));
		test.print();
		if(test.listRect.get(0).isInside(10,5) == true)
		{
			System.out.printf("The point in the Rectangle\n");
		}else
		{
			System.out.printf("The point not in the Rectangle\n");
		}
		test.InitializeToTen();
		test.print();
		test.InitializeToZero();
		test.print();
		if(test.listRect.get(0).isInside(10,5) == true)
		{
			System.out.printf("The point in the Rectangle\n");
		}else
		{
			System.out.printf("The point not in the Rectangle\n");
		}
	}

}
