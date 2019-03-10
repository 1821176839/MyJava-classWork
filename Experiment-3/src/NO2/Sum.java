package NO2;

import java.util.Scanner;

public class Sum {
	private int begin;
	private int end;
	Sum(int begin,int end)
	{
		this.begin = begin;
		this.end = end;
	}
	public int getBegin()
	{
		return begin;
	}
	public int getEnd() 
	{
		return end;
	}
	public int getSum(int begin,int end)
	{
		int accout = 0;
		for( int i = begin; i <= end ; i++ )
		{
			accout += i;
		}
		
		return accout;
	}
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter The Begin And End : ");
		Sum sumNumber = new Sum(input.nextInt(),input.nextInt());
		int accout = sumNumber.getSum(sumNumber.begin,sumNumber.end);
		System.out.printf(" Result = %d\n",accout);
	}
}
