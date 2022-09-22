package over;

public class in {


// Write program to implement multilevel as well as Hierarchical inheritance in a same program.	
   public void x()
{
	System.out.println("Name of students of class A");
}
}
//syntax of creating a new class
class B extends in
{
	public void y()
	{
		System.out.println("Name of student of class B");
		
	}
}
class C extends B
{
	public void z()
	{
		System.out.println("Name of student of class C");	
	}
}

class F
{
	public static void main(String args[])
	{
		in a1 = new in();
	System.out.println("Using  the class A");
	a1.x();
	B b1 = new B();
	System.out.println("Using the class B");
	b1.x();
	b1.y();
	C c1 = new C();
	System.out.println("Using the class C");
	c1.x();
	c1.y();
	c1.z();
	
	
	}
}
