package Practice_Threads;

class Thread_Priority extends Thread {
public void run ()
{
	System.out.println("Running Thread Priority is:"+Thread.currentThread().
	getPriority());
}
public static void main(String []args) {
	Thread_Priority a1=new Thread_Priority();
	Thread_Priority a2=new Thread_Priority();
	a1.setPriority (Thread.MIN_PRIORITY);
	a2.setPriority (Thread.MAX_PRIORITY);
	a1.start ();
	a2.start ();
}	
}

