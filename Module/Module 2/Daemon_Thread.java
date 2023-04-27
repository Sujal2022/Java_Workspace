package Module_2_2;

public class Daemon_Thread extends Thread
{
	public void run() 
	{
		if(Thread.currentThread().isDaemon())
		{  
			System.out.println("Daemon thread executing");  
		}  
		else	
		{  
			System.out.println("user(normal) thread executing");  
		}  
		
	}
	public static void main(String[] args) 
	{
		Daemon_Thread t1=new Daemon_Thread();  
		Daemon_Thread t2=new Daemon_Thread();  
		  t1.setDaemon(true);
		  
		  t1.start();
		  t2.start();
		
	}
	

}
