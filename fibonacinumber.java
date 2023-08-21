package programizexample;

public class fibonacinumber {
    public static void main(String[] args) {
        int i=6,num1=0,num2=1;
        for (i=0;i<=7;i++)
        {
            System.out.print(num1+",");
            int next=num1+num2;
            num1=num2;
            num2=next;

        }
    }
}
