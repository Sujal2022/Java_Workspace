package Module_2_1;

import java.util.HashSet;

public class Element_Hashset 
{
	public static void main(String[] args) 
	{
		HashSet<String> mobile = new HashSet<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		int size = mobile.size();
		
        System.out.println("Number of elements in the hash set: " + size);
    }
		
	}


