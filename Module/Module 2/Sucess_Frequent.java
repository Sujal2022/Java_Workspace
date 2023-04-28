package Module_2_2;

import java.util.*;

public class Sucess_Frequent 
{
	public static void main(String[] args) 
	{
		
		String string = "successes";
		  
		Map<Character, Integer> map = new HashMap<>();
		for (char c : string.toCharArray()) 
		{
			if (map.containsKey(c)) 
			{
				map.put(c, map.get(c) + 1);
			} 
			else 
			{
				map.put(c, 1);
			}
		}
	        
		List<Map.Entry<Character, Integer>> s = new ArrayList<>(map.entrySet());
		s.sort((a, b) -> b.getValue().compareTo(a.getValue()));
		
		char s1 =s.get(1).getKey();

		System.out.println("The second most frequent character in the string is: " + s1);
		
	}

}
