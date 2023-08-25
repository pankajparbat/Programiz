package every_day;

import java.util.Scanner;

public class Power  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value ");
        int b=sc.nextInt();
        System.out.println("Enter the exponecial value ");
        int e=sc.nextInt();
        int num=b;
        int result=1;
        int newnum=0;
        while (e != 0) {
            result *= b;
            --e;
        }
        System.out.println("The digits in your "+num+" number is "+result);
    }
}
