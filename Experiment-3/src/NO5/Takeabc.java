package NO5;

import java.util.Scanner;

public class Takeabc {
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation(a,b,c);
		double result = equation.getDiscriminant(a, b, c);
		
		if( result > 0 )
		{
			System.out.printf("The Root 1 is : %.2f \n",equation.getroot1(result, a, b));
			System.out.printf("The Root 2 is : %.2f \n",equation.getroot2(result, a, b));
		}else if( result == 0 )
		{
			System.out.printf("The Root is : %.2f \n",equation.getroot1(result, a, b));
		}else {
			System.out.printf("The equation has no roots.\n");
		}
	}
}
