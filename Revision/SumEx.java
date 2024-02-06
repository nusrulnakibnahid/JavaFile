package Revision;

import java.util.Scanner;

public class SumEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, sum;
        System.out.print("Enter first number:");
        x = input.nextInt();
        System.out.print("Enter second number:");
        y = input.nextInt();

        sum = x + y;

        System.out.print("Total Sum: " + sum);

    }
}
