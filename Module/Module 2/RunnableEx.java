package Module_2_2;

public class RunnableEx implements Runnable
{
	public void run() 
	{
		 System.out.println("Thread Is Running");
	}	 
	public static void main(String[] args) 
	{
		RunnableEx run = new RunnableEx();
		Thread thread = new Thread(run);
		thread.start();
		
	}
		
		
	

}
