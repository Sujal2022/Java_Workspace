package task_173;

import java.util.Scanner;

public class Min_Number 
{
	public static void main(String[] args) 
	{
		Scanner max= new Scanner(System.in);
		System.out.println("Enter The A Value:");
		int a= max.nextInt();
		System.out.println("Enter The B Value:");
		int b= max.nextInt();
		System.out.println("Enter The C Value:");
		int c= max.nextInt();
		 if (a < b)
		    {
		        if (a < c)
		        {
		        	System.out.println(a+ " is a min number");
		        }
		        else
		        {
		        	System.out.println(c+ " is a min number");
		        }
		    }
		    else
		    {
		        if (b < c)
		        {
		        	System.out.println(b+ " is a min number");
		        }
		        else
		        {
		        	System.out.println(c+ " is a min number");
		        }
		    }
			
	}

}
