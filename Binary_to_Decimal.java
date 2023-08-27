package every_day;
public class Binary_to_Decimal {
    public static long desimal(int num)
    {
       long desi=0,i=0;
        long re;
        while (num!=0)
        {
             re=num%10;
            num/=10;
            desi+=re*Math.pow(2,i);
            ++i;
        }
        return desi;
    }
    public static void main(String[] args) {
        int num=1011;

        System.out.println( desimal(num));
    }
}
