package Module_2;

import java.util.Scanner;

public class Greatest_Number 
{
	public static void main(String[] args) 
	{
		Scanner gn= new Scanner(System.in);
		System.out.println("Enter The A Value:");
		int a= gn.nextInt();
		System.out.println("Enter The B Value:");
		int b= gn.nextInt();
		System.out.println("Enter The C Value:");
		int c= gn.nextInt();
		 if (a > b)
		    {
		        if (a > c)
		        {
		        	System.out.println(a+ " is a Greatest number");
		        }
		        else
		        {
		        	System.out.println(c+ " is a Greatest number");
		        }
		    }
		    else
		    {
		        if (b > c)
		        {
		        	System.out.println(b+ " is a Greatest number");
		        }
		        else
		        {
		        	System.out.println(c+ " is a Greatest number");
		        }
		    }
		}
}
