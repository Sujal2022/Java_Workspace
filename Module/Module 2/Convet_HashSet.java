package Module_2_1;

import java.util.HashSet;

public class Convet_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> mobile = new HashSet<>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 String[] array = mobile.toArray(new String[mobile.size()]);
		 
		 System.out.println("Array: ");
	        for (String str : array) 
	        {
	            System.out.println(str);
	        }
		
	}

}
