package programizexample;

import java.util.Scanner;

public class findoutthenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the devided ");
       int num1=sc.nextInt();
        System.out.println("Enter the diviser ");
        int num2=sc.nextInt();
        int reminder=num1%num2;
        int quetiont=num1/num2;
        System.out.println("Reminder is :"+reminder);
        System.out.println("Quetiont is :"+quetiont);
    }
}
