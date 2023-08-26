package every_day;
import java.util.Scanner;
public class SimplePrimeRecursion {
    // Recursive function to check if a number is prime
  static boolean isprime(int num,int diviser)
  {
      if (diviser<=1)
      {
          return true;
      }
      if (num%diviser==0)
      {
          return false;
      }
      return isprime(num,diviser-1);
  }
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if (isprime(num,num-1))
        {
            System.out.println("this is prime");
        }
        else {
            System.out.println("this is not prime");
        }

    }
}