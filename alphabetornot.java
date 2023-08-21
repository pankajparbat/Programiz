package programizexample;

import java.util.Scanner;

public class alphabetornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        if ((c>'a' &&c<'z')||(c>'A' && c<'Z'))
        {
            System.out.println("this is alphabet..");

        }
        else
        System.out.println("this is not alphabet.....");
    }
}
