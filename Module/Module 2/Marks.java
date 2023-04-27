package Module_2_2;

import java.util.Scanner;

abstract class Shape
{
	abstract void rectanglearea( int lenght,int breath);
	abstract void squarearea(int side);
	abstract void circlearea(float radius);
	
}
class Area extends Shape
{

	@Override
	void rectanglearea(int lenght, int breath) 
	{
		int area = lenght*breath;
		System.out.println("Area of Rectangle:" +area);
	}

	@Override
	void squarearea(int side) 
	{
		int area = side*side;
		System.out.println("Area of Square:" +area);
	}

	@Override
	void circlearea(float radius) 
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle:" +area);
		
	}
	
}


public class Marks 
{
	public static void main(String[] args) 
	{
		Shape s = new Area();
		s.rectanglearea(5, 7);
		s.squarearea(10);
		s.circlearea(25);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Marks Out Of 100:");
		int marks = sc.nextInt();
		System.out.println("Grade:" +getGrade(marks));
		
	}
	public static String getGrade(int marks)
	{
		  	if (marks >= 91 && marks <= 100) 
		  	{
		  		return "A";
		  	}
		  	else if (marks >= 81 && marks <= 90) 
		  	{
	            return "B";
	        } 
		  	else if (marks >= 71 && marks <= 80) 
	        {
	            return "C";
	        }
	        else if (marks >= 61 && marks <= 70) 
	        {
	            return "D";
	        }
	        else if (marks >= 51 && marks <= 60) 
	        {
	            return "E";
	        }
	        else if (marks >= 41 && marks <= 50) 
	        {
	            return "F";
	        }
	        else 
	        {
	            return "Fail";
	        }
	}
}
