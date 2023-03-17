package task_173;

import java.util.Scanner;

public class Prime_Number 
{
	public static void main(String[] args) 
	{ 
		int i,c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Value:");
		int id = sc.nextInt();
		
		for(i=2;i<id;i++)
		{
			if(id%i==0)
			{
				c++;
			}				
		}
		if(c==0)
		{
			System.out.println("Prime Number.");
		}
		else
		{
			System.out.println("Not Prime Number.");
		}
	}

}
