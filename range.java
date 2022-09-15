/**2. Print all the prime numbers within a given range by user.
**/

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int i, number, count; 
		
		System.out.println(" Prime Numbers from 50 to 500 are : ");	
		for(number = 50; number <=500; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}
