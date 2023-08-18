package programizexample;

import java.util.Scanner;

public class findsumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number that you went to sum a natural number ");
        int num=sc.nextInt();
        int sum=0;
        for (int i=0;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("sum of natural number is "+sum);
    }
}
