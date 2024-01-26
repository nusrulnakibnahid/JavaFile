package Revision;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, factorial = 1;
        System.out.print("Enter number:");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {

            System.out.print(i + " ");
            factorial = factorial * i;
        }

        System.out.println();
        System.out.print("Factorial of " + num + ":" + factorial);
    }
}
