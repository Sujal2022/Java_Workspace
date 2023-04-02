package Module_2;

import java.util.Scanner;

public class Sum_Average_Program 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,s=0,u=0;
		double avg;
		{
			System.out.println("Enter Any 5 Number:");
		}
		for(i=0;i<5;i++)
		{
			s = sc.nextInt();
			u +=s;
		}
		avg=u/5;
	System.out.println("The sum of 5 no is : " +u+"\nThe Average is : " +avg);
		
		
	}

}
