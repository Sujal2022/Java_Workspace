package Module_2_1;

import java.util.*;

public class InterleavingEx 
{
	public static List<String> findInterleavings(String s1, String s2) 
	{
        List<String> interleavingsList = new ArrayList<>();

        if (s1.isEmpty() && s2.isEmpty()) 
        {
            return interleavingsList;
        }

        if (s1.isEmpty()) 
        {
            interleavingsList.add(s2);
            return interleavingsList;
        }

        if (s2.isEmpty()) 
        {
            interleavingsList.add(s1);
            return interleavingsList;
        }

        for (String interleaving : findInterleavings(s1.substring(1), s2)) 
        {
            interleavingsList.add(s1.charAt(0) + interleaving);
        }

        for (String interleaving : findInterleavings(s1, s2.substring(1))) 
        {
            interleavingsList.add(s2.charAt(0) + interleaving);
        }

        return interleavingsList;
    }
	 public static void main(String[] args) 
	 {
	        String s1 = "WX";
	        String s2 = "YZ";
	        List<String> interleavingsList = findInterleavings(s1, s2);
	        System.out.println("Interleavings of " + s1 + " and " + s2 + ": " + interleavingsList);
	    }

}
