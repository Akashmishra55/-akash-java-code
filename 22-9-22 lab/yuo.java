
/**1. Write program to show method overriding using a Bank class as super class and 
create some sub class accordingly. Write at least two common method and change the 
implementation in subclass. Display the implementation of each subclass with object."
**/

public class A
{
	public void main()
	{
System.out.println("Student of class A");
	}
}
class B extends A
{
	public void main()
	{
		System.out.println("Student of class B");
	}
public void demo()
{
	System.out.println("Calling the derived class");
	main();
	System.out.println("Calling the super class");
	super.main();	
}	
}
class overriding
{
	public static void main(String ar[])
	{
		B b1 = new B();
		b1.demo();
		
				
	}
	
}
	

		
	

