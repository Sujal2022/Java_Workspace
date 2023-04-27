package Module_2_1;

class shape
{
	 public void  print()
	{
		System.out.println("This is a Shape");
	}
}
class rectangle extends shape
{
	public void print()
	{
		System.out.println("This is rectanglur shape ");
	}
}
class circle extends shape
{
	public void print()
	{
		System.out.println("This is circular shape ");
	}
}
class Square extends rectangle
{
	public void prints()
	{
		System.out.println("Square is a Rectangle");
	}
}

public class Inheritance 
{
	public static void main(String[] args) 
	{
		Square square = new Square();
		square.print();
		square.prints();
	}
}
