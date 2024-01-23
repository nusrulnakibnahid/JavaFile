package Revision;

import java.util.Scanner;

public class Asg11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, fact = 1;

        System.out.println("Enter number:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);

    }
}
