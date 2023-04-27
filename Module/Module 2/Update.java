package Module_2_2;

import java.util.ArrayList;

public class Update 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 mobile.set(3, "SAMSUNG");
	        
	        System.out.println(mobile);
	}

}
