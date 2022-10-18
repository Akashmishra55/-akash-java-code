package array;
import java.util.Scanner;
public class SubTwo 
{
	public static void main(String []args)
	{
		int a[][],b[][],c[][],i,j;
		a=new int[3][3];
		b=new int[3][3];
		c=new int[3][3];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first Matrix");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=input.nextInt();
		System.out.println("Subtraction...");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+"\t");	
			}
			System.out.println();
			
}
	}
}