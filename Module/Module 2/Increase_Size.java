package Module_2_2;

import java.util.ArrayList;

public class Increase_Size 
{
	public static void main(String[] args) 
	{
		
        ArrayList<String> mobile = new ArrayList<>();
        mobile.add("OPPO");
        mobile.add("APPLE");
        mobile.add("MI");

        
        int newSize = 6;
        while (mobile.size() < newSize) 
        {
        	mobile.add(0, null);
        }

        System.out.println("ArrayList: " + mobile);
	}
		
		
	

}
