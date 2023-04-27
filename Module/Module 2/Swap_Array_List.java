package Module_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swap_Array_List 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> mobile = new ArrayList<>();
		mobile.add("APPLE");
		mobile.add("ONEPLUS");
		mobile.add("SAMSUNG");
		mobile.add("OPPO");
		mobile.add("VIVO");
		mobile.add("MI");
		
		 System.out.println("Before swapping:");
	     System.out.println(mobile);
	     
	     System.out.print("Enter The Swap Value:");
	     int mo = sc.nextInt();
	     int mo1 = sc.nextInt();
	     
	     Collections.swap(mobile, mo, mo1);
	     
	     System.out.println("After swapping:");
	     System.out.println(mobile);
		
	}

}
