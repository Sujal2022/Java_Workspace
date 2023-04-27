package Module_2_2;

import java.util.ArrayList;
import java.util.List;

public class Join_Two_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<>();
		ArrayList<String> mobile1 = new ArrayList<>();
		
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		
		mobile1.add("OPPO");
		mobile1.add("MI");
		mobile1.add("RENO");
		
		List<String> mobilelist = new ArrayList<>();
		mobilelist.addAll(mobile);
		mobilelist.addAll(mobile1);
		
		 System.out.println("Joined ArrayList: " + mobilelist);

	}

}
