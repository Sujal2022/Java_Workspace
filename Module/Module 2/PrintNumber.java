package Module_2_1;

public class PrintNumber 
{ 
	public int print(int a)
	{
		System.out.println(a);
		return a;
	}
	public double print(double a) 
	{
		System.out.println(a);
		return a;
	}
	public float print(float a) 
	{
		System.out.println(a);
		return a;
	}
	public String print(String a) 
	{
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) 
	{
		PrintNumber a = new PrintNumber();
		a.print(12);
		a.print(12.025);
		a.print(12.5);
		a.print("Sujal1");
		
	}
}
