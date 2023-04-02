package Module_2;

public class Divisible_3_5_Program 
{
	public static void main(String[] args) 
	{
		//first print divisible by 3
		System.out.println("\nEnter The Number Divided By 3:");
		//use loop
		for(int i=1;i<100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i + " ");
			}
		}
		//second divisible by 5
		System.out.println("\nEnter The Number Divided By 5:");
		//use loop
		for(int i=1;i<100;i++)
		{
			if(i%5==0)
			{
				System.out.print(i + " ");
			}
		}
		//here 3&5 both divisible number are print
		System.out.println("\nEnter The Number Divided By 3&5:");
		//use loop
		for(int i=1;i<100;i++)
		{
			if(i%3==0 &&i%5==0 )
			{
				System.out.print(i + " ");
			}
		}	
	}
}
