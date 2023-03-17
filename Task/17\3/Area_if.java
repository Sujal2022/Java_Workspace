package task_173;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Area_if 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Triangle");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("Enter Your Choice:");
		int choice= sc.nextInt();
		  double area = 0.0;
		  if(choice == 1)
		  {
			  System.out.println("-*-*-*-*-* Triangle *-*-*-*-*-");
			  System.out.println("Enter Base Value:");
			  double base= sc.nextDouble();
			  System.out.println("Enter Height Value:");
			  double height= sc.nextDouble();
			  area = 0.5*base*height;
		  }
		  else if(choice == 2)
		  {
			  System.out.println("-*-*-*-*-* Rectangle *-*-*-*-*-");
			  System.out.println("Enter Widht Value:");
			  double widht= sc.nextDouble();
			  System.out.println("Enter Height Value:");
			  double height= sc.nextDouble();
			  area = widht*height;
		  }
		  else if(choice == 3)
		  {
			  System.out.println("-*-*-*-*-* Circle *-*-*-*-*-");
			  System.out.println("Enter Radius Value:");
			  double radius= sc.nextDouble();
			  area= 3.14*radius*radius;
		  }
		  else
		  {
			  System.out.println("Enter Valid Choice");
			  System.exit(0);
		  }
		  System.out.println(area);
		
	}

}
