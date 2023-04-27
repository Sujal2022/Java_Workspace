package Module_2_2;

import java.util.HashMap;
import java.util.Map;

public class Map_Program 
{
	public static void main(String[] args) 
	{
		 Map<String, Integer> map = new HashMap<>();

	     
	        if (map.isEmpty()) 
	        {
	            System.out.println("Map is empty.");
	        } else 
	        {
	            System.out.println("Map is not empty.");
	        }
	        
	        map.put("ONEPLUS", 1);

	        if (map.isEmpty()) 
	        {
	            System.out.println("Map is empty.");
	        } 
	        else 
	        {
	            System.out.println("Map is not empty.");
	        }
	}

}
