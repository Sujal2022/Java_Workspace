package Module_2;

public class Check_Program 
{
	public static void main(String[] args) 
	{
		String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

        // The String to check the above two Strings to see
        // if  start with this value (Red).
        String s = "Red";

        // Do either of the first two Strings start with startStr?
        boolean s1 = str1.startsWith(s);
        boolean s2 = str2.startsWith(s);

        // Display the results of the startsWith calls.
        System.out.println( str1 + " starts with " + s + "? " + s1);
        System.err.println(str2 + " starts with " +s + "? " + s2);
		
	}

}
