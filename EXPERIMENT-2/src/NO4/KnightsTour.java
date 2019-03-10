package NO4;

public class KnightsTour {
	static int [][]Maps = new int [8][8];				//maps[][]is the checkboard in calculation
	static int Length = 0, Width = 0;		   		   //Length and Width used to storage the knight's position
	static int	AllSteps = 8*8-1;	  				  //AllSteps = the steps knight could walk;
	public static void main(String []args) 
	{
		if (Move(Length, Width, AllSteps) == 0)
		{
	        for (int i = 0; i < 8; i++)
	        {
	            for (int j = 0; j < 8; j++)
	            {
	                System.out.printf("%d ", Maps[i][j] );
	            }
	            
	        }
	    }
	    else
	    {
	        System.out.printf("NO WAY FOUND\n");
	    }
		
	}
	public static int Move(int Length, int Width, int steps){
	    if (Length < 0 || Length > 7 || Width < 0 || Width > 7)			//Mean the step cross the border
	    {
	        return 0;
	    }
        System.out.printf("Now is the Map[%d][%d] \n", Length , Width );
	    if (Maps[Length][Width] != 0)			//Mean the step have been walked
	    {
	        return 0;
	    }
	    if (steps == 0)				//Mean the step is over
	    {
	        return 1;
	    }
	    steps--;
	    Maps[Length][Width] = AllSteps - steps;
        System.out.printf("TheMap[%d][%d] = %d \n", Length , Width , Maps[Length][Width] );
        System.out.printf("\n" );				//Try the every position of eight  
	    if (Move(Length + 1, Width + 2, steps) == 1) 
	    {
	    	return 1;
	    }
	    if (Move(Length + 1, Width - 2, steps) == 1) 
	    {
	    	return 1;
	    }
	    if (Move(Length - 1, Width + 2, steps) == 1) 
	    {
	    	return 1;
	    }
	    if (Move(Length - 1, Width - 2, steps) == 1) {
	    	return 1;
	    }
	    if (Move(Length + 2, Width + 1, steps) == 1) {
	    	return 1;
	    }
	    if (Move(Length + 2, Width - 1, steps) == 1) {
	    	return 1;
	    }
	    if (Move(Length - 2, Width + 1, steps) == 1) {
	    	return 1;
	    }
	    if (Move(Length - 2, Width - 1, steps) == 1) {
	    	return 1;
	    }
	    Maps[Length][Width] = 0;
	    System.out.printf("return \n ");
	    return 0;
	}
}
