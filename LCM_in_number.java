package every_dat;

public class LCM_in_number {
    public static void main(String[] args) {
        int num1=6,num2=9;
        int gcd=1;
        for (int i=1;i<=num1 &&i<=num2;i++)
        {
            if (num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);

    }
}
