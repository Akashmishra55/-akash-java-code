package Practice_Threads;
 class Multitread {
public static void main(String []args)
{
	Thread Example1 = new Thread("Virat");
	Thread Example2 = new Thread("Run Machinee");
	Example1.start();
	Example2.start();
	System.out.println("Threads names are: ");
	System.out.println(Example1.getName());
	System.out.println(Example2.getName());
}
public void run()
{
}
 }
