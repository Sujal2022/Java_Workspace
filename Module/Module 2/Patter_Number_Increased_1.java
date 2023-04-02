package Module_2;

public class Patter_Number_Increased_1 
{
	public static void main(String[] args) 
	{
		int i,j,s=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(s+" ");
				s++;
			}
			System.out.println(" ");
		}	
	}
}
