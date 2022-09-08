 //1. Write a java program to check a number is prime or not ? ( Using method is recommended )

class PrimeDemo
{
  public static void main(String[] args) // using main method
  {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a no: ");
    int num = sc.nextInt();
    boolean flag = false;    // showing value is true or false
    for (int i = 2; i <= num / 2; ++i) 
    {
      if (num % i == 0) 
      {
        flag = true;
       break;         
     }
    }
    if (!flag)
      System.out.println(num + " is a prime number.");  // if number is prime then print 
    else
      System.out.println(num + " is not a prime number.");  // if number is not prime then print
  }
}
