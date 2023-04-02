
package Module_2;

import java.util.Scanner;

public class Leap_Year 
{
	public static void main(String[] args) 
	{
		Scanner leap = new Scanner(System.in);
		
		System.out.println("Enter The Year:");
		int l = leap.nextInt();
		
		if(l%4 == 0)
		{
			System.out.println(l+" Is A Leap Year.");
		}
		else
		{
			System.err.println(l+ " Is Not A Leap Year.");
		}
	}

}
