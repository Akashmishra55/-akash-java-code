package Full;

import java.util.Scanner;

public class Enter {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number.");

	num=sc.nextInt();
	if(num>0)
	{
		System.out.println("The number is positive.");
	}
		else if(num<0)
		{
			System.out.println("The number is nagative.");
		}
			else
			{
				System.out.println("The number is zero.");
		}
	}

}


