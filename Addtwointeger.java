package programizexample;

import java.util.Scanner;

public class Addtwointeger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1=sc.nextInt();
        System.out.println("Enter the secound number ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("the sum of two number is :"+sum);

    }
}
