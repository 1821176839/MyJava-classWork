package NO5;

import java.util.Scanner;

public class EuclideanAlgorithm {
	public static void main(String []args)
	{
		Scanner input = new Scanner (System.in);
		System.out.printf(" First  number please: ");
		int numberA = input.nextInt();
		System.out.printf("\n Second number please: ");
		int numberB = input.nextInt();
		
		System.out.printf("\n (Non-Recursive) The Common Divisor is : %d", gcd(numberA,numberB) );
		System.out.printf("\n (Recursive) The Common Divisor is : %d",gcd_recursive(numberA,numberB) );
	}
	private static int gcd(int m, int n) //�ǵݹ��㷨
	{
		int number = 0,surplus = 0 ;
		
		if(n>m)				//ȷ��m����n
		{
			int temp = m;
			m = n;
			n = temp;
 		}
		
		do
		{
			surplus = m%n;
			if(surplus == 0 ) 
			{
				number = n;
				break;
			}
			
			m = n;
			number = surplus;
			n = surplus;
			
		}while(surplus != 0);
		
		return number;
	}
	
	private static int gcd_recursive(int m, int n) //�ݹ��㷨
	{
		int number = 0 , surplus = 0;
		
		if(n>m)				//ȷ��m����n
		{
			int temp = m;
			m = n;
			n = temp;
 		}
		
		surplus = m%n;
		m = n;
		number = n;
		n = surplus;
		
		if(surplus == 0) 
		{
			return number;
		}else 
		{
			return gcd_recursive(m,n);
		}

	}
}
