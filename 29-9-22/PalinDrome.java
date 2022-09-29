package p1;
import java.util.Scanner;
public class PalinDrome
{
	
	//Write a code to check a string is palindrome or not
	public static void main(String[]args)
	{
		String reverse="";
		System.out.println("Enter the input String");
		Scanner sc=new Scanner(System.in);
		String team=sc.nextLine();
	  for(int a=team.length()-1;a>-0;a--)
		  reverse=reverse+team.charAt(a);
	  {
		  if(team.equals(reverse))
		  {
			  System.out.println(" Given String is palindrome");
		  } 
		  else
			  {
				  System.out.println(" Given String is not palindrome");
				  
			  }
		  }
			  
	}
}
	
	    
