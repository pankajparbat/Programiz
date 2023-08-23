package every_dat;

import java.util.Scanner;

public class armstrongnumber {
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits= 0;
        while (num != 0) {
            num /= 10;
            numDigits++;
        }

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == originalNum;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}
