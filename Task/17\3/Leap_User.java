package task_173;

import java.util.Scanner;

public class Leap_User 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		{
			System.out.println("Enter The Year:");
			int y= sc.nextInt();
		
		
		if(y%4 == 0)
		{
			System.out.println("Leap Year");
		}
		else 
		{
			System.out.println("Not Leap Year");
		}
		
	}

}

}
