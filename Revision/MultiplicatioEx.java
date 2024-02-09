package Revision;

import java.util.Scanner;

public class MultiplicatioEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, mul;

        System.out.print("Enter first number:");
        x = input.nextInt();

        System.out.print("Enter second number:");
        y = input.nextInt();

        mul = x * y;
        System.out.print("Total Multiplication: " + mul);
    }
}
