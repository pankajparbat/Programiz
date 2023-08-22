package every_dat;

public class factorial_using_recurtion {
   static int factorial(int num)
    {
        int fcto=0;
        if (num!=0)
        {
          for (int i=1;i<=num;i++)x
          {
              fcto=i*factorial(num-1);
              return fcto;
          }
        }
        return fcto;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
