package Module_2;

import java.util.Scanner;

public class Count_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int count=0;
		
		System.out.print("Enter The Number:");
		int num = sc.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in the number:" +count);	
	}
}
