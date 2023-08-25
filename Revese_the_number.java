package every_day;

import java.util.Scanner;

public class Revese_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int i=sc.nextInt();
        int num=i;
        int newnum=0;
        while (i!=0)
        {
            int rem=i%10;
            newnum=(newnum*10)+rem;
            i/=10;
        }
        System.out.println("The digits in your "+num+" number is "+newnum);
    }
}
