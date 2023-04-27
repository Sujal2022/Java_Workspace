package Module_2_2;

import java.util.ArrayList;

public class First_Position 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<String>();
		mobile.add("APPLE");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 mobile.add(0, "ONEPLUS");
		 
	       
	        System.out.println(mobile);
	}

}
