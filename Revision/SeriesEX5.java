package Revision;

import java.util.Scanner;

public class SeriesEX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, mul = 1;
        System.out.print("Enter last number:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " ");
            mul = mul * i;
        }

        System.out.println();
        System.out.print("Total:" +mul);

    }
}
