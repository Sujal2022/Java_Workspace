package Module_2;

abstract class parent
{
	void message(){}
}
class subclass1 extends parent
{
	void message()
	{
		System.out.println("This is First Subclass");
	}
}
class subclass2 extends parent 
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
		subclass1 s1 = new subclass1();
		subclass2 s2 = new subclass2();
		
		s1.message();
		s2.message();	
	}
}
