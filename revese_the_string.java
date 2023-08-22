package programizexample;

import java.util.Arrays;
import java.util.Scanner;

public class revese_the_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();

        String rev="";
        for (int i=string1.length()-1;i>=0;i--)
        {
            rev+=string1.charAt(i);
        }
        if (string1.equals(rev))
        {
            System.out.println("this is a palendrom serise");
        }
        else {
            System.out.println("this is not palendrom");
        }
    }
}
