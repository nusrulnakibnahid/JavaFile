package Revision;

import java.util.Scanner;

public class Asg12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, sum = 0;
        System.out.print("Enter first number: ");
        m = input.nextInt();

        System.out.print("Enter second number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            if (i % 2!= 0) {
                sum += i;

            }

        }
        System.out.println("Sum of these odd numbers: " + sum);

    }
}
