package Module_2_2;

import java.util.Scanner;

public class Vote_Program 
{
	public static void vote(int age) 
	{
		 if (age < 18) 
		 {
	            throw new ArithmeticException("You are not eligible to vote!");
	     } 
		 else 
		 {
	            System.out.println("Welcome to vote!");
	     }
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your Age:");
		int age = sc.nextInt();
		vote(age);
		
	}

}
