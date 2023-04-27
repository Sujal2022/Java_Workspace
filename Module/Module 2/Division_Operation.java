package Module_2_2;

public class Division_Operation 
{
	public static void main(String[] args) 
	{
		try 
		{
			int n1 = Integer.parseInt(args[1]);
			int n2 = Integer.parseInt(args[0]);
			
			int result = n1/n2;
			
            System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) 
		{
            System.out.println("Error: Division by zero");
        } 
		catch (NumberFormatException e) 
		{
            System.out.println("Error: Invalid input format");
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Error: Missing input arguments");
        } 
		catch (Exception e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
		
	}

}
