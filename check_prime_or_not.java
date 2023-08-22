package programizexample;

import java.util.Scanner;

public class check_prime_or_not {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int i;
        if (num>0)
        {
            for ( i=2;i<num;i++)
            {
                if (num%i==0)
                {
                    System.out.println("this is not prime");
                    break;
                }

            } if (i==num)
        {
            System.out.println("this is prime");
        }



        }
    }
}
