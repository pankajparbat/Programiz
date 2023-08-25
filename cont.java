package every_day;

import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int i=sc.nextInt();
        int num=i;
        int cont=0;
        while (i!=0)
        {
            i/=10;
            cont++;
        }
        System.out.println("The digits in your "+num+" number is "+cont);
    }
}
