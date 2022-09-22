// Write program to implement multilevel as well as Hierarchical inheritance in a same program.	
   class A
{
public void method()
{
	System.out.println("Name of students of class A");
}
}
//syntax of creating a new class
class B extends A
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
class D extends A
{
public void get()
{
System.out.println("Name of student of class D");	
	}
}

class HerachicalIn
{
	public static void main(String args[])
	{
		B a1 = new B();
	C b2 = new C();
D c2 = new D();
a1.method();
b2.method();
c2.method();	
	}
}
