package Module_2;

public class Comparing_Program 
{
	public static void main(String[] args) 
	{
		String str1 = "topsint.com";
		String str2 = "Topsint.com";
		
		CharSequence cs = "topsint.com";
		
		System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
	    System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
		
	} 

}
