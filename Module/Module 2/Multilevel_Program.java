package Module_2;

class parent
{
	void a()
	{
		System.out.println("This is a Parent Class");
	}
}
class child extends parent
{
	void b()
	{
		System.out.println("This is Child 1 Class");
	}
}
class Child1 extends child
{
	void c()
	{
		System.out.println("This is Child 2 Class");
	}
}
public class Multilevel_Program 
{
	public static void main(String[] args)
	{
		Child1 c =new Child1();
		
		c.a();
		c.b();
		c.c();
		
	}
}
