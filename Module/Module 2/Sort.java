package Module_2_1;

import java.util.ArrayList;
import java.util.Collections;

public class Sort 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		  Collections.sort(mobile);

	        
	        System.out.println(mobile);
	}

}
