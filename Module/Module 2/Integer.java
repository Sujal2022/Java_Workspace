package Module_2_1;

public class Integer 
{
	 public void print(int a, char b) 
	 {
	        System.out.println("Integer: " + a + ", Character: " + b);
	 }

	    public void print(char b, int a) 
	    {
	        System.out.println("Character: " + b + ", Integer: " + a);
	    }

	    public static void main(String[] args) 
	    {
	        Integer in = new Integer();
	        in.print(12, 's'); 
	        in.print('k', 20); 
	    }

}
