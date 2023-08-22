package every_dat;

import java.util.Scanner;

public class sum_by_using_recurtion {
   static int sum(int num)

    {
        if (num!=0)
        {
            return num+sum(num-1);
        }
        else {
        return num;}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int i=sc.nextInt();
        System.out.println("sum of natural number upto "+i+" is "+sum(i));
    }
}
