package question1;

import java.util.Arrays;
import java.util.Scanner;

public class Redraw {
	public static void main(String[] args) {

		int[] x = new int[3];
		Scanner inputScan = new Scanner(System.in);
		for(int i = 0 ; i < x.length ; i++ )
		{
			System.out.println("Please input the "+(i+1)+" integer:");
			String inputInt = inputScan.nextLine();
			try 
			{
				x[i] = Integer.parseInt(inputInt); 
			}catch(Exception e)
			{
				i--;
				System.out.printf("Please enter the right number\n\n");
			}
		}
			System.out.println(Arrays.toString(x));
		}
}
