package Module_2_2;

import java.util.ArrayList;

public class Compare_Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<>();
		ArrayList<String> mobile1 = new ArrayList<>();
		
		mobile.add("OPPO");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("Reno");
		
		mobile1.add("OPPO");
		mobile1.add("ONEPLUS");
		mobile1.add("SAMSUNG");
		mobile1.add("APPLE");
		
		boolean m = mobile.equals(mobile1);
		 if(m) 
		 {
	            System.out.println("The two ArrayLists are equal.");
	        }
		 else 
		 {
	            System.out.println("The two ArrayLists are not equal.");
		 }
	}
}
