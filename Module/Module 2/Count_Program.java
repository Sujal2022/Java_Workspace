package Module_2;

public class Count_Program 
{
	public static void main(String[] args) 
	{
		String test = "sujalkhunt 8000 @gmail.com";
		count(test);
	}
		public static void count(String x)
		{
			char[] c = x.toCharArray();
			int letter = 0;
			int number = 0;
			int space = 0;
			int other = 0;
			
			for(int i=0;i<x.length();i++)
			{
				if(Character.isLetter(c[i]))
				{
					letter++;
				}
				else if(Character.isDigit(c[i]))
				{
					number++;
				}
				else if(Character.isSpaceChar(c[i]))
				{
					space++;
				}
				else
				{
					other++;
				}
				
				System.out.println("The String is:sujalkhunt 8000 @gmail.com ");
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + number);
				System.out.println("other: " + other);
			}
		}
		
}
