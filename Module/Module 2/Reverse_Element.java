package Module_2_1;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Element 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		Collections.reverse(mobile);
		
		 System.out.println("Reversed ArrayList: " + mobile);
	}

}
