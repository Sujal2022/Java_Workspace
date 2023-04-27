package Module_2_2;

public class ThreadEx extends Thread
{
	public void run() 
	{
		System.out.println("Thread Is Running");
		
	}
	 public static void main(String[] args) 
	 {
		 ThreadEx th = new ThreadEx();
		 th.start();
	    }

}
