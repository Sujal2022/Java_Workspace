package Module_2_2;

import java.util.ArrayList;

public class Replace_Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<>();
		
		mobile.add("APPLE");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		System.out.println("ArrayList before replacing the second element: " + mobile);
		
		mobile.set(1, "ONEPLUS");
		
		System.out.println("ArrayList after replacing the second element: " + mobile);

		
	}

}
