package programizexample;
public class reverse_a_number {
    public static void main(String[] args) {
        int num=67877;
        int rem1=0;
        while (num>0)
        {  int rem=num%10;
            rem1=(rem1*10)+rem;
            num=num/10;
        }
        System.out.println(rem1);
    }
}