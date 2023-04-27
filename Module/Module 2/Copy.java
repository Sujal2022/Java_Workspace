package Module_2_1;

import java.util.ArrayList;

public class Copy 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 ArrayList<String> mobile1 = new ArrayList<String>(mobile);

	        System.out.println("Elements of mobile1:");
	        for (String element : mobile1) 
	        {
	            System.out.println(element);
	        }
	}
}
