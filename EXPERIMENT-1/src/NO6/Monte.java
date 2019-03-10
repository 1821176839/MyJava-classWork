package NO6;

public class Monte {
	public static void main(String []args) 
	{
		double PI = 1;
		double right = Math.PI;
		double Denominator = -3.00;
		
		do
		{
			PI = PI+(1/Denominator);
			if(Denominator>=0) 
			{
				Denominator += 2;
				Denominator *=-1;
			}else 
			{
				Denominator *=-1;
				Denominator +=2;
			}
			
		}while(Math.abs(right-PI*4) >= 0.000001);
		charAT()
		
		System.out.printf("%f", PI*4);
	}
}
