package every_day;

import java.util.Scanner;

public class to_reverce_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String set=sc.nextLine();
        String newstr="";
        for (int i=set.length()-1;i>=0;--i)
        {

             newstr+= set.toString().charAt(i);


        }
        System.out.println(newstr);
    }
}
