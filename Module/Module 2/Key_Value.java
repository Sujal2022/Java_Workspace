package Module_2_1;

import java.util.HashMap;

public class Key_Value 
{
	public static void main(String[] args) 
	{
		HashMap mobile = new HashMap<>();
		
		mobile.put("APPLE", 1);	
		mobile.put("ONEPLUS", 2);
		mobile.put("OPPO", 3);
		mobile.put("VIVO", 4);
		mobile.put("MI", 5);
		  
		  int size = mobile.size();
	      System.out.println("Number of key-value mappings in the map: " + size);
		
		
	}

}
