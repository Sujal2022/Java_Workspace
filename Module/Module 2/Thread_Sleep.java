package Module_2_2;

public class Thread_Sleep 
{
	public static void main(String[] args) 
	{
		

		 Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
	     Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

	     thread1.start();
	     thread2.start();
	        
	        try 
	        {
	            Thread.sleep(6000);
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread exiting.");
	    }
		
	

}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting.");
    }
}
