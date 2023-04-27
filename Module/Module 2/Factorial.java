package Module_2_1;

import java.util.Scanner;

public class Factorial 
{
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a Factorial Number: ");
	        int num = sc.nextInt();
	        sc.close();
	        System.out.println(num + "! = " + factorial(num));
	    }

	private static int factorial(int num) 
	{
		if (num < 0) 
		{
            return -1; 
        }
        int result = 1;
        
        for (int i = 2; i <= num; i++) 
        {
            result *= i;
        }
        return result;
		
	}

}
