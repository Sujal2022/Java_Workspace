package Module_2;

public class Java_Exercise 
{
	public static void main(String[] args) 
	{
		//Print The Java Exercises
		String s1 = "Java Exercises";
		String s2 = "Java Exercise";
		
		String s = "se";
		
		boolean ends1 = s1.endsWith(s);
		boolean ends2 = s2.endsWith(s);
		//Display the String
		System.err.println("'" + s1 + "' ends with " +"'" + s + "' ? " + ends1);
		System.out.println("'" + s2 + "' ends with " + "'" + s + "' ? " + ends2);
		
	}

}
