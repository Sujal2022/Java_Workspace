package Module_2_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Search 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<String>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        String mobiletype  = input.nextLine();
        
	        int index = mobile.indexOf(mobiletype);

	        if (index == -1) {
	            System.out.println(mobiletype + " is not present in the ArrayList");
	        } else {
	            System.out.println(mobiletype + " is present at index " + index + " in the ArrayList");
	        }
	}

}
