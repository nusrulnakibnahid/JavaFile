package Revision;

import java.util.Scanner;

public class Asg13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, first = 0, second = 1;
        System.out.print("Which fibonacci number you want to see?: ");
        n = input.nextInt();

        for (int i = 3; i <= n; i++) {
            int fibo = first + second;
            first = second;
            second = fibo;

            if (n == i) {
                System.out.println("Fibonacci number is: " + fibo);

            }
        }

    }
}
