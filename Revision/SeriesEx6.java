package Revision;

import java.util.Scanner;

public class SeriesEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n, mul = 1;
        System.out.print("Enter last number:");
        n = input.nextDouble();

        for (double i = 1.5; i <= n; i++) {

            System.out.print(i + " ");
            mul = mul * i;

        }
        System.out.println();
        System.out.print("Total:" + mul);
    }
}
