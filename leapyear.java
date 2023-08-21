package programizexample;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean leap=false;
        System.out.println("enter the year ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0){
                    leap=true;

                }
                else {
                   leap=false;

                }
            }
           leap=true;
        }
        else {
            leap=false;
        }

        if (leap)
        {
            System.out.println("this is leap year....");
        }
        else {
            System.out.println("this is not leap year....");
        }
    }
}
