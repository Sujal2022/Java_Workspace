package Module_2_1;

import java.util.HashSet;
import java.util.Set;

public class Compare_Two_Set 
{
	public static void main(String[] args) 
	{
		Set<String> mobile = new HashSet<>();
		Set<String> mobile1 = new HashSet<>();
		
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		
		mobile1.add("ONEPLUS");
		mobile1.add("VIVO");
		mobile1.add("MI");
		mobile1.add("SAMSUNG");


		mobile.retainAll(mobile1);
	        
	        System.out.println("Elements that are common to both sets: " + mobile);
		
		
	}

}
