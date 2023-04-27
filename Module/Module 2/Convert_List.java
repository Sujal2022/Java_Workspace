package Module_2_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Convert_List 
{
	public static void main(String[] args) 
	{
		HashSet<String> mobile = new HashSet<>();
		
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		List<String> list1 = new ArrayList<>(mobile);
		
		 System.out.println("ArrayList: " + mobile);
	}
}
