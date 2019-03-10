package NO4;

import java.util.Scanner;

public class TAKENUMBER {
	public static void main(String []args) 
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.printf("n = %d\n",number);
		
		int storage[] = new int[100];
		int cnum = 0;
		for(; number > 0 ; cnum++ )
		{	
			storage[cnum] = ( number % 10 );
			number/=10;
		}
		
		cnum--;
		for(; cnum >= 0 ; cnum-- ) 
		{
			System.out.printf("%d,", storage[cnum]);
		}
	}
}
