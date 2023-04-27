package Module_2_1;


 abstract class Marks
{
	abstract double getpercentage();
}

class A extends Marks
{
	int Maths,Science,SS;
	
	public  A(int Maths,int Science,int SS) 
	{
		this.Maths = Maths;
		this.Science = Science;
		this.SS = SS;
		
	}

	 @Override double getpercentage() 
	 	{ 
		 	return (Maths + Science + SS)/3;
	 	}
	
}
class B extends Marks
{
	int Maths,Science,SS,Computer;
	
	public B(int Maths,int Science,int SS,int Computer) 
	{
		this.Maths = Maths;
		this.Science = Science;
		this.SS = SS;
		this.Computer = Computer;
	}
	
	  @Override double getpercentage() 
	  { 
		  return (Maths + Science + SS +Computer)/4;
	  }
	  
	 
	
}


public class Percentage_Of_Mark 
{
	public static void main(String[] args) 
	{
		A a1 =new A(98,93,92);
		B b1 =new B(93,94,95,90);
		
		System.out.println("Percentage of marks student A is: " + a1.getpercentage() + "%");
        System.out.println("Percentage of marks student B is: " + b1.getpercentage() + "%");
		
	}

}
