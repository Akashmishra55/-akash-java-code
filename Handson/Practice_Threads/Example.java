package Practice_Threads;

 class Example {
private final String name;
public Example(String name)
{
	this.name = name;
}
String getName()
{
return this.name;
 }
 public synchronized void call(Example caller)
 {
	System.out.println(this.getName()+"has asket top call me "+ caller.getName());
	try {
		Thread.sleep(100);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	caller.callMe(this);
 }
 public synchronized void callMe(Example caller){
	 System.out.println(this.getName()+"has called me "+ caller.getName()); 
 }
 public static void main(String []args){
	 Example caller1  = new Example("caller-1");
	 Example caller2  = new Example("caller-2");
	 new Thread(new Runnable() {
		 public void run() {caller1.call(caller2);}
	 }).start();
	 new Thread(new Runnable() {
		 public void run() {caller2.call(caller1);}
	 }).start();
		 }
 {

}
}