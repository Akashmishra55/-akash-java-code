package Practice_Threads;

public class Default_ThreadCon {
	public static void main(String []args) {
		Thread t1=new Thread();
		t1.start();
		System.out.println("Thread name has been created:"+t1.getName());
	}
}
