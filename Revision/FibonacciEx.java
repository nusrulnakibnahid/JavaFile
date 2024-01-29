package Revision;

import java.util.Scanner;

public class FibonacciEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, first = 0, second = 1, fibo, total = 0;
        System.out.print("How many Fibonacci numbers you want?:");
        n = input.nextInt();

        System.out.print(first + " " + second);

        for (int i = 3; i <= n; i++) {

            fibo = first + second;
            first = second;
            second = fibo;

            System.out.print(" " + fibo);

        }

    }
}
