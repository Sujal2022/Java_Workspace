package Module_2_2;

import java.util.ArrayList;

public class Color 
{
	 public static void main(String[] args) 
	 {
	        ArrayList<String> colors = new ArrayList<>();
	        
	        colors.add("Red");
	        colors.add("White");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Orange");
	        colors.add("Yellow");
	        colors.add("Purple");
	        colors.add("Brown");
	        colors.add("Black");
	        
	        System.out.println("Colors in the list:");
	        
	        for (String color : colors) 
	        {
	            System.out.println(color);
	        }
	    }
}
