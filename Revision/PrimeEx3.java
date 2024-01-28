package Revision;

import java.util.Scanner;

public class PrimeEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, count = 0,total_prime=0;
        System.out.print("Enter first number:");
        m = input.nextInt();
        System.out.print("Enter second number:");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;

                }
            }
            if (count == 0) {
                System.out.println(i);
                total_prime++;
            }
            count = 0;



        }
        System.out.println("Total prime Number:"+total_prime);
    }
}
