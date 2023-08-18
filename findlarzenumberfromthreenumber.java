package programizexample;

import java.util.Scanner;

public class findlarzenumberfromthreenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the first no ");
        int num1=sc.nextInt();
        System.out.println("eneter the secound no ");
        int num2=sc.nextInt();
        System.out.println("eneter the third no ");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3 )
        {
            System.out.println("the largest number is "+num1);
        }
        else if (num2>num3)
        {
            System.out.println("the largest number is "+num2);
        }
        else {
            System.out.println("the largest number is "+num3);

        }
    }
}
