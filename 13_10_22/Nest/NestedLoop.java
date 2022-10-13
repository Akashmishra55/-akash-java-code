package Nest;

public class NestedLoop {
public static void main(String args[])
{
	int a;
	int b;
	for(a=5;a<=10;a++)
	{
		for(b=5;b<=a;b++)
		{
			System.out.print(b);
		}
		System.out.println();
	}
}
}
