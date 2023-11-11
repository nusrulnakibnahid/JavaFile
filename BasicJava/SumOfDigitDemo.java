package BasicJava;

import java.util.Scanner;

public class SumOfDigitDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, r, temp, num;  //r means reminder, temp means temporary variable
        System.out.print("Enter any digit:");
        num = input.nextInt();

        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }

        System.out.print("Sum of digits: " +sum);

    }
}
