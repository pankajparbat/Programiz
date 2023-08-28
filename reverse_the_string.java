package every_day;

import java.util.Scanner;

public class reverse_the_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine();
        for (int i=sen.length()-1;i>=0;--i)
        {
            System.out.print(sen.toString().charAt(i));
        }
    }
}
