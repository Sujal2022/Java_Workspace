package Module_2_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection_Program 
{
	public static void main(String[] args) 
	{
		Map mobile = new HashMap();
		
		mobile.put(1, "OPPO");
		mobile.put(2, "ONEPLUS");
		mobile.put(3, "APPLE");
		mobile.put(4, "VIVO");
		mobile.put(5, "SAMSUNG");
		
		 Collection values = mobile.values();
		
		  System.out.println("Values in the collection view: " + values);
		
		
		
	}

}
