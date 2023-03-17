package task_173;

import java.util.Scanner;

public class Total_Percentage 
{
	public static void main(String[] args) 
	{
		Scanner pe= new Scanner(System.in);
		System.out.println("Enter The Eng Mark:");
		int eng= pe.nextInt();
		System.out.println("Enter The Maths Mark:");
		int math= pe.nextInt();
		System.out.println("Enter The Science Mark:");
		int sci= pe.nextInt();
		System.out.println("Enter The SS Mark:");
		int ss= pe.nextInt();
		System.out.println("Enter The Hindi Mark:");
		int hindi=pe.nextInt();
		int total = eng+math+sci+ss+hindi; 
		float per = total/5;
		if(math>=33&&sci>=33&&ss>=33&&hindi>=33&&eng>=33)
		{
			System.out.println("Total Mark: "+total);
			System.out.println("Percentage: "+per);
			if(per>75)
			{
				System.out.println("Distinction");
			}
			else if ((per>60)&&(per<=75))
			{
				System.out.println("\nFirst Class");
			}
	    	else if((per>50)&&(per<=60))
	    	{
	    		System.out.println("\nSecond Class");
	    	}
	    	else if ((per>35)&&(per<=50))
	    	{
	    		System.out.println("\nPass Class");
	    	}
		}	
	    else 
	    {
	    	System.out.println("\nFail");
	    }
	}

}
