package Module_2_2;

public class Thread_Twice extends  Thread
{
	 public void run() 
	 {
		 System.out.println("Thread is running...");
	 }
	public static void main(String[] args) 
	{
		Thread_Twice t1 = new Thread_Twice();
	        t1.start();
	        t1.start();
	}

}
