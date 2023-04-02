package Module_2;

class square
{
	 void Area(float l,float b)
	{
		float A=l*b;
		System.out.println("Area Of Rectangle Is:" +A);
		
	}
	 void Area(double s)
	{
		double D=s*s;
		System.out.println("Area Of Rectangle Is:" +D);
		
	}	
}
public class Area_Square_Rectangle 
{

	public static void main(String[] args) 
	{
		square obj = new square();
		
		obj.Area(5);
		obj.Area(5, 3);
	}

}
