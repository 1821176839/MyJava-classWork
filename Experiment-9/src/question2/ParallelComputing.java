package question2;

import java.io.IOException;
import java.util.Scanner;

public class ParallelComputing
{
	public static void main(String []args) throws InterruptedException
	{
		SumWorker sumWorker1 = new SumWorker();
		SumWorker sumWorker2 = new SumWorker();
		SumWorker sumWorker3 = new SumWorker();
		SumWorker sumWorker4 = new SumWorker();
		SumWorker sumWorker5 = new SumWorker();
		
		
		long m,n;
		Scanner number = new Scanner(System.in);
		m = number.nextLong();
		n = number.nextLong();
		
		long different = n - m+1;
		System.out.printf("different = %d \n",different);
		sumWorker1.setNumber( m , m + different/5 );
		sumWorker2.setNumber( 1+m + different/5 , m + (different/5)*2);
		sumWorker3.setNumber( 1+m + (different /5)*2 , m + (different/5)*3);
		sumWorker4.setNumber( 1+m + (different /5)*3 , m + (different/5)*4);
		sumWorker5.setNumber( 1+m + (different /5)*4 , n);
		
		Thread sum1 = new Thread(sumWorker1);sum1.start();sum1.join();
		Thread sum2 = new Thread(sumWorker2);sum2.start();sum2.join();
		Thread sum3 = new Thread(sumWorker3);sum3.start();sum3.join();
		Thread sum4 = new Thread(sumWorker4);sum4.start();sum4.join();
		Thread sum5 = new Thread(sumWorker5);sum5.start();sum5.join();
		
		long sum = sumWorker1.getSum() + sumWorker2.getSum() +
				   sumWorker3.getSum() + sumWorker4.getSum() + sumWorker5.getSum();
		System.out.printf("The final sum is ---%d---\n",sum);
	}
}
