package Module_2_2;

public class Student 
{
	int rollno;
	String name;
	int age;
	String course;
	
	public Student(int rollno, String name, int age, String course) throws Exception
	{
		this.rollno = rollno;
        if (age < 15 || age > 21)
        {
            throw new AgeNotWithinRangeException("Age not within range (15-21)");
        }
        this.age = age;
        if (name.matches("^[a-zA-Z\\s]*$")) 
        {
            throw new NameNotValidException("Name is not valid");
        }
        this.name = name;
        this.course = course;
	}
	 	public int getrollno() 
	 	{
	 		return rollno;
	 	}
	    
	    public String getName() 
	    {
	        return name;
	    }
	    
	    public int getAge() 
	    {
	        return age;
	    }
	    
	    public String getCourse() 
	    {
	        return course;
	    }
	    
	    public static void main(String[] args) throws Exception 
	    {
	    	 try 
	    	 {
	             Student student = new Student(1, "Virat Kohli", 22, "BCA");
	         } 
	    	 catch (AgeNotWithinRangeException | NameNotValidException e) 
	    	 {
	             System.out.println(e.getMessage());
	         }
			
		}
     

}
class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}
class NameNotValidException extends Exception 
{
    public NameNotValidException(String message) 
    {
        super(message);
    }
}