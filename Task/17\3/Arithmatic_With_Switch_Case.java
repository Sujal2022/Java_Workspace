package task_173;

import java.util.Scanner;

public class Arithmatic_With_Switch_Case 
{
	public static void main(String[] args) 
	{
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter Your Choice:");
		int choice= sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter A Value:");
				int a= sc.nextInt();
				System.out.println("Enter B Value:");
				int b= sc.nextInt();
				c=a+b;
				System.out.println("Addition:" +c);
				break;
			case 2:

				System.out.println("Enter A Value:");
				int d= sc.nextInt();
				System.out.println("Enter B Value:");
				int e= sc.nextInt();
				c=d-e;
				System.out.println("Subtraction:" +c);
				break;
			case 3:
				System.out.println("Enter A Value:");
				int s= sc.nextInt();
				System.out.println("Enter B Value:");
				int u= sc.nextInt();
				c=s*u;
				System.out.println("Multiplication:" +c);
				break;
			case 4:
				System.out.println("Enter A Value:");
				int m= sc.nextInt();
				System.out.println("Enter B Value:");
				int n= sc.nextInt();
				c=m/n;
				System.out.println("Division:" +c);
				break;
			default:
				System.out.println("Please Enter Valid Choice.");
				
		}
		
	}

}
