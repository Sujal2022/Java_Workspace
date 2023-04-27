package Module_2_2;

public class exce 
{
	public static void main(String[] args) 
	{
		 int[] a = new int[5];
		 try 
		 {
			 a[5] = 30/0;
		 } 
		 catch (ArithmeticException e) 
		 {
			 System.out.println("Divide by zero exception: " + e.getMessage());
		 }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Array index out of bounds exception: " + e.getMessage());
		 }
		//catch (Exception e) 
		 //{
			//System.out.println("Some other exception occurred: " + e.getMessage());
		//}
	}

	private String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
