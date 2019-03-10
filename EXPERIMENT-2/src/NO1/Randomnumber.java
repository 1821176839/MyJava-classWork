package NO1;


public class Randomnumber {
		public static void main(String []args)
		{
			double rnum = 0;						   //rnum = random number
			int cnum = 0;                          //cnum = count number
			int bnum = 0; 						 //bnum = bigger than 50
			int snum = 0;  						//snum = smaller than 50
			
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
		    double storage[] = new double[number];
			
			for(; cnum <number ; cnum++ )
			{	
				rnum = 1+(int)(Math.random()*100);
				storage[cnum] = rnum;
				if(rnum>50) 
				{
					bnum++;
				}else 
				{
					snum++;
				}
			}
			
			double bnumtage = (bnum/(number*1.00))*100;						//bnumtag = bigger number percentage
			double snumtage = (snum/(number*1.00))*100;					   //snumtag = smaller number percentage
			
			System.out.printf("Bigger  than 50 is %.1f percent\n",bnumtage);
			System.out.printf("Smaller than 50 is %.1f percent\n",snumtage);
			
		}
	}


