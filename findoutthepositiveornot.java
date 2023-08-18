package programizexample;

import java.util.Scanner;

public class findoutthepositiveornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0)
        {
            System.out.println("this is positive number");
        }
        else {
            System.out.println("this is negative number");
        }
    }
}
