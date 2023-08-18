package programizexample;

public class swaping {
    public static void main(String[] args) {
        int num1=9,num2=5;
        System.out.println( "fist :"+(num1));

        System.out.println( "Secound :"+(num2));
        int tem=0;
        tem=num1;
        System.out.println( "newfist :"+(num1=num2));

        System.out.println( "newsecound :"+(num2=tem));


    }
}
