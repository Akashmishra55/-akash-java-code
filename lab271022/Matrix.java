package lab271022;

import java.io.DataInputStream;
import java.io.IOException;

//wap to print 4*4 matrix
public class Matrix {
	
		public static void main(String []args) throws NumberFormatException, IOException
		{
			int ar[][]=new int[4][3];
		 DataInputStream  am=new DataInputStream(System.in);
		 System.out.println("Enter 12 Elements for 4*3 array");
		 for(int i=0;i<=3;i++)
		 {
		 	for( int j = 0;j<=2;j++)
		 	{
		 		ar[i][j]=Integer.parseInt(am.readLine());
		 	}
		 	System.out.println("Array elements are");
		 	for(i=0;i<3;i++)
		 	{
		 		for(int j = 0;j<=2;j++)
		 		{
				System.out.print(ar[i][j]+"");
		 	}
		 	System.out.println();
		 	}
		 }
		}
		}    