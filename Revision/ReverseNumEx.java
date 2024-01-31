package Revision;

import java.util.Scanner;

public class ReverseNumEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, num, r, temp;
        System.out.print("Enter the number:");
        num = input.nextInt();

        temp = num;

        while (temp != 0) {

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }

        System.out.println("Reversing Number is: " + sum);
    }
}
