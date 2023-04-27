package Module_2_1;

import java.util.Scanner;

public class MemberEx 
{
	String name;
	String age;
	int number;
	String address;
	double salary;
	
	public MemberEx(String name,String age,	int number,	String address,double salary)
	{
		this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
	}
	public void getsalary()
	{
		System.out.println("Salary of " + name + " is: " + salary);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter phone number: ");
        String number = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        MemberEx m1 = new MemberEx(name, number, age, address, salary);
        m1.getsalary();
	}

}
