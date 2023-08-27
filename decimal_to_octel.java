package every_day;

import java.util.Scanner;

public class decimal_to_octel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int i=1,octalNu=0;

            while (num != 0)
            {
                octalNu += (num % 8) * i;
                num /= 8;
                i *= 10;
            }

        System.out.println(octalNu);
    }
}
