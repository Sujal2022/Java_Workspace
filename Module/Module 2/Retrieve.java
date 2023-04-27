package Module_2_2;

import java.util.ArrayList;

public class Retrieve 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 String mobiletype = mobile.get(1);
		 
		 System.out.println("Element at index 1: " + mobiletype);

	}

}
