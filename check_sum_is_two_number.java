package every_dat;


public class check_sum_is_two_number {
    static  boolean check(int num)
    {
        int i;
        boolean isprime=true;
        for ( i=2;i<=num/2;i++){
            if (num%i==0)
            {
                isprime=false;
                break;
            }}
        if (num==i)
        {
            isprime=true;
        }
        return isprime;
    }
    public static void main(String[] args) {
       int number=34;
       boolean flag=false;

         for (int i=1;i<=number/2;i++)
         {
             if (check(i)) {
                 if (check(number - i)) {
                     System.out.println(number+"= "+i+" + "+(number-i));
                 }
             }
         }
      }


}
