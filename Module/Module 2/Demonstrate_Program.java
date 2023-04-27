package Module_2_1;

import java.util.Scanner;

public class Demonstrate_Program 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Two Number:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		try 
		{
			int div = n1/n2;
			System.out.println("Division Of Two Number Is:" +div);
			
		} catch (Exception e) 
		{
			System.out.println("Exception Caught :"+e);
			System.out.println("Cannot Divided By Zero");
		}
	}

}
