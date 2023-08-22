package programizexample;
public class cont_the_number_of_degits
{
    public static void main(String[] args)
    {
        int num=67877;
        int rem1=0;
        while (num>0)
        {
            int rem=num%10;
            rem1++;
            num=num/10;

        }
        System.out.println(rem1);
    }
}