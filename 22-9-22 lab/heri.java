
class A {


// Write program to implement multilevel as well as Hierarchical inheritance in a same program.	
   
public void set()
{
	System.out.println("Name of students of class A");
}
}
//syntax of creating a new class
class K extends A
{
	public void get()
	{
		System.out.println("Name of student of class B");
		
	}
}
class C extends A
{
	public void check()
	{
		System.out.println("Name of student of class C");	
	}
}

class HerachicalIn
{
	public static void main(String args[])
	{
		A a1 = new A();
	System.out.println("Using object of class A");
	a1.set();
	K b1 = new K();
	System.out.println("Using object of class B");
	b1.set();
	b1.get();
	C c1 = new C();
	System.out.println("Using object of class C");
	c1.set();
	c1.check();
	
	
	}
}
