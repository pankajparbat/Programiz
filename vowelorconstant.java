package programizexample;

import java.util.Scanner;

public class vowelorconstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the char ");
        char ch=sc.nextLine().charAt(0);
       if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
       {
           System.out.println("this is vowel");
       }
       else {
        System.out.println("this is constat");}
    }
}
