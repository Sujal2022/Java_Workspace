package Task_243;

public class Pattern_15 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++) 
		{
	        for (int j = 1; j <= 10; j++) 
	        {
	            if (j <= 6-i || j >= 5+i) 
	            {
	                System.out.print("*");
	            } else 
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }	
	}
}
