package every_day;

import java.util.Scanner;

public class Palendrom  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value ");
        String strin=sc.nextLine();
        String strin1=strin.toLowerCase();
        String st=strin1;
        String newstrin="";
        for (int i=strin.length()-1;i>=0;i--)
        {
            newstrin+=strin.charAt(i);

        }  if (st.equals(newstrin))
        {
            System.out.println("this string is palendrom");
        }

    }
}
