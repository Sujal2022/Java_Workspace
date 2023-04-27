package Module_2_1;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate_HashList 
{
	public static void main(String[] args) 
	{
		HashSet<String> mobile = new HashSet<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 Iterator<String> mobiletype = mobile.iterator();
	        while (mobiletype.hasNext()) 
	        {
	            System.out.println(mobiletype.next());
	        }
		
	}

}
