package Revision;

import java.util.Scanner;

public class Asg14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        int sum = 0, totalPalindromeNumber = 0, m, n, r, temp;

        System.out.print("Enter first number: ");
        m = input.nextInt();

        System.out.print("Enter last number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            sum = 0;

            temp = i;

            while (temp != 0) {

                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;

            }

            if (sum == i) {
                System.out.println(" " + sum);
                totalPalindromeNumber++;

            }

        }
        System.out.println("Total numbers:" + totalPalindromeNumber);

    }
}
