package Module_2_1;

import java.util.HashSet;

public class Append 
{
	public static void main(String[] args) 
	{
		HashSet<String> mobile = new HashSet<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 System.out.println("Original HashSet: " + mobile);
	      
		 mobile.add("SAMSUNG");
	      
	      System.out.println("HashSet after adding new element: " + mobile);
	}
	

}
