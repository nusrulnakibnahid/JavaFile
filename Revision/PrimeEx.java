package Revision;

import java.util.Scanner;

public class PrimeEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, count = 0;
        System.out.print("Enter a positive number:");
        num = input.nextInt();

        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Prime number");

        } else {
            System.out.println("Not prime number");
        }

    }
}
