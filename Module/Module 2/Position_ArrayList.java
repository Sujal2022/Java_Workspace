package Module_2_1;

import java.util.ArrayList;

public class Position_ArrayList 
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
		
		 for(int i = 0; i < mobile.size(); i++) 
		 {
			 System.out.println("Element at position " + i + ": " + mobile.get(i));
		 }
		
	}

}
