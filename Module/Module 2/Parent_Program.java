package Module_2;

abstract class base
{
	//abstract message method
	void message(){}
}
class subclass1 extends base
{
	void message()
	{
		System.out.println("This is First Subclass");
	}
}
class subclass2 extends base 
{
	void message()
	{
		System.out.println("This is Second Subclass");
	}
}

public class Parent_Program 
{
	public static void main(String[] args) 
	{
		//create an object
		subclass1 s1 = new subclass1();
		subclass2 s2 = new subclass2();
		//call the each method
		s1.message();
		s2.message();	
	}
}
