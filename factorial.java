package programizexample;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=1;
        for (int i=1;i<=num;i++)
        {
            factorial*=i;
        }
        System.out.println("factorial of the number is "+factorial);
    }
}
