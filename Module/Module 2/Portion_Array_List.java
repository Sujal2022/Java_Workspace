package Module_2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Portion_Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mobile = new ArrayList<>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the start index:");
	     int start = sc.nextInt();
	     System.out.print("Enter the end index:");
	     int end = sc.nextInt();
		
	     ArrayList<String> mobilelist = new ArrayList<String>(mobile.subList(start, end));

	     System.out.println("Extracted Sub-List: " + mobilelist);
		
	}

}
