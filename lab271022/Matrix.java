package lab271022;

import java.io.*;
//wap to print 4*4 matrix
public class Matrix {
	public static void main(String args[])throws Exception
	{
		int ar[][]=new int[4][4];
		DataInputStream dis= new DataInputStream(System.in);
		System.out.println("Enter  Elements for 4*4  array:");
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				ar[i][j]=Integer.parseInt(dis.readLine());
				
			}
			System.out.println("Array Elements are:");
			for(i=0;i<=3;i++)
			{
				for( int j = 0;j<=2;j++)
				{
					System.out.print(ar[i][j]+"");		
				}
				System.out.println();
			}
		}
	}
}
