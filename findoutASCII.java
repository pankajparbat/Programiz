package programizexample;

import java.util.Scanner;

public class findoutASCII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the chareter value ");
        char ch=sc.nextLine().charAt(0);
        int ASCII=ch;
        System.out.println("ascii value of char is "+ASCII);


    }
}
