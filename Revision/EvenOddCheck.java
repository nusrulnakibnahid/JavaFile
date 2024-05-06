package Revision;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.out.print("Enter a number: ");
        x = input.nextInt();

        if (x % 2 == 0) {

            System.out.println("Even number");
        }

        else {
            System.out.println("Odd number");
        }

    }
}